
package me.pieralini.Aula9.Desenho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class Desenho extends JFrame {

    private final PainelDesenho painel;
    private final JComboBox<String> ferramentas;
    private final JSlider espessura;
    private final JTextField campoTexto;

    public Desenho() {
        setTitle("Aula 9 - Aplicativo de Desenho");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        painel = new PainelDesenho();

        ferramentas = new JComboBox<>(new String[]{
                "Linha", "Retângulo", "Círculo", "Texto"
        });

        espessura = new JSlider(1, 20, 3);
        campoTexto = new JTextField(12);

        JButton botaoCor = new JButton("Cor");
        JButton botaoLimpar = new JButton("Limpar");

        JPanel controles = new JPanel();
        controles.add(ferramentas);
        controles.add(new JLabel("Espessura:"));
        controles.add(espessura);
        controles.add(campoTexto);
        controles.add(botaoCor);
        controles.add(botaoLimpar);

        botaoCor.addActionListener(evento -> {
            Color cor = JColorChooser.showDialog(
                    this, "Escolha uma cor", painel.cor
            );

            if (cor != null) {
                painel.cor = cor;
            }
        });

        botaoLimpar.addActionListener(evento -> painel.limpar());

        add(controles, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);
    }

    private class PainelDesenho extends JPanel {

        private BufferedImage imagem;
        private Point inicio;
        private Color cor = Color.BLACK;

        public PainelDesenho() {
            setBackground(Color.WHITE);

            MouseAdapter mouse = new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent evento) {
                    inicio = evento.getPoint();
                }

                @Override
                public void mouseReleased(MouseEvent evento) {
                    desenhar(inicio, evento.getPoint());
                }
            };

            addMouseListener(mouse);
        }

        private void prepararImagem() {
            if (imagem != null) {
                return;
            }

            imagem = new BufferedImage(
                    Math.max(getWidth(), 1),
                    Math.max(getHeight(), 1),
                    BufferedImage.TYPE_INT_ARGB
            );

            Graphics2D grafico = imagem.createGraphics();
            grafico.setColor(Color.WHITE);
            grafico.fillRect(0, 0, imagem.getWidth(), imagem.getHeight());
            grafico.dispose();
        }

        private void desenhar(Point inicio, Point fim) {
            if (inicio == null) {
                return;
            }

            prepararImagem();

            Graphics2D grafico = imagem.createGraphics();
            grafico.setColor(cor);
            grafico.setStroke(new BasicStroke(espessura.getValue()));

            int x = Math.min(inicio.x, fim.x);
            int y = Math.min(inicio.y, fim.y);
            int largura = Math.abs(fim.x - inicio.x);
            int altura = Math.abs(fim.y - inicio.y);

            String ferramenta = (String) ferramentas.getSelectedItem();

            switch (ferramenta) {
                case "Linha" ->
                        grafico.drawLine(inicio.x, inicio.y, fim.x, fim.y);
                case "Retângulo" ->
                        grafico.drawRect(x, y, largura, altura);
                case "Círculo" ->
                        grafico.drawOval(x, y, largura, altura);
                case "Texto" -> {
                    grafico.setFont(new Font(
                            "Arial", Font.PLAIN, 14 + espessura.getValue()
                    ));
                    grafico.drawString(campoTexto.getText(), fim.x, fim.y);
                }
            }

            grafico.dispose();
            repaint();
        }

        private void limpar() {
            imagem = null;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics grafico) {
            super.paintComponent(grafico);

            if (imagem != null) {
                grafico.drawImage(imagem, 0, 0, null);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Desenho().setVisible(true));
    }
}