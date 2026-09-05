package me.pieralini.Aula4.Exercicio9;

public class Roda {
    private String marca;
    private int aro;

    public Roda(String marca, int aro) {
        this.marca = marca;
        this.aro = aro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    @Override
    public String toString() {
        return "Roda [marca=" + marca + ", aro=" + aro + "]";
    }
}