package DesafioPOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        objetoDesafio10 player = new objetoDesafio10();

        System.out.println("Nome do jogador: ");
        player.setName(scan.nextLine());

        System.out.println("Posição do jogador: ");
        player.setPosition(scan.nextLine());

        System.out.println("Data de nascimento: dd/MM/yyyy");
        String nascimento = scan.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento = LocalDate.parse(nascimento, formatter);

        player.setBirth(dataNascimento);

        System.out.println("Qual nacionalidade?");
        player.setNationality(scan.nextLine());

        System.out.println("Qual altura?");
        player.setHeight(scan.nextDouble());

        System.out.println("Qual peso?");
        player.setWeight(scan.nextDouble());
        scan.nextLine();

        System.out.println(player.alldata());
        System.out.println(" ");

        System.out.println("O jogador " + player.getName() + " tem " + player.getIdade() + " anos de idade.");

        System.out.println("Faltam " + player.getAposentar() + " anos para se aposentar");

    }
}
