
package me.pieralini.Aula11.Refatoracao;

public class Calculadora {

    public int calcular(int primeiro, int segundo, String operacao) {
        if (operacao == null) {
            return 0;
        }

        return switch (operacao) {
            case "s" -> somar(primeiro, segundo);
            case "m" -> multiplicar(primeiro, segundo);
            case "d" -> dividir(primeiro, segundo);
            default -> 0;
        };
    }

    private int somar(int primeiro, int segundo) {
        return primeiro + segundo;
    }

    private int multiplicar(int primeiro, int segundo) {
        return primeiro * segundo;
    }

    private int dividir(int primeiro, int segundo) {
        return primeiro / segundo;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(10, 5, "s"));
        System.out.println(calculadora.calcular(10, 5, "m"));
        System.out.println(calculadora.calcular(10, 5, "d"));
    }
}
