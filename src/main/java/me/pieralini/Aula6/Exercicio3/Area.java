package me.pieralini.Aula6.Exercicio3;
public class Area { public double area(double lado){return lado*lado;} public double area(double comprimento,double largura){return comprimento*largura;} public static void main(String[] args){Area a=new Area();System.out.println("Quadrado: "+a.area(5));System.out.println("Retangulo: "+a.area(5,3));} }
