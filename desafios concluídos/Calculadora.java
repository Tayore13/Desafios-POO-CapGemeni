package DesafioPOO;

public class Calculadora {


    public Calculadora() {

    }


    public double soma(double x, double y) {
        return x + y;
    }


    public double subtracao(double x, double y) {
        return x - y;
    }


    public double divisao(double x, double y) {
        if(y == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero!");
        }
        return x / y;
    }


    public double multiplicacao(double x, double y) {
        return x * y;
    }
}
