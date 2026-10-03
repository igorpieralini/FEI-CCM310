package me.pieralini.Aula5.Exercicio1;
public class Aluno extends Pessoa {
    private String curso;
    public Aluno(){super(); this.curso="";}
    public Aluno(String nome,String sobrenome,int idade,String curso){super(nome,sobrenome,idade);this.curso=curso;}
    public void setCurso(String curso){this.curso=curso;} public String getCurso(){return curso;}
    public void print(){System.out.println(nome+" "+sobrenome+" | idade: "+idade+" | curso: "+curso);}
}
