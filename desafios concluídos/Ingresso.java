package DesafioPOO;

public class Ingresso {

    private double valor = 20.75;


    public Ingresso() {

    }


    public double getValor() {
        return valor;
    }


    public String imprimirValor() {
        return "R$" + valor;
    }
}
