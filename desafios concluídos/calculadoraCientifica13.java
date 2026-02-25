package DesafioPOO;

public class calculadoraCientifica13 extends objetoDesafio13 {

    public calculadoraCientifica13() {

    }

    public double potencia(double x, double expoente) {
        return Math.pow(x, expoente);
    }


    public double raiz(double x) {
        if(x < 0) {
            throw new IllegalArgumentException("Não existe raíz real de número negativo.");
        }
        return Math.sqrt(x);
    }
}
