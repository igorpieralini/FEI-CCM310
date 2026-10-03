package me.pieralini.Aula5.Exercicio6;
public class SavingsAccount extends Account { private double interestRate; public SavingsAccount(double b,double r){super(b);interestRate=r;} public double calculateInterest(){return interestRate*getBalance();} }
