package me.pieralini.Aula4.Exercicio9;

import java.util.ArrayList;

public class Carro {
    private String modelo;
    private String cor;
    private Motor motor;
    private Volante volante;
    private Painel painel;
    private Cambio cambio;
    private Bateria bateria;
    private ArrayList<Roda> rodas;
    private ArrayList<Porta> portas;
    private ArrayList<Banco> bancos;
    private ArrayList<Farol> farois;
    private ArrayList<Retrovisor> retrovisores;

    public Carro(String modelo, String cor, Motor motor, Volante volante, Painel painel,
                 Cambio cambio, Bateria bateria) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.volante = volante;
        this.painel = painel;
        this.cambio = cambio;
        this.bateria = bateria;
        this.rodas = new ArrayList<>();
        this.portas = new ArrayList<>();
        this.bancos = new ArrayList<>();
        this.farois = new ArrayList<>();
        this.retrovisores = new ArrayList<>();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Volante getVolante() {
        return volante;
    }

    public void setVolante(Volante volante) {
        this.volante = volante;
    }

    public Painel getPainel() {
        return painel;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public ArrayList<Roda> getRodas() {
        return rodas;
    }

    public void adicionarRoda(Roda roda) {
        this.rodas.add(roda);
    }

    public ArrayList<Porta> getPortas() {
        return portas;
    }

    public void adicionarPorta(Porta porta) {
        this.portas.add(porta);
    }

    public ArrayList<Banco> getBancos() {
        return bancos;
    }

    public void adicionarBanco(Banco banco) {
        this.bancos.add(banco);
    }

    public ArrayList<Farol> getFarois() {
        return farois;
    }

    public void adicionarFarol(Farol farol) {
        this.farois.add(farol);
    }

    public ArrayList<Retrovisor> getRetrovisores() {
        return retrovisores;
    }

    public void adicionarRetrovisor(Retrovisor retrovisor) {
        this.retrovisores.add(retrovisor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro [modelo=").append(modelo).append(", cor=").append(cor).append("]\n");
        sb.append("  ").append(motor).append("\n");
        sb.append("  ").append(volante).append("\n");
        sb.append("  ").append(painel).append("\n");
        sb.append("  ").append(cambio).append("\n");
        sb.append("  ").append(bateria).append("\n");

        for (Roda r : rodas) {
            sb.append("  ").append(r).append("\n");
        }
        for (Porta p : portas) {
            sb.append("  ").append(p).append("\n");
        }
        for (Banco b : bancos) {
            sb.append("  ").append(b).append("\n");
        }
        for (Farol f : farois) {
            sb.append("  ").append(f).append("\n");
        }
        for (Retrovisor rt : retrovisores) {
            sb.append("  ").append(rt).append("\n");
        }

        return sb.toString();
    }
}