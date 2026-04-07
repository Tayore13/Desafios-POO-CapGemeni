package DesafioPOO;

public class Funcionario {

    private String nome;
    private String sobreNome;
    private double salarioMensal;


    public Funcionario(String nome, String sobreNome, double salarioMensal) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        setSalarioMensal(salarioMensal);
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
        if(salarioMensal <= 0) {
            this.salarioMensal = 0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }


    public double salarioAnual() {
        return salarioMensal * 12;
    }


    public void aumentoSalario(double aumento) {
        if(aumento > 0) {
            setSalarioMensal(salarioMensal + salarioMensal * (aumento/100));
        }
    }


    public String getNomeCompleto() {
        return nome + " " + sobreNome;
    }
}
