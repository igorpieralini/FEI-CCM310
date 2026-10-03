package me.pieralini.Aula5.Exercicio5;
public class Pessoa { private String nome,cpf; private Data nascimento; public Pessoa(String n,String c,Data d){nome=n;cpf=c;nascimento=d;} public String getNome(){return nome;} @Override public String toString(){return nome+" | CPF: "+cpf+" | nascimento: "+nascimento;} }
