package DesafioPOO;

public class subclasseDesafio11 extends objetoDesafio11 {

    private double valorVip = getValor() + 10.0;

    public subclasseDesafio11() {

    }

    public double getValorVip() {
        return valorVip;
    }

    public void ingressoVip() {
        System.out.println("Valor do ingresso vip R$" + valorVip);
    }

}
