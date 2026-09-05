package me.pieralini.Aula4.Exercicio9;

public class Porta {
    private String posicao;
    private boolean travada;

    public Porta(String posicao, boolean travada) {
        this.posicao = posicao;
        this.travada = travada;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean isTravada() {
        return travada;
    }

    public void setTravada(boolean travada) {
        this.travada = travada;
    }

    @Override
    public String toString() {
        return "Porta [posicao=" + posicao + ", travada=" + travada + "]";
    }
}