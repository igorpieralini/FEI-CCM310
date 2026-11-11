
package me.pieralini.Aula9.BancoDeDados;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Cadastro extends JFrame {

    private final JTextField nome = new JTextField(20);
    private final JTextField usuario = new JTextField(20);
    private final JPasswordField senha = new JPasswordField(20);
    private final JTextArea resultados = new JTextArea();

    public Cadastro() {
        setTitle("Aula 9 - Cadastro de Alunos");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel formulario = new JPanel(new GridLayout(4, 2, 5, 5));

        JButton cadastrar = new JButton("Cadastrar");
        JButton consultar = new JButton("Consultar");

        formulario.add(new JLabel("Nome:"));
        formulario.add(nome);
        formulario.add(new JLabel("Usuário:"));
        formulario.add(usuario);
        formulario.add(new JLabel("Senha:"));
        formulario.add(senha);
        formulario.add(cadastrar);
        formulario.add(consultar);

        resultados.setEditable(false);

        cadastrar.addActionListener(evento -> cadastrarAluno());
        consultar.addActionListener(evento -> consultarAlunos());

        add(formulario, BorderLayout.NORTH);
        add(new JScrollPane(resultados), BorderLayout.CENTER);
    }

    private void cadastrarAluno() {
        String comando = """
                INSERT INTO alunos (nome, usuario, senha)
                VALUES (?, ?, ?)
                """;

        try (Connection conexao = Conexao.conectar();
             PreparedStatement consulta = conexao.prepareStatement(comando)) {

            consulta.setString(1, nome.getText());
            consulta.setString(2, usuario.getText());
            consulta.setString(3, new String(senha.getPassword()));

            consulta.executeUpdate();

            JOptionPane.showMessageDialog(this, "Aluno cadastrado.");

        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(this, excecao.getMessage());
        }
    }

    private void consultarAlunos() {
        String comando = "SELECT nome, usuario FROM alunos ORDER BY nome";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement consulta = conexao.prepareStatement(comando);
             ResultSet dados = consulta.executeQuery()) {

            resultados.setText("");

            while (dados.next()) {
                resultados.append(
                        dados.getString("nome") + " - "
                                + dados.getString("usuario") + "\n"
                );
            }

        } catch (SQLException excecao) {
            JOptionPane.showMessageDialog(this, excecao.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new Cadastro().setVisible(true)
        );
    }
}
