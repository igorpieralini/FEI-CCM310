import java.util.Scanner;

public class AutenticacaoDeUsuario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Login login = new Login("admin", "1234");

        System.out.print("Usuario: ");
        String user = entrada.nextLine();

        System.out.print("Senha: ");
        String password = entrada.nextLine();

        try {
            login.logar(user, password);
        } catch (LoginInvalidoException erro) {
            System.out.println(erro.getMessage());
        }

        entrada.close();
    }
}