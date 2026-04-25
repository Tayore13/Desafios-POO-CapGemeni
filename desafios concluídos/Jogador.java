package DesafioPOO;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Jogador {

    private String nome;
    private String posicao;
    private LocalDate nascimento;
    private String nascionalidade;
    private double altura;
    private double peso;
    private LocalDate hoje = LocalDate.now();


    public Jogador() {

    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPosicao() {
        return posicao;
    }


    public void setNascimento(String dataTexto) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

        try {
            this.nascimento = LocalDate.parse(dataTexto, formato);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida, alterando para data padrão!");
            this.nascimento = LocalDate.of(1, 1, 1);
        }
    }
    public LocalDate getNascimento() {
        return nascimento;
    }


    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }
    public String getNascionalidade() {
        return nascionalidade;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }


    public String imprimirDados() {
        return "Nome: " + nome + "\nPosição: " + posicao + "\nNascimento: " + nascimento + "\nNacionalidade: " + nascionalidade  + "\nAltura: " + altura + "\nPeso: " + peso;
    }


    public int idadeJogador() {
        if(nascimento == null) {
            return 0;
        }

        return Period.between(nascimento, hoje).getYears();
    }


    public int tempoParaAposentar() {

        int idade = idadeJogador();
        int aposenta;

        if(idade > 40) {
            return 0;
        }

        if(posicao.equalsIgnoreCase("defesa")) {
            aposenta = 40 - idade;
        } else if(posicao.equalsIgnoreCase("meio campo")) {
            aposenta = 38 - idade;
        } else if(posicao.equalsIgnoreCase("atacante")) {
            aposenta = 35 - idade;
        } else {
            return 0;
        }

        return Math.max(aposenta, 0);
    }
}
