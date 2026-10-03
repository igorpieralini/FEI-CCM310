package me.pieralini.Aula5.Exercicio4;
public class Produto { protected String nome,tipo; protected double preco; public Produto(String nome,String tipo,double preco){this.nome=nome;this.tipo=tipo;this.preco=preco;} @Override public String toString(){return nome+" | R$ "+preco;} }
