package me.pieralini.Aula5.Exercicio1;
import java.util.*;
public class Main { public static void main(String[] args){
    Scanner in=new Scanner(System.in); ArrayList<Aluno> alunos=new ArrayList<>();
    Aluno a1=new Aluno(); System.out.print("Nome: "); a1.nome=in.nextLine(); System.out.print("Sobrenome: "); a1.sobrenome=in.nextLine(); System.out.print("Idade: "); a1.idade=Integer.parseInt(in.nextLine()); System.out.print("Curso: "); a1.setCurso(in.nextLine()); alunos.add(a1);
    System.out.print("Nome: "); String n=in.nextLine(); System.out.print("Sobrenome: "); String s=in.nextLine(); System.out.print("Idade: "); int i=Integer.parseInt(in.nextLine()); System.out.print("Curso: "); String c=in.nextLine(); alunos.add(new Aluno(n,s,i,c));
    for(Aluno a:alunos)a.print();
}}
