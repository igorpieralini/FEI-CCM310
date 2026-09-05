package me.pieralini.Aula4.Exercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> agenda = new ArrayList<>();
        String opcao;

        while (true) {
            System.out.println("\nEntre com uma das seguintes opcoes:");
            System.out.println("  n [nova entrada]");
            System.out.println("  d [apaga registro da agenda]");
            System.out.println("  p [imprime toda a agenda]");
            System.out.println("  q [sai do programa]");

            opcao = scanner.nextLine();

            if (opcao.equals("n")) {
                System.out.println("Entre com o nome:");
                String nome = scanner.nextLine();
                System.out.println("Entre com o telefone:");
                String telefone = scanner.nextLine();

                agenda.add(new Pessoa(nome, telefone));

            } else if (opcao.equals("d")) {
                System.out.println("Entre com o nome da pessoa a ser excluida:");
                String nomeBusca = scanner.nextLine();

                Pessoa pessoaEncontrada = null;
                for (Pessoa p : agenda) {
                    if (p.getNome().equals(nomeBusca)) {
                        pessoaEncontrada = p;
                        break;
                    }
                }

                if (pessoaEncontrada != null) {
                    agenda.remove(pessoaEncontrada);
                    System.out.println("Pessoa removida com sucesso.");
                } else {
                    System.out.println("Pessoa nao encontrada na agenda.");
                }

            } else if (opcao.equals("p")) {
                System.out.println("--- Agenda ---");
                if (agenda.isEmpty()) {
                    System.out.println("Agenda vazia.");
                } else {
                    for (Pessoa p : agenda) {
                        System.out.println(p);
                    }
                }

            } else if (opcao.equals("q")) {
                System.out.println("Saindo do programa...");
                break;

            } else {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}