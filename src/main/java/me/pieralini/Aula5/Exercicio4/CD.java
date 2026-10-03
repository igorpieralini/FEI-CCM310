package me.pieralini.Aula5.Exercicio4;
import java.util.*; public class CD extends Produto { private ArrayList<String> faixas; public CD(String n,double p,String... f){super(n,"CD",p);faixas=new ArrayList<>(Arrays.asList(f));} @Override public String toString(){return "CD: "+nome+" | R$ "+preco+" | "+faixas.size()+" faixas: "+faixas;} }
