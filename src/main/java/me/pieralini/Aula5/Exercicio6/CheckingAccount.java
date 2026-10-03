package me.pieralini.Aula5.Exercicio6;
public class CheckingAccount extends Account { private double fee; public CheckingAccount(double b,double f){super(b);fee=f;} @Override public void credit(double v){super.credit(v);if(v>0)super.debit(fee);} @Override public boolean debit(double v){if(super.debit(v)){super.debit(fee);return true;}return false;} }
