package DesafioPOO;

public class objetoDsf05 {

    private int matricula;
    private String name;
    private double nota1;
    private double nota2;
    private double trabalho;
    double media;



    public objetoDsf05() {

    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1 * 2.5;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2 * 2.5;
    }

    public double getNota2() {
        return nota2;
    }

    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho * 2;
    }

    public double getTrabalho() {
        return trabalho;
    }

    public void media() {
        media = (nota1 + nota2 + trabalho) / 7;
        System.out.println("O Aluno " + name + " ficou com a  media: " + media);
    }

    public void provafinal() {
        double i;
        System.out.println("Quanto o aluno " + name + " precisa tirar para passar:");
        if(media > 7) {
            System.out.println("0");
        } else {
            i = (10 - media);
            System.out.println(i);
        }
    }
}
