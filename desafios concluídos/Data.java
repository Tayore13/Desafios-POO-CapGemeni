package DesafioPOO;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.time.format.TextStyle;
import java.util.Locale;

public class Data {

    private LocalDate data;
    private LocalDate hoje = LocalDate.now();

    public Data(String dataTexto) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

        try {
            this.data = LocalDate.parse(dataTexto, formato);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida, ajustando para data padrão.");
            this.data = LocalDate.of(1,1,1);
        }
    }


    public LocalDate getData() {
        return data;
    }


    public int compara(LocalDate outraData) {
        if(hoje.isEqual(outraData)) {
            return 0;
        } else if(hoje.isAfter(outraData)) {
            return 1;
        } else {
            return -1;
        }
    }


    public int getDia() {
        return data.getDayOfMonth();
    }


    public int getMes() {
        return data.getMonthValue();
    }


    public String getMesExtenso() {
        return data.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
    }


    public int getAno() {
        return data.getYear();
    }


    public boolean isBissexto() {
        int ano = hoje.getYear();

        boolean bissexto = Year.isLeap(ano);
        return bissexto;
    }


    public Data(Data outra) {
        this.data = outra.data;
    }

    @Override
    public String toString() {
        return data.getDayOfMonth() + " de " + data.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " de " + data.getYear();

    }
}
