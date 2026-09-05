package me.pieralini.Aula4.Exercicio6;

import java.util.ArrayList;

public class TesteEstudante {
    public static void main(String[] args) {

        ArrayList<Estudante> turma = new ArrayList<>();

        String[] nomes = {
                "Ana", "Bruno", "Carla", "Diego", "Elaine", "Fabio", "Gabriela", "Hugo",
                "Isabela", "Joao", "Karina", "Lucas", "Marina", "Nelson", "Olivia", "Paulo",
                "Quiteria", "Rafael", "Sabrina", "Thiago", "Ursula", "Vitor", "Wanda", "Xavier",
                "Yasmin", "Zeca", "Aline", "Breno", "Camila", "Daniel"
        };

        String[] sobrenomes = {
                "Silva", "Souza", "Costa", "Pereira", "Oliveira", "Santos", "Almeida", "Ribeiro",
                "Carvalho", "Gomes", "Martins", "Araujo", "Melo", "Barbosa", "Rocha", "Dias",
                "Nunes", "Correia", "Teixeira", "Fernandes", "Lopes", "Marques", "Cardoso", "Reis",
                "Pinto", "Ramos", "Vieira", "Moreira", "Cavalcante", "Freitas"
        };

        for (int i = 0; i < 30; i++) {
            turma.add(new Estudante(nomes[i], sobrenomes[i]));
        }

        System.out.println("--- Lista de estudantes da turma ---");
        for (Estudante e : turma) {
            System.out.println(e);
        }

        System.out.println("\nTotal de estudantes cadastrados: " + turma.size());
        System.out.println("Proximo ID disponivel: " + Estudante.getProximoId());
    }
}