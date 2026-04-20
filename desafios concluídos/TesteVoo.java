package DesafioPOO;

import java.util.Scanner;

public class TesteVoo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma data para agendar seu voo no seguinte formato: dd/MM/yyyy");
        String dataTexto = scan.nextLine();

        Voo voo = new Voo(dataTexto, 174);

        System.out.println("Sua viagem foi confirmado para a data: " + voo.getData() + " ás 16:30 (horário de Brasília)");
        System.out.println("-------------------------");
        System.out.println("Número do voo: " + voo.getNumeroVoo());
        System.out.println("Assentos livres: " + voo.getVagasDisponiveis());
        System.out.println("Próximo assento livre: " + voo.getProximoAssentoLivre());
        System.out.println("Qual assento deseja ocupar? ");
        int assento = scan.nextInt();
        scan.nextLine();

        if(voo.verificaAssento(assento) == true) {
            System.out.println("Assento livre, deseja ocupar?");
            String ocupa = scan.nextLine();
            if(ocupa.equalsIgnoreCase("sim")) {
                voo.ocupaAssento(assento);
                System.out.println("Assento " + assento + " reservado com sucesso!");
            }
        } else {
            System.out.println("Assento ocupado!");
        }
        
    }
}
