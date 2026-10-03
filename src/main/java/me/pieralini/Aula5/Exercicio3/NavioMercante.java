package me.pieralini.Aula5.Exercicio3;
public class NavioMercante extends Navio { private double capacidadeCarga,carga; public NavioMercante(int n,String nome,double capacidade,double carga){super(n,nome);capacidadeCarga=capacidade;this.carga=carga;} public void carregamento(){exibirInfoGeral();System.out.println("Ocupacao: "+(carga/capacidadeCarga));} }
