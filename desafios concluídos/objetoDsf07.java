package DesafioPOO;

import java.util.Scanner;

public class objetoDsf07 {

    private String name;
    private String sname;
    private double salmen;

    Scanner scan = new Scanner(System.in);

    public objetoDsf07(String name, String sname, double salmen) {
        this.name = name;
        this.sname = sname;
        this.salmen = salmen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    public void setSalmen(double salmen) {
        this.salmen = salmen;
    }

    public double getSalmen() {
        return salmen;
    }

    public void salanual() {
        double x;
        x = salmen * 12;
        System.out.println("O salario anual de " + name + " é de R$" + x);
    }

    public void aumento() {
        double x;
        x = (salmen + (salmen * 0.10)) * 12;
        System.out.println("O salario anual de " + name + " com aumento de 10% é de R$" + x);
    }
}
