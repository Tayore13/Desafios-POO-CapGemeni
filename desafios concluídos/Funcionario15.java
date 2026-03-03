package DesafioPOO;

public class Funcionario15 {

    private String nome;
    private String sobrenome;
    private double salario;
    private static int totalFuncionarios = 0;


    public Funcionario15(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        totalFuncionarios++;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }


    public void setSalario(double salario) {
        if(salario > 0) {
            this.salario = salario;
        }
    }
    public double getSalario() {
        return salario;
    }


    public double aplicandoAumento(double percentual) {
        return salario += salario * (percentual/100);
    }


    public double getSalarioAnual() {
        return salario * 12;
    }


    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }
}
