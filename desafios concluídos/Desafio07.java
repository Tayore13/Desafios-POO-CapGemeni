package DesafioPOO;

import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {

        int i = 0;

        Scanner scan = new Scanner(System.in);

        objetoDsf07 funcionario = new objetoDsf07("", "", 0);

        while(i < 2) {
            System.out.println("Informe o nome do funcionario:");
            funcionario.setName(scan.nextLine());

            System.out.println("Informe o sobre nome:");
            funcionario.setSname(scan.nextLine());

            System.out.println("Qual salario mensal?");
            funcionario.setSalmen(scan.nextDouble());

            System.out.println(funcionario.getName() + " " + funcionario.getSname());
            System.out.println(funcionario.getSalmen());

            funcionario.salanual();
            funcionario.aumento();

            scan.nextLine();
            System.out.println("");

            i++;
        }
    }
}
