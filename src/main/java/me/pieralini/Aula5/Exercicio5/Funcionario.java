package me.pieralini.Aula5.Exercicio5;
public class Funcionario extends Pessoa { private Data admissao; private double salario; public Funcionario(String n,String c,Data nasc,Data adm,double s){super(n,c,nasc);admissao=adm;salario=s;} public double getSalario(){return salario;} @Override public String toString(){return super.toString()+" | admissao: "+admissao+" | salario: "+salario;} }
