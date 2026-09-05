package me.pieralini.Aula4.Exercicio1;

public class Laser {
    private String fabricante;
    private double alcance;
    private double precisao;
    private double medida;

    public Laser() {
    }

    public Laser(String fabricante, double alcance, double precisao) {
        this.fabricante = fabricante;
        this.alcance = alcance;
        this.precisao = precisao;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public void setPrecisao(double precisao) {
        this.precisao = precisao;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getAlcance() {
        return alcance;
    }

    public double getPrecisao() {
        return precisao;
    }

    public double getMedida() {
        return medida;
    }
}