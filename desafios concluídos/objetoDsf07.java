package DesafioPOO;

import java.util.Scanner;

public class objetoDsf07 {

    private String name;
    private String sname;
    private double salmen;

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

    public double salanual() {
        return salmen * 12;
    }

    public double aumento(double percentual) {
        return (salanual() + (salmen * (percentual / 100)));
    }


}
