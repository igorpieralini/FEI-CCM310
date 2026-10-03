package me.pieralini.Aula5.Exercicio1;
public class Pessoa {
    protected String nome, sobrenome; protected int idade;
    public Pessoa(){ this("", "", 0); }
    public Pessoa(String nome,String sobrenome,int idade){this.nome=nome;this.sobrenome=sobrenome;this.idade=idade;}
    public String getNome(){return nome;} public String getSobreNome(){return sobrenome;} public int getIdade(){return idade;}
}
