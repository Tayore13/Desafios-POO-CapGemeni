package DesafioPOO;

import java.util.Scanner;

public class testeElevador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Elevador elevador = new Elevador(6,10);

        System.out.println("Capacidade do elevador: " + elevador.getCapacidadeElevador());
        System.out.println("Máximo de andares: " + elevador.getTotalAndares());
        System.out.println("Andar atual: " + elevador.getAndarAtual());

        while(true) {
            System.out.println("Alguém deseja entrar?");
            String entra = scan.nextLine();

            if (entra.equalsIgnoreCase("sim")) {
                elevador.entra();
                System.out.println(elevador.getPessoasPresentes() + " pessoas | Andar " + elevador.getAndarAtual() + "/6");
            }

            System.out.println("Deseja subir, descer ou encerrar?:");
            String sobe_desce = scan.nextLine();

            if (sobe_desce.equalsIgnoreCase("subir")) {
                elevador.sobe();
            } else if (sobe_desce.equalsIgnoreCase("descer")) {
                elevador.desce();
            } else if(sobe_desce.equalsIgnoreCase("encerrar")) {
                break;
            }

            System.out.println("Alguém deseja sair?");
            String sai = scan.nextLine();

            if (sai.equalsIgnoreCase("sim")) {
                elevador.sai();
                System.out.println(elevador.getPessoasPresentes() + " pessoas | Andar " + elevador.getAndarAtual() + "/6");
            }

        }
    }
}
