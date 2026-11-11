
package me.pieralini.Aula12.Arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaArquivo {

    public static void main(String[] args) {
        try (PrintWriter escrita = new PrintWriter(
                new FileWriter("impares.txt"))) {

            for (int numero = 1; numero <= 100; numero += 2) {
                escrita.println(numero);
            }

            System.out.println("Arquivo criado com sucesso.");

        } catch (IOException excecao) {
            System.out.println("Erro: " + excecao.getMessage());
        }
    }
}
