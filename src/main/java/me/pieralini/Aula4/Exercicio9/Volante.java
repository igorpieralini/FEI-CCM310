package me.pieralini.Aula4.Exercicio9;

public class Volante {
    private String material;
    private boolean multifuncional;

    public Volante(String material, boolean multifuncional) {
        this.material = material;
        this.multifuncional = multifuncional;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isMultifuncional() {
        return multifuncional;
    }

    public void setMultifuncional(boolean multifuncional) {
        this.multifuncional = multifuncional;
    }

    @Override
    public String toString() {
        return "Volante [material=" + material + ", multifuncional=" + multifuncional + "]";
    }
}
