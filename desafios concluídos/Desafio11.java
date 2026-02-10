package DesafioPOO;

public class Desafio11 {
    public static void main(String[] args) {

        objetoDesafio11 ingresso = new objetoDesafio11();

        subclasseDesafio11 vip = new subclasseDesafio11();

        System.out.println("Valor do ingresso normal R$" + ingresso.imprimirValor());

        vip.ingressoVip();

        double diferença = vip.getValorVip() - ingresso.getValor();

        System.out.println("Diferença de valores do ingressos R$" + diferença);
    }
}
