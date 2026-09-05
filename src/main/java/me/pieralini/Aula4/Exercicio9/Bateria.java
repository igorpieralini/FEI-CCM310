package me.pieralini.Aula4.Exercicio9;

public class Bateria {
    private double voltagem;
    private String marca;

    public Bateria(double voltagem, String marca) {
        this.voltagem = voltagem;
        this.marca = marca;
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Bateria [voltagem=" + voltagem + ", marca=" + marca + "]";
    }
}