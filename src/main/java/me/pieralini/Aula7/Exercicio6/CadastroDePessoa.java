import java.util.Scanner;

public class CadastroDePessoa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(entrada.nextLine());

        Pessoa pessoa = null;

        while (pessoa == null) {
            System.out.print("CPF: ");
            String cpf = entrada.nextLine();

            try {
                pessoa = new Pessoa(nome, sobrenome, idade, cpf);
            } catch (CpfInvalidoException erro) {
                System.out.println(erro.getMessage());
            }
        }

        System.out.println("Pessoa cadastrada: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("CPF: " + pessoa.getCpf());

        entrada.close();
    }
}