package me.pieralini.Aula6.Exercicio2;
public class Retangulo extends Formas { private double comprimento,largura; public Retangulo(double c,double l){super("Retangulo");comprimento=c;largura=l;} @Override public double perimetro(){return 2*(comprimento+largura);} @Override public void print(){System.out.println(tipo+" | perimetro: "+perimetro());} }
