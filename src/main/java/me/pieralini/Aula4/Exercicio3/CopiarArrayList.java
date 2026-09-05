package me.pieralini.Aula4.Exercicio3;

import java.util.ArrayList;

public class CopiarArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Joao");
        lista1.add("Maria");
        lista1.add("Pedro");
        lista1.add("Ana");

        ArrayList<String> lista2 = new ArrayList<>(lista1);

        System.out.println("Lista 1 (original): " + lista1);
        System.out.println("Lista 2 (copia): " + lista2);

        lista2.add("Carlos");

        System.out.println("\nApos adicionar 'Carlos' na lista 2:");
        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);
    }
}