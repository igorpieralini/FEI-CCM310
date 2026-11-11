
package me.pieralini.Aula13.Factory;

public class Fabrica {

    interface Pagamento {
        void processar(double valor);
    }

    static class PagamentoPix implements Pagamento {

        @Override
        public void processar(double valor) {
            System.out.println("Pagamento PIX: R$ " + valor);
        }
    }

    static class PagamentoCartao implements Pagamento {

        @Override
        public void processar(double valor) {
            System.out.println("Pagamento cartão: R$ " + valor);
        }
    }

    public static Pagamento criarPagamento(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "pix" -> new PagamentoPix();
            case "cartao" -> new PagamentoCartao();
            default -> throw new IllegalArgumentException(
                    "Pagamento inválido"
            );
        };
    }

    public static void main(String[] args) {
        Pagamento pagamento = criarPagamento("pix");
        pagamento.processar(150.00);
    }
}
