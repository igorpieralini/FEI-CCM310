package me.pieralini.Aula5.Exercicio3;
public class Cruzador extends NavioDeGuerra { private int numCanhoes; public Cruzador(int n,String nome,double b,double a,int c){super(n,nome,b,a);numCanhoes=c;} @Override public void poderDeFogo(){System.out.println("Poder de fogo: "+(ataque*Math.sqrt(numCanhoes)));} }
