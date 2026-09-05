package me.pieralini.Aula4.Exercicio4;

/**
 * Representa uma conta corrente bancaria simples, permitindo
 * consultar, definir, depositar e sacar valores do saldo.
 *
 * @author Exercicio de POO
 * @version 1.0
 */
/**
 * Representa uma conta corrente bancaria simples, permitindo
 * consultar, definir, depositar e sacar valores do saldo.
 *
 * @author Exercicio de POO
 * @version 1.0
 */
public class ContaCorrente {

    /** Saldo atual da conta corrente. */
    private double saldo;

    /**
     * Constroi uma conta corrente com saldo inicial igual a zero.
     */
    public ContaCorrente() {
        this.saldo = 0.0;
    }

    /**
     * Constroi uma conta corrente com um saldo inicial definido.
     *
     * @param saldo saldo inicial da conta
     */
    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return o saldo atual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define (substitui) o saldo atual da conta.
     *
     * @param saldo novo valor do saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Deposita um valor na conta, somando-o ao saldo atual.
     * Valores negativos ou iguais a zero sao ignorados.
     *
     * @param valor valor a ser depositado, deve ser maior que zero
     */
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de deposito invalido: " + valor);
        }
    }

    /**
     * Saca um valor da conta, subtraindo-o do saldo atual.
     * O saque so e realizado se o valor for positivo e nao
     * ultrapassar o saldo disponivel.
     *
     * @param valor valor a ser sacado
     * @return {@code true} se o saque foi realizado com sucesso,
     *         {@code false} caso o valor seja invalido ou o saldo
     *         seja insuficiente
     */
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque invalido: " + valor);
            return false;
        }
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para saque de: " + valor);
            return false;
        }
        this.saldo -= valor;
        return true;
    }
}