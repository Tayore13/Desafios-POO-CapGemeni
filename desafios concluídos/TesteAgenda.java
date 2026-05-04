package DesafioPOO;

import java.util.Scanner;

public class TesteAgenda {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        System.out.println("Organizando Agenda");

        while (true) {
            System.out.println("------------------");
            System.out.println("Insira o nome:");
            String nome = scan.nextLine();

            System.out.println("Insira a idade:");
            int idade = scan.nextInt();

            System.out.println("Insira a altura:");
            float altura = scan.nextFloat();
            scan.nextLine();

            agenda.armazenarPessoa(nome,idade, altura);

            System.out.println("Deseja continuar preenchendo a agenda?");
            String continua = scan.nextLine();

            if(continua.equalsIgnoreCase("nao")) {
                break;
            }

        }

        System.out.println("Deseja remover alguém da agenda?");
        String remove = scan.nextLine();

        if(remove.equalsIgnoreCase("sim")) {
            System.out.println("Informe o nome da pessoa que deseja remover:");
            String removendo = scan.nextLine();
            agenda.removerPessoa(removendo);
        }

        System.out.println("Deseja procurar por alguém na agenda?");
        String  procura = scan.nextLine();

        if(procura.equalsIgnoreCase("sim")) {
            System.out.println("Informe o nome a ser procurado:");
            String procurando = scan.nextLine();
            System.out.println("Indice: " + agenda.buscarPessoa(procurando));
        }

        System.out.println("Deseja buscar e imprimir os dados de alguém através do índice?");
        String imprimi = scan.nextLine();

        if(imprimi.equalsIgnoreCase("sim")) {
            System.out.println("Inform o índice:");
            int indice = scan.nextInt();

            agenda.imprimirPessoa(indice);
            System.out.println("-----------------");
        }

        agenda.imprimirAgenda();

    }
}
