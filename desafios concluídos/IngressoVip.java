package DesafioPOO;

public class IngressoVip extends Ingresso {


    private double valorVip = getValor() + 10.50;


    public IngressoVip() {

    }


    public double getValorVip() {
        return valorVip;
    }


    public String imprimirValorVip() {
        return "R$" + valorVip;
    }
}
