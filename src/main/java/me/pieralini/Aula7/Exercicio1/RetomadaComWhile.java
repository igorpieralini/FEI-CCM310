import java.util.Scanner;

public class RetomadaComWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            try {
                System.out.print("Digite um numero inteiro: ");
                int numero = Integer.parseInt(entrada.nextLine());

                System.out.println("Numero digitado: " + numero);
                repetir = false;
            } catch (NumberFormatException erro) {
                System.out.println("Valor invalido, tente novamente.");
            }
        }

        entrada.close();
    }
}