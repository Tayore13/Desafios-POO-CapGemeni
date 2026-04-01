package DesafioPOO;

import java.util.Scanner;

public class TesteAlunosMatriculas {
    public static void main(String[] args) {

        AlunosMatriculas aluno1 = new AlunosMatriculas(1234, "João Guilherme", 7.5, 6.5, 8);

        AlunosMatriculas aluno2 = new AlunosMatriculas(5678, "Lara Mirella", 9.8, 6.7, 8);

        System.out.println("Os alunos " + aluno1.getNome() + " e " + aluno2.getNome() + ", serão avaliados:");

        System.out.println("A média de " + aluno1.getNome() + " foi: " + aluno1.media());

        System.out.println("A média de " + aluno2.getNome() + " foi: " + aluno2.media());

        System.out.println("Avaliando necessidade de prova final...");

        if(aluno1.provafinal() == 0) {
            System.out.println(aluno1.getNome() + " passou direto.");
        } else {
            System.out.println(aluno1.getNome() + " precisa de " + aluno1.provafinal() + " para passar");
        }

        if(aluno2.provafinal() == 0) {
            System.out.println(aluno2.getNome() + " passou direto.");
        } else {
            System.out.println(aluno2.getNome() + " precisa de " + aluno2.provafinal() + " para passar");
        }


    }
}
