package DesafioPOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class testePessoa01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        pessoa01 pessoa = new pessoa01();

        System.out.println("Inform seu nome: ");
        pessoa.setNome(scan.nextLine());

        System.out.println("Informe a data do seu nascimento no seguinte formato: dd/MM/yyyy");
        String nascimentoTexto = scan.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate nascimento = LocalDate.parse(nascimentoTexto, formato);

        pessoa.setNascimento(nascimento);

        System.out.println("Informe sua altura: ");
        pessoa.setAltura(scan.nextDouble());

        pessoa.exibir();

        System.out.println("Idade: " + pessoa.calcularIdade());

    }
}
