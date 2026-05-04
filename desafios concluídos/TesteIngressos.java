package DesafioPOO;

public class TesteIngressos {
    public static void main(String[] args) {


        Ingresso ingresso = new Ingresso();
        IngressoVip vip = new IngressoVip();

        System.out.println("Valor do ingresso normal:");
        System.out.println(ingresso.imprimirValor());
        System.out.println("-------------------------");
        System.out.println("Valor do ingresso VIP:");
        System.out.println(vip.imprimirValorVip());

        double diferença = (vip.getValorVip() - ingresso.getValor());

        System.out.println("Diferença de valores: " + diferença);
    }
}
