public class TesteExcecaoPersonalizada {

    public static void main(String[] args) {
        try {
            throw new ExcecaoPersonalizada("Minha excecao personalizada");
        } catch (ExcecaoPersonalizada erro) {
            erro.exibirMensagem();
        }
    }
}