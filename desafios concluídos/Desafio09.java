package DesafioPOO;

import java.time.LocalDate;
import java.util.Scanner;

public class Desafio09 {

    public static void main(String[] args) {

        objetoDsf09 vooPE = new objetoDsf09(3114, LocalDate.of(2026, 2, 15));

        System.out.println(vooPE.getProximoAssentoLivre());

        System.out.println(vooPE.isAssentoLivre(13));

        System.out.println(vooPE.reservarAssento(11));

        System.out.println(vooPE.getVagasDisponiveis());

        System.out.println(vooPE.getNumeroVoo());
    }
}
