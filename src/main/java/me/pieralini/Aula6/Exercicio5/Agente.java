package me.pieralini.Aula6.Exercicio5;
public abstract class Agente { protected String nome; protected boolean modo_agente; protected String profissao; public Agente(String n,String p){nome=n;profissao=p;} public abstract void apresentacao(); public void modo_agente_on(){modo_agente=true;} protected boolean smith(){if(modo_agente){System.out.println("AGENTE SMITH");return true;}return false;} }
