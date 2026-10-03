package me.pieralini.Aula5.Exercicio2;
public class Politico { protected String nome,partido,estado,funcao; public Politico(String nome,String partido,String estado,String funcao){this.nome=nome;this.partido=partido;this.estado=estado;this.funcao=funcao;} public void apresentacao(){System.out.println(nome+" - "+funcao+" - "+partido+"/"+estado);} }
