package DesafioPOO;

public class carro16 {

    private static final double MAXIMO_GASOLINA = 50.0;
    private double tanque;
    private double kilometragem;
    private static final double KM_POR_LITRO = 15.0;

    public carro16() {

    }


    public double abastecer(double litros) {

        if(litros < 0) {
            throw new IllegalArgumentException("Quantidade inválida.");
        }

        if(tanque + litros > MAXIMO_GASOLINA) {
            throw new IllegalArgumentException("Excede o limite do tanque.");
        }

        tanque += litros;
        return tanque;
    }

    public double mover(double distancia) {

        double necessario = distancia / KM_POR_LITRO;

        if(tanque >= necessario) {
            tanque -= necessario;
            kilometragem += distancia;
        } else {
            System.out.println("Não tem gasolina suficiente para percorrer esta distância.");
        }
        return kilometragem;
    }

    public String exibirGasolinaETanque() {

            return "Galosina: " + tanque + "l" + "\nDistância percorrida: " + kilometragem + "km";

    }
}
