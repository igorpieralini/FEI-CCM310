public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String sobrenome, int idade, String cpf) throws CpfInvalidoException {
        if (cpf.contains(".") || cpf.contains("-")) {
            throw new CpfInvalidoException("CPF invalido: nao use ponto nem hifen, digite somente os numeros.");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }
}