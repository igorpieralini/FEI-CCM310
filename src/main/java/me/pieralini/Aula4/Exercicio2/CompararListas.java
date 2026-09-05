package me.pieralini.Aula4.Exercicio2;

import java.util.ArrayList;

public class CompararListas {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelho");
        lista1.add("Azul");
        lista1.add("Verde");
        lista1.add("Amarelo");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Amarelo");
        lista2.add("Verde");
        lista2.add("Vermelho");
        lista2.add("Azul");

        System.out.println("Lista 1: " + lista1);
        System.out.println("Lista 2: " + lista2);

        boolean mesmoConteudo = comparar(lista1, lista2);

        if (mesmoConteudo) {
            System.out.println("\nAs listas possuem o mesmo conteudo (ignorando a ordem).");
        } else {
            System.out.println("\nAs listas NAO possuem o mesmo conteudo.");
        }
    }

    public static boolean comparar(ArrayList<String> lista1, ArrayList<String> lista2) {
        if (lista1.size() != lista2.size()) {
            return false;
        }

        return lista1.containsAll(lista2) && lista2.containsAll(lista1);
    }
}