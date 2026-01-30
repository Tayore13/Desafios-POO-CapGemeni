package DesafioPOO;

import java.util.Scanner;

public class Desafio08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe um dia do mes:");
        int dia = scan.nextInt();

        System.out.println("Informe um mes:");
        int mes = scan.nextInt();

        System.out.println("Informe um ano:");
        int ano = scan.nextInt();

        objetoDsf08 data = new objetoDsf08(ano, mes, dia);

        System.out.println("0 - Datas iguais\n1 - Data corrente maior\n-1 - Data do parâmetro maior");
        data.compara();

        System.out.println("O ano é bissexto?");
        data.IsBissexto();

        System.out.println(data.getMonthinFull(mes));

        objetoDsf08 copia = new objetoDsf08(data);

        System.out.println(copia);


    }
}
