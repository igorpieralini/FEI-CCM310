public class ExcecaoPersonalizada extends Exception {

    private final String mensagem;

    public ExcecaoPersonalizada(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public void exibirMensagem() {
        System.out.println("Mensagem armazenada: " + mensagem);
    }
}