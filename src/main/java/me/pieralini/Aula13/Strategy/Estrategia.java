
package me.pieralini.Aula13.Strategy;

public class Estrategia {

    interface CalculoDesconto {
        double calcular(double valor);
    }

    static class DescontoNormal implements CalculoDesconto {

        @Override
        public double calcular(double valor) {
            return valor;
        }
    }

    static class DescontoEstudante implements CalculoDesconto {

        @Override
        public double calcular(double valor) {
            return valor * 0.90;
        }
    }

    static class DescontoFuncionario implements CalculoDesconto {

        @Override
        public double calcular(double valor) {
            return valor * 0.80;
        }
    }

    static class CalculadoraDesconto {

        private CalculoDesconto estrategia;

        public CalculadoraDesconto(CalculoDesconto estrategia) {
            this.estrategia = estrategia;
        }

        public void setEstrategia(CalculoDesconto estrategia) {
            this.estrategia = estrategia;
        }

        public double calcular(double valor) {
            return estrategia.calcular(valor);
        }
    }

    public static void main(String[] args) {
        CalculadoraDesconto calculadora = new CalculadoraDesconto(
                new DescontoEstudante()
        );

        System.out.println(calculadora.calcular(100));

        calculadora.setEstrategia(new DescontoFuncionario());

        System.out.println(calculadora.calcular(100));
    }
}
