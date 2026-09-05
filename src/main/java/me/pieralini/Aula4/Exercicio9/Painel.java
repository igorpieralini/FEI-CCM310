package me.pieralini.Aula4.Exercicio9;

public class Painel {
    private String tipo;
    private boolean digital;

    public Painel(String tipo, boolean digital) {
        this.tipo = tipo;
        this.digital = digital;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    @Override
    public String toString() {
        return "Painel [tipo=" + tipo + ", digital=" + digital + "]";
    }
}