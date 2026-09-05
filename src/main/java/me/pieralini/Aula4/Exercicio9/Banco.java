package me.pieralini.Aula4.Exercicio9;

public class Banco {
    private String material;
    private boolean aquecido;

    public Banco(String material, boolean aquecido) {
        this.material = material;
        this.aquecido = aquecido;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAquecido() {
        return aquecido;
    }

    public void setAquecido(boolean aquecido) {
        this.aquecido = aquecido;
    }

    @Override
    public String toString() {
        return "Banco [material=" + material + ", aquecido=" + aquecido + "]";
    }
}
