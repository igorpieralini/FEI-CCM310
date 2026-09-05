package me.pieralini.Aula4.Exercicio5;

import java.util.ArrayList;

public class TesteXadrez {
    public static void main(String[] args) {

        ArrayList<Peca> pecas = new ArrayList<>();

        char[] colunas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        for (int i = 0; i < 8; i++) {
            pecas.add(new Peca("Peao", "Branca", colunas[i] + "2"));
        }
        for (int i = 0; i < 8; i++) {
            pecas.add(new Peca("Peao", "Preta", colunas[i] + "7"));
        }

        pecas.add(new Peca("Torre", "Branca", "a1"));
        pecas.add(new Peca("Torre", "Branca", "h1"));
        pecas.add(new Peca("Torre", "Preta", "a8"));
        pecas.add(new Peca("Torre", "Preta", "h8"));

        pecas.add(new Peca("Cavalo", "Branca", "b1"));
        pecas.add(new Peca("Cavalo", "Branca", "g1"));
        pecas.add(new Peca("Cavalo", "Preta", "b8"));
        pecas.add(new Peca("Cavalo", "Preta", "g8"));

        pecas.add(new Peca("Bispo", "Branca", "c1"));
        pecas.add(new Peca("Bispo", "Branca", "f1"));
        pecas.add(new Peca("Bispo", "Preta", "c8"));
        pecas.add(new Peca("Bispo", "Preta", "f8"));

        pecas.add(new Peca("Rainha", "Branca", "d1"));
        pecas.add(new Peca("Rainha", "Preta", "d8"));

        pecas.add(new Peca("Rei", "Branca", "e1"));
        pecas.add(new Peca("Rei", "Preta", "e8"));

        System.out.println("Total de pecas: " + pecas.size());

        String posicaoBusca = "a7";
        Peca pecaEncontrada = null;

        for (Peca p : pecas) {
            if (p.getPosicao().equals(posicaoBusca)) {
                pecaEncontrada = p;
                break;
            }
        }

        if (pecaEncontrada != null) {
            pecas.remove(pecaEncontrada);
            System.out.println("Peca removida: " + pecaEncontrada);
        } else {
            System.out.println("Nenhuma peca encontrada na posicao " + posicaoBusca);
        }

        System.out.println("\n--- Pecas restantes (" + pecas.size() + ") ---");
        for (Peca p : pecas) {
            System.out.println(p);
        }
    }
}