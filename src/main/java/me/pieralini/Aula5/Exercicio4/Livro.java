package me.pieralini.Aula5.Exercicio4;
public class Livro extends Produto { private String autor,genero; public Livro(String n,double p,String a,String g){super(n,"Livro",p);autor=a;genero=g;} @Override public String toString(){return "Livro: "+nome+" | R$ "+preco+" | autor: "+autor+" | genero: "+genero;} }
