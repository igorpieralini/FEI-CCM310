package me.pieralini.Aula4.Exercicio9;

public class Cambio {
    private String tipo;
    private int marchas;

    public Cambio(String tipo, int marchas) {
        this.tipo = tipo;
        this.marchas = marchas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    @Override
    public String toString() {
        return "Cambio [tipo=" + tipo + ", marchas=" + marchas + "]";
    }
}
