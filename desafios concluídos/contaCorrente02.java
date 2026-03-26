package DesafioPOO;

public class contaCorrente02 {


    private String numeroDaConta;
    private String nome;
    private double saldo;


    public contaCorrente02(String numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }


    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public String getNumeroDaConta() {
        return numeroDaConta;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }


    public String alterarNome(String novoNome) {
        if(nome == null) {
            System.out.println("Defina o nome primeiro!");
        }
        nome = novoNome;
        return novoNome;
    }


    public double deposito(double deposito) {
        saldo += deposito;
        return saldo;
    }


    public double saque(double saque) {
        if(saque <= 0) {
            throw new IllegalArgumentException("O saque deve ser positivo.");
        }
        if(saldo < saque) {
            throw new IllegalArgumentException("Saldo insuficiente para a operação.");
        }
        saldo -= saque;
        return saldo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Conta: " + numeroDaConta;
    }

}
