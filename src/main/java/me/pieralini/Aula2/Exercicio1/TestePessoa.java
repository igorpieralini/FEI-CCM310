package me.pieralini.Aula2.Exercicio1;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();


        System.out.println("--- Dados da Pessoa 1 ---");

        System.out.print("Digite o CPF: ");
        String cpf1 = scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade1 = scanner.nextInt();

        scanner.nextLine();

        p1.setCpf(cpf1);
        p1.setNome(nome1);
        p1.setIdade(idade1);

        System.out.println("--- Dados da Pessoa 2 ---");

        System.out.print("Digite o CPF: ");
        String cpf2 = scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome2 = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade2 = scanner.nextInt();

        scanner.nextLine();

        p2.setCpf(cpf2);
        p2.setNome(nome2);
        p2.setIdade(idade2);

        System.out.println("--- Dados da Pessoa 3 ---");

        System.out.print("Digite o CPF: ");
        String cpf3 = scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome3 = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade3 = scanner.nextInt();

        scanner.nextLine();

        p3.setCpf(cpf3);
        p3.setNome(nome3);
        p3.setIdade(idade3);

        System.out.println("\n--- Resultado ---");

        System.out.println("Pessoa 1:");
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

        System.out.println("\nPessoa 2:");
        System.out.println("CPF: " + p2.getCpf());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());

        System.out.println("\nPessoa 3:");
        System.out.println("CPF: " + p3.getCpf());
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Idade: " + p3.getIdade());

        scanner.close();
    }
}