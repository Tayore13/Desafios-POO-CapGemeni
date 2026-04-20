package DesafioPOO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Voo {


    private int numeroVoo;
    private LocalDate data;
    private final int totalVagas = 100;
    private boolean[] assentos;


    public Voo(String dataTexto, int numeroVoo) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

        try {
            this.data = LocalDate.parse(dataTexto, formato);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida, ajustando para data padrão.");
            this.data = LocalDate.of(1,1,1);
        }

        this.numeroVoo = numeroVoo;
        this.assentos = new boolean[totalVagas];
    }


    public LocalDate getData() {
        return data;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public int getProximoAssentoLivre() {
        for(int i = 0; i < totalVagas; i++) {
            if(!assentos[i]) {
                return i + 1;
            }
        }
        return  -1;
    }


    public boolean verificaAssento(int numeroAssento) {
        if(numeroAssento < 1 || numeroAssento > totalVagas) {
            throw new IllegalArgumentException("Assento ocupado!");
        }
        return !assentos[numeroAssento - 1];
    }


    public boolean ocupaAssento(int numeroAssento) {
        if(verificaAssento(numeroAssento)) {
            assentos[numeroAssento - 1] = true;
            return true;
        }
        return false;
    }


    public int getVagasDisponiveis() {
        int livres = 0;
        for(boolean ocupado : assentos) {
            if(!ocupado) {
                livres++;
            }
        }
        return livres;
    }


}
