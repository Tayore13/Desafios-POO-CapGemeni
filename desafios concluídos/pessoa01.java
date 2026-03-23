package DesafioPOO;

import java.time.LocalDate;
import java.time.Period;

public class pessoa01 {

    private String nome;
    private LocalDate nascimento;
    private double altura;


    public pessoa01() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }


    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + nascimento);
        System.out.println("Altura: " + altura);
    }


    public int calcularIdade() {
        return Period.between(this.nascimento, LocalDate.now()).getYears();
    }

}
