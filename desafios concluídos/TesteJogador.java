package DesafioPOO;

import java.util.Scanner;

public class TesteJogador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Jogador jogador = new Jogador();

        System.out.println("---Registro de jogador---");
        System.out.println("Nome: ");
        jogador.setNome(scan.nextLine());

        System.out.println("Posição: ");
        jogador.setPosicao(scan.nextLine());

        System.out.println("Data de nascimento (informe no seguinte formato dd/MM/yyyy: ");
        String dataTexto = scan.nextLine();
        jogador.setNascimento(dataTexto);

        System.out.println("Nacionalidade: ");
        jogador.setNascionalidade(scan.nextLine());

        System.out.println("Altura: ");
        jogador.setAltura(scan.nextDouble());

        System.out.println("Peso: ");
        jogador.setPeso(scan.nextDouble());

        System.out.println("Carrengado dados...");
        System.out.println("");

        System.out.println(jogador.imprimirDados());

        System.out.println("Idade atual de " + jogador.getNome() + ": " + jogador.idadeJogador());

        System.out.println("Anos restantes para se aposentar: " + jogador.tempoParaAposentar());
    }
}
