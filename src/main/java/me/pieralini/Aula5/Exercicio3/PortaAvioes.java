package me.pieralini.Aula5.Exercicio3;
public class PortaAvioes extends NavioDeGuerra { private int numAvioes; public PortaAvioes(int n,String nome,double b,double a,int av){super(n,nome,b,a);numAvioes=av;} @Override public void poderDeFogo(){System.out.println("Poder de fogo: "+(ataque*numAvioes*numAvioes));} }
