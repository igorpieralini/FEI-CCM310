package me.pieralini.Aula5.Exercicio6;
public class Main { public static void main(String[] args){SavingsAccount s=new SavingsAccount(1000,0.01);System.out.println("Juros: "+s.calculateInterest());s.credit(s.calculateInterest());System.out.println(s.getBalance());CheckingAccount c=new CheckingAccount(500,2);c.credit(100);c.debit(50);System.out.println(c.getBalance());} }
