package DesafioPOO;

public class bombaCombustivel03 {

    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel = 50;


    public bombaCombustivel03() {

    }


    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }


    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }
    public double getValorPorLitro() {
        return valorPorLitro;
    }


    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }


    public double abastecerPorValor(double valor) {

        if(valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }

        double litros = quantidadeCombustivel = valor / valorPorLitro;

        if(litros > quantidadeCombustivel) {
            throw new IllegalArgumentException("Quantidade de combustível na bomba insuficiente para esta operação!");
        }

        quantidadeCombustivel -= litros;
        return litros;
    }


    public double abastecerPorLitro(double litro) {

        if(litro <= 0) {
            throw new IllegalArgumentException("Quantidade de litros inválida!");
        }

        if(litro > quantidadeCombustivel) {
            throw new IllegalArgumentException("Quantidade de combustível na bomba insuficiente para esta operação!");
        }

        quantidadeCombustivel -= litro;
        return litro * valorPorLitro;
    }


    public void alterarValorCombustivel(double valorCombustivel) {

        if(valorCombustivel <= 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }

        this.valorPorLitro = valorCombustivel;
    }


    public String alterarCombustivel(String novoCombustivel) {
        if(tipoCombustivel == null || novoCombustivel.isEmpty()) {
            throw new IllegalArgumentException("Combustivel inválido!");
        }
        return tipoCombustivel = novoCombustivel;
    }


    public double alterarQuantidadeCombustivel(double qtdCombustivel) {
        return quantidadeCombustivel = qtdCombustivel;
    }
}
