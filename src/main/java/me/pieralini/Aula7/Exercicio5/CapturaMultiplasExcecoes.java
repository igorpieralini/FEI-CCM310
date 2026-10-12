public class CapturaMultiplasExcecoes {

    public static void main(String[] args) {
        ProcessadorDeArquivos processador = new ProcessadorDeArquivos();

        for (int opcao = 1; opcao <= 3; opcao++) {
            try {
                processador.processar(opcao);
            } catch (ArquivoCorrompidoException | ArquivoNaoEncontradoException | PermissaoNegadaException erro) {
                System.out.println("Capturada: " + erro.getMessage());
            }
        }
    }
}