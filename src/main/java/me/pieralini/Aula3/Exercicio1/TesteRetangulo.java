package me.pieralini.Aula3.Exercicio1;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(2.0, 2.0, 2.0, 8.0, 10.0, 2.0, 10.0, 8.0);

        System.out.println("Comprimento: " + r.getComprimento());
        System.out.println("Largura: " + r.getLargura());
        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println("Area: " + r.getArea());
    }
}