package DesafioPOO;

public class AlunosMatriculas {

    private int matricula;
    private String nome;
    private double notaprova1;
    private double notaprova2;
    private double notatrabalho;



    public AlunosMatriculas(int matricula, String nome, double notaprova1, double notaprova2, double notatrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaprova1 = notaprova1;
        this.notaprova2 = notaprova2;
        this.notatrabalho = notatrabalho;
    }


    public int getMatricula() {
        return matricula;
    }


    public String getNome() {
        return nome;
    }


    public double getNotaprova1() {
        return notaprova1;
    }


    public double getNotaprova2() {
        return notaprova2;
    }


    public double getNotatrabalho() {
        return notatrabalho;
    }


    public double media() {
        double media = ((notaprova1 * 2.5) + (notaprova2 * 2.5) + (notatrabalho * 2)) / 7;
        return media;
    }


    public double provafinal() {
        double m  = media();
        if(m >= 7) {
            return 0;
        } else {
            return 10 - m;
        }
    }
}
