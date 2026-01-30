package DesafioPOO;
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class objetoDsf08 {

    LocalDate hoje = LocalDate.now();

    private int day;
    private int month;
    private int year;

    private LocalDate data;


    public objetoDsf08(int year, int month, int day) {
        try {
            this.data = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            System.out.println("Data inválida, definindo data padrão");
            this.data = LocalDate.of(1,1,1);
        }
    }

    public LocalDate getData() {
        return data;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void compara() {
        if(data == null) {
            System.out.println("Data não definida!");
            return;
        }

        if(data.isBefore(hoje)) {
            System.out.println("1");
        } else if(data.isAfter(hoje)) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }


    public void IsBissexto() {
        int ano = hoje.getYear();

        boolean bissexto = Year.isLeap(ano);
        System.out.println(bissexto);
    }

    public String getMonthinFull(int month) {
        return Month.of(month).getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
    }

    public objetoDsf08(objetoDsf08 outro) {
        this.data = outro.data;
    }

    @Override
    public String toString() {
        return data.getDayOfMonth() + " de " + data.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")) + " de " + data.getYear() ;


    }
}
