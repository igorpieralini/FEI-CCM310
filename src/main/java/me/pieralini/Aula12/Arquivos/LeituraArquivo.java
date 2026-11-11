
package me.pieralini.Aula12.Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

    public static void main(String[] args) {
        try (BufferedReader leitura = new BufferedReader(
                new FileReader("impares.txt"))) {

            String linha;

            while ((linha = leitura.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException excecao) {
            System.out.println("Erro: " + excecao.getMessage());
        }
    }
}
