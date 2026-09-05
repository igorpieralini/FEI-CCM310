package me.pieralini.Aula2.Exercicio2;

import java.util.Scanner;

public class SwapperDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Swapper troca = new Swapper();

        System.out.print("Digite o valor de x: ");
        float x = scanner.nextFloat();

        System.out.print("Digite o valor de y: ");
        float y = scanner.nextFloat();

        troca.setX(x);
        troca.setY(y);

        System.out.println("\nAntes da troca:");
        System.out.println("x = " + troca.getX());
        System.out.println("y = " + troca.getY());

        troca.swap();

        System.out.println("\nDepois da troca:");
        System.out.println("x = " + troca.getX());
        System.out.println("y = " + troca.getY());

        scanner.close();
    }
}