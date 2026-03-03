package DesafioPOO;

import java.util.Scanner;

public class FaturaTeste14 {
    public static void main(String[] args) {


        Fatura14 fatura = new Fatura14("1234", "Monitor", 10, 799.98);

        System.out.println("---Loja SuprInfo---");
        System.out.println("");


        System.out.println("Valor total R$" + fatura.getTotalFatura());

    }
}
