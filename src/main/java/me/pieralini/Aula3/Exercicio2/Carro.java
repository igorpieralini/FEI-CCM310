package me.pieralini.Aula3.Exercicio2;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private double preco;
    private double km;

    public Carro() {
        this.modelo = "Nao informado";
        this.cor = "Nao informada";
        this.ano = 0;
        this.preco = 0.0;
        this.km = 0.0;
    }

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = 0.0;
        this.km = 0.0;
    }

    public Carro(String modelo, String cor, int ano, double preco, double km) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.km = km;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public double getKm() {
        return km;
    }
}