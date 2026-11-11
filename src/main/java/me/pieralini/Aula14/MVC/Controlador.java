
package me.pieralini.Aula14.MVC;

import javax.swing.SwingUtilities;

public class Controlador {

    private final Modelo modelo;
    private final Visao visao;

    public Controlador(Modelo modelo, Visao visao) {
        this.modelo = modelo;
        this.visao = visao;

        visao.adicionarEvento(evento -> calcular());
    }

    private void calcular() {
        try {
            modelo.setPrimeiro(visao.getPrimeiro());
            modelo.setSegundo(visao.getSegundo());

            visao.mostrarResultado(modelo.somar());

        } catch (NumberFormatException excecao) {
            visao.mostrarErro("Digite números válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Modelo modelo = new Modelo();
            Visao visao = new Visao();

            new Controlador(modelo, visao);

            visao.setVisible(true);
        });
    }
}
