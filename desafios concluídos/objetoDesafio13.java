package DesafioPOO;

public class objetoDesafio13 {


    public objetoDesafio13(){

    }

    public double soma(double x, double y) {
         return x + y;
    }


    public double subtracao(double x, double y) {
         return x - y;
    }


    public double multiplicacao(double x, double y) {
         return x * y;
    }


    public double divisao(double x, double y) {
        if(y == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return x / y;
    }

}
