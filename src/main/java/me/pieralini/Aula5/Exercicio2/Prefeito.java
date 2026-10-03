package me.pieralini.Aula5.Exercicio2;
public class Prefeito extends Politico { private String municipio; public Prefeito(String nome,String partido,String municipio,String estado){super(nome,partido,estado,"Prefeito");this.municipio=municipio;} @Override public void apresentacao(){super.apresentacao();System.out.println("Municipio: "+municipio);} }
