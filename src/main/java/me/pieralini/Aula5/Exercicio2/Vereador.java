package me.pieralini.Aula5.Exercicio2;
public class Vereador extends Politico { private String municipio; public Vereador(String nome,String partido,String municipio,String estado){super(nome,partido,estado,"Vereador");this.municipio=municipio;} @Override public void apresentacao(){super.apresentacao();System.out.println("Municipio: "+municipio);} }
