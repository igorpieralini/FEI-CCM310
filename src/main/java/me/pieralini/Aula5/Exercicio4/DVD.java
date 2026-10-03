package me.pieralini.Aula5.Exercicio4;
public class DVD extends Produto { private int duracao; public DVD(String n,double p,int d){super(n,"DVD",p);duracao=d;} @Override public String toString(){return "DVD: "+nome+" | R$ "+preco+" | duracao: "+duracao+" min";} }
