package me.pieralini.Aula5.Exercicio5;
public class Data { private int dia,mes,ano; public Data(int d,int m,int a){dia=d;mes=m;ano=a;} @Override public String toString(){return String.format("%02d/%02d/%04d",dia,mes,ano);} }
