
package me.pieralini.Aula14.MVC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Visao extends JFrame {

    private final JTextField primeiro = new JTextField(10);
    private final JTextField segundo = new JTextField(10);
    private final JButton calcular = new JButton("Calcular");
    private final JLabel resultado = new JLabel("Resultado: ");

    public Visao() {
        setTitle("MVC - Calculadora");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Primeiro número:"));
        add(primeiro);
        add(new JLabel("Segundo número:"));
        add(segundo);
        add(calcular);
        add(resultado);
    }

    public int getPrimeiro() {
        return Integer.parseInt(primeiro.getText());
    }

    public int getSegundo() {
        return Integer.parseInt(segundo.getText());
    }

    public void mostrarResultado(int valor) {
        resultado.setText("Resultado: " + valor);
    }

    public void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem);
    }

    public void adicionarEvento(ActionListener evento) {
        calcular.addActionListener(evento);
    }
}
