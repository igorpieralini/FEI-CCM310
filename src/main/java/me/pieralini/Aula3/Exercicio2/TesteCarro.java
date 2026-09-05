package me.pieralini.Aula3.Exercicio2;

public class TesteCarro {
    public static void main(String[] args) {

        Carro c1 = new Carro();

        Carro c2 = new Carro("Civic", "Prata", 2020);

        Carro c3 = new Carro("Corolla", "Preto", 2022, 145000.0, 15000.0);

        c1.setPreco(80000.0);
        c1.setKm(50000.0);
        c1.setModelo("Gol");
        c1.setCor("Branco");
        c1.setAno(2015);

        System.out.println("--- Carro 1 ---");
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Ano: " + c1.getAno());
        System.out.println("Preco: " + c1.getPreco());
        System.out.println("Km: " + c1.getKm());

        System.out.println("\n--- Carro 2 ---");
        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Cor: " + c2.getCor());
        System.out.println("Ano: " + c2.getAno());
        System.out.println("Preco: " + c2.getPreco());
        System.out.println("Km: " + c2.getKm());

        System.out.println("\n--- Carro 3 ---");
        System.out.println("Modelo: " + c3.getModelo());
        System.out.println("Cor: " + c3.getCor());
        System.out.println("Ano: " + c3.getAno());
        System.out.println("Preco: " + c3.getPreco());
        System.out.println("Km: " + c3.getKm());
    }
}