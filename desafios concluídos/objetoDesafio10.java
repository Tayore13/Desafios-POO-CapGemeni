package DesafioPOO;

import java.time.LocalDate;
import java.time.Period;

public class objetoDesafio10 {

    private String name;
    private String position; /* posição */
    private LocalDate birth; /* nascimento */
    private String nationality; /* nacionalidade */
    private double height; /* altura */
    private double weight; /* peso */


    public objetoDesafio10() {

    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }


    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }
    public LocalDate getBirth() {
        return birth;
    }


    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }


    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }


    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        if(birth == null) {
            return 0;
        }

        return Period.between(birth, hoje).getYears();
    }


    public int getAposentar() {
        LocalDate hoje = LocalDate.now();

        int idade = Period.between(birth, hoje).getYears();
        int falta;

        if("atacante".equals(position)) {
            falta = 35 - idade;
        } else if("meio campo".equals(position)) {
            falta = 38 - idade;
        } else if("defesa".equals(position)) {
            falta = 40 - idade;
        } else {
            return 0;
        }
        return Math.max(falta, 0);
    }


    public String alldata() {
        return "Nome: " + getName() +"\nPosição: "+  getPosition() +"\nNascimento: " + getBirth() +"\nNacionalidade: " + getNationality() +"\nAltura: " + getHeight() +"\nPeso: " + getWeight();
    }

}
