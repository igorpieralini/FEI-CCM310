
package me.pieralini.Aula12.Generics;

public class Main {

    public static void main(String[] args) {
        Pair<String, Integer> aluno = new Pair<>("Igor", 20);

        System.out.println("Nome: " + aluno.getPrimeiro());
        System.out.println("Idade: " + aluno.getSegundo());

        aluno.setPrimeiro("João");
        aluno.setSegundo(21);

        System.out.println("Nome atualizado: " + aluno.getPrimeiro());
        System.out.println("Idade atualizada: " + aluno.getSegundo());
    }
}
