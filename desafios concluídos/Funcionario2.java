package DesafioPOO;

public class Funcionario2 {

    private String nome;
    private String sobreNome;
    private double salarioMensal;
    private static int funcionarios = 0;

    public Funcionario2(String nome, String sobreNome, double salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
        funcionarios++;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
    public String getSobreNome() {
        return sobreNome;
    }


    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }


    public int getFuncionarios() {
        return funcionarios;
    }


    public double aumentoSalario() {
        salarioMensal = salarioMensal + (salarioMensal * 0.1);
        return salarioMensal;
    }


    public double salarioAnual() {
        return salarioMensal * 12;
    }
}
