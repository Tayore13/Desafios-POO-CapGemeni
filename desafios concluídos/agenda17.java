package DesafioPOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class agenda17 {
    public static void main(String[] args) {

        ArrayList<agendamento17> compromissos = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("---Organizando Agenda---");

        while(true) {


            System.out.println("---------------------------");
            System.out.println("Qual o tipo de compromisso?");
            String compromisso = scan.nextLine();

            System.out.println("Informe a data que deseja marcar o compromisso no seguinte formato: dd/MM/yyyy");
            String dataTexto = scan.nextLine();

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            LocalDate data = LocalDate.parse(dataTexto, formato);

            System.out.println("Nome do(a) participante do compromisso: ");
            String nome = scan.nextLine();

            System.out.println("Contato do(a) participante: ");
            String contato = scan.nextLine();

            compromissos.add(new agendamento17(compromisso, data, nome, contato));


            System.out.println("Deseja adicionar mais algum compromisso?");
            String resposta = scan.nextLine();

            if(resposta.equalsIgnoreCase("não")) {
                break;
            }
        }

        System.out.println("Gostaria de procurar por algum compromisso em específico?");
        String respostaProcura = scan.nextLine();

        if(respostaProcura.equalsIgnoreCase("sim")) {
            System.out.println("Deseja procurar por nome ou por data?");
            String procura = scan.nextLine();

            if(procura.equalsIgnoreCase("nome")) {
                System.out.println("Informe o nome: ");
                String nomeProcurca = scan.nextLine();
                agendamento17.buscarPessoa(compromissos, nomeProcurca);
            } else {
                System.out.println("Informe a data no seguinte formato: dd/MM/yyyy");
                String dataProcura = scan.nextLine();

                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                LocalDate data = LocalDate.parse(dataProcura, formato);

                agendamento17.buscarPorData(compromissos, data);
            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Compromissos agendados:");

        for (agendamento17 c : compromissos) {
            c.exibir();
        }

        System.out.println("Gostaria de remover algum compromisso?");
        String remove = scan.nextLine();

        if(remove.equalsIgnoreCase("sim")) {
            System.out.println("Informe a ID do compromisso que deseja remover da agenda: ");
            int removeCompromisso = scan.nextInt();
            scan.nextLine();
            compromissos.remove(removeCompromisso);
        }

        System.out.println("Deseja modificar a natureza de algum compromisso?");
        String modifica = scan.nextLine();

        if(modifica.equalsIgnoreCase("sim")) {
            System.out.println("Informe a ID do agendamento que deseja alterar o compromisso: ");
            int id = scan.nextInt();
            scan.nextLine();

            System.out.println("Qual será o novo compromisso? ");
            String novoCompromisso = scan.nextLine();

            compromissos.get(id).setCompromisso(novoCompromisso);

            System.out.println("Agenda atualizada:");

            for (agendamento17 c : compromissos) {
                c.exibir();
            }
        }

        scan.close();
    }
}
