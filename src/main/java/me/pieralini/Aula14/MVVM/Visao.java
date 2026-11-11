
package me.pieralini.Aula14.MVVM;

import javax.swing.*;
import java.awt.*;

public class Visao extends JFrame {

    private final ViewModel viewModel;
    private final JTextField campoNome = new JTextField(20);
    private final JLabel nomeAtual = new JLabel();

    public Visao(ViewModel viewModel) {
        this.viewModel = viewModel;

        setTitle("MVVM - Cadastro");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 5, 5));

        JButton atualizar = new JButton("Atualizar nome");

        nomeAtual.setText("Nome: " + viewModel.getNome());

        atualizar.addActionListener(evento ->
                viewModel.atualizarNome(campoNome.getText())
        );

        viewModel.adicionarObservador(evento -> {
            if ("nome".equals(evento.getPropertyName())) {
                nomeAtual.setText("Nome: " + evento.getNewValue());
            }
        });

        add(campoNome);
        add(atualizar);
        add(nomeAtual);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Modelo modelo = new Modelo("Aluno FEI");
            ViewModel viewModel = new ViewModel(modelo);

            new Visao(viewModel).setVisible(true);
        });
    }
}
