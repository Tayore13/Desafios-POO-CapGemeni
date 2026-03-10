package DesafioPOO;

import java.util.Scanner;

public class TesteCarro16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        carro16 carro1 = new carro16();
        carro16 carro2 = new carro16();

        System.out.println("Quantos litros de gasolina deseja abastecer o carro 1?");
        double litros1 = scan.nextDouble();
        carro1.abastecer(litros1);

        System.out.println("Quantos litros deseja abastecer o carro 2?");
        double litros2 = scan.nextDouble();
        carro2.abastecer(litros2);

        System.out.println("Quantos km deseja percorrer com o carro 1?");
        double km1 = scan.nextDouble();
        carro1.mover(km1);

        System.out.println("Quantos km deseja percorrer com o carro 2?");
        double km2 = scan.nextDouble();
        carro2.mover(km2);

        System.out.println("Carro 1:\n" + carro1.exibirGasolinaETanque() + "\nCarro 2:\n" + carro2.exibirGasolinaETanque());
    }
}
