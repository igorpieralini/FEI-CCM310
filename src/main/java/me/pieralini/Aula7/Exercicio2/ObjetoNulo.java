public class ObjetoNulo {

    public static void main(String[] args) {
        String texto = null;

        try {
            int tamanho = texto.length();
            System.out.println("Tamanho: " + tamanho);
        } catch (NullPointerException erro) {
            System.out.println("Erro: o objeto esta nulo.");
        }
    }
}