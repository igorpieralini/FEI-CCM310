package me.pieralini.Aula5.Exercicio3;
public class Main { public static void main(String[] args){Navio n=new Navio(30,"FEI");NavioMercante m=new NavioMercante(20,"Carga",1000,650);Cruzador c=new Cruzador(120,"Cruzador",90,50,9);PortaAvioes p=new PortaAvioes(800,"Porta-Avioes",200,10,20);n.exibirInfoGeral();m.carregamento();c.exibirArmas();p.exibirArmas();} }
