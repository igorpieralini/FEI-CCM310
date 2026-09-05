package me.pieralini.Aula4.Exercicio7;

public class Matematica {

    public static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static boolean impar(boolean a, boolean b, boolean c) {
        return a ^ b ^ c;
    }

    public static boolean maioria(boolean a, boolean b, boolean c) {
        return (a && b) || (b && c) || (a && c);
    }
}