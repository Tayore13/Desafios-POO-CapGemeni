package DesafioPOO;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class objetoDsf09 {

    private int numeroVoo;

    private final int totalVagas = 100;

    private boolean[] assentos;

    private int vagasOcupadas;

    private LocalDate dataVoo;


    public objetoDsf09(int numeroVoo, LocalDate dataVoo) {
        this.dataVoo = dataVoo;
        this.numeroVoo = numeroVoo;
        this.assentos = new boolean[totalVagas];
    }


    public boolean isAssentoLivre(int numeroAssento) {
        if(numeroAssento < 1 || numeroAssento > totalVagas) {
            throw new IllegalArgumentException("Assento Invalido!");
        }
        return !assentos[numeroAssento - 1];
    }


    public boolean reservarAssento(int numeroAssento) {
        if(isAssentoLivre(numeroAssento)) {
            assentos[numeroAssento - 1] = true;
            return true;
        }
        return false;
    }


    public int getProximoAssentoLivre() {
        for(int i = 0; i < totalVagas; i++) {
            if(!assentos[i]) {
                return i + 1;
            }
        }
        return -1;
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


    public int getNumeroVoo() {
        return numeroVoo;
    }


    public LocalDate getDataVoo() {
        return dataVoo;
    }


    @Override
    public String toString(){
        return "Voo: " + getNumeroVoo() +
            dataVoo.getDayOfMonth() + " de " + dataVoo.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " de " + dataVoo.getYear();
    }

}
