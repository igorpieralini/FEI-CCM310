package me.pieralini.Aula5.Exercicio7;
public class Trapezio extends Quadrilatero { public Trapezio(Ponto a,Ponto b,Ponto c,Ponto d){super(a,b,c,d);} public double area(){double soma=0;Ponto[] p={p1(),p2(),p3(),p4()};for(int i=0;i<4;i++)soma+=p[i].getX()*p[(i+1)%4].getY()-p[(i+1)%4].getX()*p[i].getY();return Math.abs(soma)/2;} }
