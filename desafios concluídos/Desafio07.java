package DesafioPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio07 {
    public static void main(String[] args) {

        int qtd;

        Scanner scan = new Scanner(System.in);

        ArrayList<objetoDsf07> pessoas = new ArrayList<>();

        System.out.println("Quantos funcionarios deseja cadastrar?");
        qtd = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < qtd; i++) {
            System.out.println("Informe o nome do funcionario:");
            String nome = scan.nextLine();

            System.out.println("Informe o sobre nome:");
            String snome = scan.nextLine();

            System.out.println("Qual salario mensal?");
            double salmen = scan.nextDouble();
            scan.nextLine();

            objetoDsf07 funcionario = new objetoDsf07(nome, snome, salmen);
            pessoas.add(funcionario);

            System.out.println("");
        }

        for(objetoDsf07 f : pessoas) {
            System.out.println(f.getName() + " " + f.getSname());

            System.out.println("Salario mensal R$" + f.getSalmen());

            System.out.println("Salario anual R$" + f.salanual());

            System.out.println("Salario anual com aumento R$" + f.aumento(10));

            System.out.println("----------------------------------------------");
        }
    }
}
