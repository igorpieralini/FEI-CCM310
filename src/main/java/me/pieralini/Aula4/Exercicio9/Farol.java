package me.pieralini.Aula4.Exercicio9;

public class Farol {
    private String tipo;
    private String posicao;

    public Farol(String tipo, String posicao) {
        this.tipo = tipo;
        this.posicao = posicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Farol [tipo=" + tipo + ", posicao=" + posicao + "]";
    }
}