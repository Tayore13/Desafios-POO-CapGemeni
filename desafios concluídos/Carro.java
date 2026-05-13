package DesafioPOO;

public class Carro {


    private double tanque;
    private static final double MAXIMO_GASOLINA = 50;
    private double distancia;
    private static final double KM_LITRO = 15;

    public Carro() {

    }


    public double getTanque() {
        return tanque;
    }


    public void setDistancia(double distancia) {
        double litrosConsumidos = distancia / KM_LITRO;

        if(distancia < 0) {
            throw new IllegalArgumentException("Distancia inválida!");
        }

        if(litrosConsumidos > tanque ) {
            throw new IllegalArgumentException("Combustivel insuficiente para percurso!");
        }
        this.tanque -= litrosConsumidos;
        this.distancia += distancia;
    }
    public double getDistancia() {
        return distancia;
    }


    public void setAbastecer(double abastecer) {
        if(abastecer < 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }

        if(abastecer + tanque > MAXIMO_GASOLINA) {
            throw new IllegalArgumentException("Excede o limite do tanque!");
        }
        this.tanque += abastecer;
    }

}
