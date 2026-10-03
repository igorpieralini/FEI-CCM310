package me.pieralini.Aula6.Exercicio2;
public class Circulo extends Formas { private double raio; public Circulo(double r){super("Circulo");raio=r;} public double area(){return Math.PI*raio*raio;} @Override public double perimetro(){return 2*Math.PI*raio;} @Override public void print(){System.out.println(tipo+" | area: "+area()+" | perimetro: "+perimetro());} }
