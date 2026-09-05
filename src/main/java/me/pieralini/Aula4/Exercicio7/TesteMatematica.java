package me.pieralini.Aula4.Exercicio7;

public class TesteMatematica {
    public static void main(String[] args) {

        System.out.println("--- Teste max3 ---");
        System.out.println("max3(5, 12, 8) = " + Matematica.max3(5, 12, 8));
        System.out.println("max3(20, 3, 15) = " + Matematica.max3(20, 3, 15));
        System.out.println("max3(-1, -5, -3) = " + Matematica.max3(-1, -5, -3));
        System.out.println("max3(7, 7, 7) = " + Matematica.max3(7, 7, 7));

        System.out.println("\n--- Teste impar ---");
        System.out.println("impar(true, false, false) = " + Matematica.impar(true, false, false));
        System.out.println("impar(true, true, false) = " + Matematica.impar(true, true, false));
        System.out.println("impar(true, true, true) = " + Matematica.impar(true, true, true));
        System.out.println("impar(false, false, false) = " + Matematica.impar(false, false, false));

        System.out.println("\n--- Teste maioria ---");
        System.out.println("maioria(true, true, false) = " + Matematica.maioria(true, true, false));
        System.out.println("maioria(true, false, false) = " + Matematica.maioria(true, false, false));
        System.out.println("maioria(true, true, true) = " + Matematica.maioria(true, true, true));
        System.out.println("maioria(false, false, false) = " + Matematica.maioria(false, false, false));
    }
}
