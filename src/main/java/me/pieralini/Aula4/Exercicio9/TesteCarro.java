package me.pieralini.Aula4.Exercicio9;

import java.util.ArrayList;

public class TesteCarro {
    public static void main(String[] args) {

        ArrayList<Carro> carros = new ArrayList<>();

        Carro carro1 = new Carro("Civic", "Prata",
                new Motor(2.0, "Flex"),
                new Volante("Couro", true),
                new Painel("Digital", true),
                new Cambio("Automatico", 6),
                new Bateria(12.0, "Moura"));

        for (int i = 0; i < 4; i++) {
            carro1.adicionarRoda(new Roda("Pirelli", 17));
        }

        String[] posicoesPorta = {"Dianteira Esquerda", "Dianteira Direita", "Traseira Esquerda", "Traseira Direita"};

        for (String pos : posicoesPorta) {
            carro1.adicionarPorta(new Porta(pos, true));
        }

        for (int i = 0; i < 5; i++) {
            carro1.adicionarBanco(new Banco("Couro", true));
        }

        carro1.adicionarFarol(new Farol("LED", "Esquerdo"));
        carro1.adicionarFarol(new Farol("LED", "Direito"));
        carro1.adicionarRetrovisor(new Retrovisor("Esquerdo", true));
        carro1.adicionarRetrovisor(new Retrovisor("Direito", true));

        Carro carro2 = new Carro("Corolla", "Preto",
                new Motor(1.8, "Hibrido"),
                new Volante("Couro", true),
                new Painel("Digital", true),
                new Cambio("CVT", 1),
                new Bateria(12.0, "Heliar"));

        for (int i = 0; i < 4; i++) {
            carro2.adicionarRoda(new Roda("Michelin", 16));
        }

        for (String pos : posicoesPorta) {
            carro2.adicionarPorta(new Porta(pos, true));
        }

        for (int i = 0; i < 5; i++) {
            carro2.adicionarBanco(new Banco("Tecido", false));
        }

        carro2.adicionarFarol(new Farol("Xenon", "Esquerdo"));
        carro2.adicionarFarol(new Farol("Xenon", "Direito"));
        carro2.adicionarRetrovisor(new Retrovisor("Esquerdo", true));
        carro2.adicionarRetrovisor(new Retrovisor("Direito", true));

        Carro carro3 = new Carro("Gol", "Branco",
                new Motor(1.0, "Flex"),
                new Volante("Plastico", false),
                new Painel("Analogico", false),
                new Cambio("Manual", 5),
                new Bateria(12.0, "Bosch"));

        for (int i = 0; i < 4; i++) {
            carro3.adicionarRoda(new Roda("Goodyear", 14));
        }

        for (String pos : posicoesPorta) {
            carro3.adicionarPorta(new Porta(pos, false));
        }

        for (int i = 0; i < 5; i++) {
            carro3.adicionarBanco(new Banco("Tecido", false));
        }

        carro3.adicionarFarol(new Farol("Halogeno", "Esquerdo"));
        carro3.adicionarFarol(new Farol("Halogeno", "Direito"));
        carro3.adicionarRetrovisor(new Retrovisor("Esquerdo", false));
        carro3.adicionarRetrovisor(new Retrovisor("Direito", false));

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        for (Carro c : carros) {
            System.out.println(c);
        }
    }
}