package DesafioPOO;

public class CalculadoraCientifica extends Calculadora{



    public CalculadoraCientifica() {

    }


    public double potencia(double x, double expoente) {
        return Math.pow(x, expoente);
    }


    public double raiz(double x) {
        if(x < 0) {
            throw new IllegalArgumentException("Não existe raíz real de número negativo");
        }
        return Math.sqrt(x);
    }

}
