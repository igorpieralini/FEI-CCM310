package me.pieralini.Aula4.Exercicio8;

public class Pessoa {
    private String nome;
    private String telefone;
    private int id;
    private static int proximoId = 1;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = proximoId;
        proximoId++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Nome: " + nome + " | Telefone: " + telefone;
    }
}