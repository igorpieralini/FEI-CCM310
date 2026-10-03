package me.pieralini.Aula5.Exercicio7;
public class Ponto { private double x,y; public Ponto(double x,double y){this.x=x;this.y=y;} public double getX(){return x;} public double getY(){return y;} public double distancia(Ponto p){return Math.hypot(x-p.x,y-p.y);} }
