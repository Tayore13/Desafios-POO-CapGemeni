package DesafioPOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe uma data dd/MM/yyyy");
        String dataTexto = scan.nextLine();

        Data data = new Data(dataTexto);

        System.out.println("Informe outra data dd/MM/yyyy:");
        String outradataTexto = scan.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

        LocalDate outradataFormatada = LocalDate.parse(outradataTexto, formato);


        System.out.println(data.compara(outradataFormatada));

        System.out.println(data.getDia());

        System.out.println(data.getMes());

        System.out.println(data.getMesExtenso());

        System.out.println(data.getAno());

        System.out.println("O ano da data corrente é bissexto?");
        System.out.println(data.isBissexto());

        Data copia = new Data(data);

        System.out.println(copia);

    }
}
