
package me.pieralini.Aula9.Datilografia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Datilografia extends JFrame {

    private final JTextArea areaTexto = new JTextArea(4, 40);
    private final JLabel frase = new JLabel();
    private final JLabel desempenho = new JLabel();
    private final Map<Integer, JButton> teclas = new HashMap<>();
    private final Map<Integer, Color> cores = new HashMap<>();
    private final ArrayList<String> frases = new ArrayList<>();

    private String fraseAtual;
    private int acertos;
    private int erros;
    private int backspaces;

    public Datilografia() {
        setTitle("Aula 9 - Tutor de Datilografia");
        setSize(950, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frases.add("the quick brown fox jumps over the lazy dog");
        frases.add("pack my box with five dozen liquor jugs");
        frases.add("sphinx of black quartz judge my vow");

        JPanel superior = new JPanel(new GridLayout(3, 1));
        superior.add(frase);
        superior.add(desempenho);
        superior.add(new JLabel("Digite a frase sem olhar para o teclado"));

        JPanel teclado = new JPanel(new GridLayout(4, 1, 5, 5));

        adicionarLinha(teclado, "QWERTYUIOP");
        adicionarLinha(teclado, "ASDFGHJKL");
        adicionarLinha(teclado, "ZXCVBNM");

        JPanel ultimaLinha = new JPanel();
        JButton espaco = new JButton("ESPAÇO");
        espaco.setFocusable(false);
        espaco.setEnabled(false);
        ultimaLinha.add(espaco);
        teclas.put(KeyEvent.VK_SPACE, espaco);
        cores.put(KeyEvent.VK_SPACE, espaco.getBackground());
        teclado.add(ultimaLinha);

        JButton novaFrase = new JButton("Nova frase");
        novaFrase.addActionListener(evento -> sortearFrase());

        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);

        areaTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evento) {
                destacar(evento.getKeyCode(), true);

                if (evento.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    backspaces++;
                    atualizarDesempenho();
                }
            }

            @Override
            public void keyReleased(KeyEvent evento) {
                destacar(evento.getKeyCode(), false);
            }

            @Override
            public void keyTyped(KeyEvent evento) {
                char caractere = evento.getKeyChar();

                if (Character.isISOControl(caractere)) {
                    return;
                }

                int posicao = areaTexto.getCaretPosition();

                if (posicao < fraseAtual.length()
                        && caractere == fraseAtual.charAt(posicao)) {
                    acertos++;
                } else {
                    erros++;
                }

                atualizarDesempenho();

                SwingUtilities.invokeLater(() -> {
                    if (areaTexto.getText().length() >= fraseAtual.length()) {
                        verificarFrase();
                    }
                });
            }
        });

        add(superior, BorderLayout.NORTH);
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        JPanel inferior = new JPanel(new BorderLayout());
        inferior.add(teclado, BorderLayout.CENTER);
        inferior.add(novaFrase, BorderLayout.SOUTH);

        add(inferior, BorderLayout.SOUTH);

        sortearFrase();
    }

    private void adicionarLinha(JPanel teclado, String caracteres) {
        JPanel linha = new JPanel(new FlowLayout());

        for (char caractere : caracteres.toCharArray()) {
            JButton botao = new JButton(String.valueOf(caractere));
            botao.setFocusable(false);
            botao.setEnabled(false);

            int codigo = KeyEvent.getExtendedKeyCodeForChar(caractere);

            teclas.put(codigo, botao);
            cores.put(codigo, botao.getBackground());

            linha.add(botao);
        }

        teclado.add(linha);
    }

    private void destacar(int codigo, boolean pressionado) {
        JButton botao = teclas.get(codigo);

        if (botao != null) {
            botao.setBackground(
                    pressionado ? Color.YELLOW : cores.get(codigo)
            );
        }
    }

    private void atualizarDesempenho() {
        desempenho.setText(
                "Acertos: " + acertos
                        + " | Erros: " + erros
                        + " | Backspace: " + backspaces
        );
    }

    private void sortearFrase() {
        Random sorteador = new Random();
        fraseAtual = frases.get(sorteador.nextInt(frases.size()));

        frase.setText("Frase: " + fraseAtual);
        areaTexto.setText("");

        acertos = 0;
        erros = 0;
        backspaces = 0;

        atualizarDesempenho();
        areaTexto.requestFocusInWindow();
    }

    private void verificarFrase() {
        boolean correta = areaTexto.getText().equals(fraseAtual);

        String mensagem = correta
                ? "Frase concluída corretamente!"
                : "A frase está incorreta e precisa ser corrigida.";

        JOptionPane.showMessageDialog(
                this,
                mensagem + "\nErros: " + erros
                        + "\nBackspaces: " + backspaces
        );

        if (correta) {
            sortearFrase();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new Datilografia().setVisible(true)
        );
    }
}
