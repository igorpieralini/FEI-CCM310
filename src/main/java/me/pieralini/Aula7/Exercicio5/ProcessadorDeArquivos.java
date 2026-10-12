public class ProcessadorDeArquivos {

    public void processar(int opcao) throws ArquivoCorrompidoException, ArquivoNaoEncontradoException, PermissaoNegadaException {
        switch (opcao) {
            case 1:
                throw new ArquivoCorrompidoException("O arquivo esta corrompido");
            case 2:
                throw new ArquivoNaoEncontradoException("O arquivo nao foi encontrado");
            case 3:
                throw new PermissaoNegadaException("Permissao negada para acessar o arquivo");
            default:
                System.out.println("Nenhuma excecao lancada");
        }
    }
}