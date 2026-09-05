package me.pieralini.Aula4.Exercicio9;

public class Retrovisor {
    private String posicao;
    private boolean eletrico;

    public Retrovisor(String posicao, boolean eletrico) {
        this.posicao = posicao;
        this.eletrico = eletrico;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }

    @Override
    public String toString() {
        return "Retrovisor [posicao=" + posicao + ", eletrico=" + eletrico + "]";
    }
}