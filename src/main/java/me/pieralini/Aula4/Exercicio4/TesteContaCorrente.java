package me.pieralini.Aula4.Exercicio4;

import java.util.ArrayList;

/**
 * Classe de teste responsavel por criar um {@link ArrayList} contendo
 * dez objetos {@link ContaCorrente} e demonstrar o uso dos metodos
 * {@code setSaldo}, {@code getSaldo}, {@code depositar} e {@code sacar}.
 *
 * @author Exercicio de POO
 * @version 1.0
 */
public class TesteContaCorrente {

    /**
     * Metodo principal do programa.
     *
     * @param args argumentos de linha de comando (nao utilizados)
     */
    public static void main(String[] args) {

        ArrayList<ContaCorrente> contas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            contas.add(new ContaCorrente());
        }

        for (int i = 0; i < contas.size(); i++) {
            contas.get(i).setSaldo((i + 1) * 100.0);
        }

        System.out.println("--- Saldos apos setSaldo ---");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Conta " + (i + 1) + ": R$ " + contas.get(i).getSaldo());
        }

        for (int i = 0; i < contas.size(); i++) {
            contas.get(i).depositar(50.0);
        }

        System.out.println("\n--- Saldos apos depositar 50.0 em cada conta ---");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Conta " + (i + 1) + ": R$ " + contas.get(i).getSaldo());
        }

        for (int i = 0; i < contas.size(); i++) {
            boolean sucesso = contas.get(i).sacar(30.0);
            if (!sucesso) {
                System.out.println("Falha ao sacar da conta " + (i + 1));
            }
        }

        System.out.println("\n--- Saldos apos sacar 30.0 de cada conta ---");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println("Conta " + (i + 1) + ": R$ " + contas.get(i).getSaldo());
        }

        System.out.println("\n--- Teste de saque com valor maior que o saldo ---");
        boolean resultado = contas.get(0).sacar(999999.0);
        System.out.println("Saque de valor alto na conta 1 foi bem-sucedido? " + resultado);
    }
}