package DesafioPOO;

import java.util.Scanner;

public class TesteCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        Carro carro2 = new Carro();


        System.out.println("---------------------------------");
        System.out.println("Quantos litros deseja abastecer?");
        System.out.println("Carro 1:");
        carro.setAbastecer(sc.nextDouble());
        System.out.println("Carro 2:");
        carro2.setAbastecer(sc.nextDouble());


        System.out.println("---------------------------------");
        System.out.println("Qual distancia deseja percorrer?");
        System.out.println("Carro 1:");
        carro.setDistancia(sc.nextDouble());
        System.out.println("Carro 2:");
        carro2.setDistancia(sc.nextDouble());
        sc.nextLine();

        System.out.println("---------------------------------");
        System.out.printf("Distância percorrida carro 1: %.2f KM%n", carro.getDistancia());
        System.out.printf("Combustível restante carro 1: %.2f L%n", carro.getTanque());
        System.out.println("---------------------------------");
        System.out.printf("Distância percorrida carro 2: %.2f KM%n", carro2.getDistancia());
        System.out.printf("Combustível restante carro 2: %.2f L%n", carro2.getTanque());

        sc.close();
    }
}
