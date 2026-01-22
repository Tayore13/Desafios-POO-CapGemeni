package DesafioPOO;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        objetoDsf05 alunos = new objetoDsf05();

        System.out.println("Nome do aluno:");
        alunos.setName(scan.nextLine());

        System.out.println("Matricula:");
        alunos.setMatricula(scan.nextInt());

        System.out.println("Nota prova 1:");
        alunos.setNota1(scan.nextFloat());

        System.out.println("Nota prova 2:");
        alunos.setNota2(scan.nextFloat());

        System.out.println("Nota do trabalho:");
        alunos.setTrabalho(scan.nextFloat());

        alunos.media();
        alunos.provafinal();
    }
}
