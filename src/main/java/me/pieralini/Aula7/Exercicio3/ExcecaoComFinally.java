public class ExcecaoComFinally {

    public static void main(String[] args) {
        try {
            throw new Exception("Excecao lancada dentro do bloco try");
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        } finally {
            System.out.println("Bloco finally executado");
        }
    }
}