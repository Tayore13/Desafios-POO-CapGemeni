package DesafioPOO;

import java.util.Scanner;

public class testeBombaCombustivel03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        bombaCombustivel03 combustivel = new bombaCombustivel03();

        System.out.println("Bem vindo ao Posto Tanque Cheio");
        System.out.println("-------------------------------");
        System.out.println("Qual tipo de Combustivel deseja?");
        System.out.println("1-Gasolina R$5,65\n2-Diesel R$4,80");
        int tipo = scan.nextInt();

        if(tipo == 1) {
            combustivel.setTipoCombustivel("Gasolina");
            combustivel.setValorPorLitro(5.65);
        } else if(tipo == 2) {
            combustivel.setTipoCombustivel("Diesel");
            combustivel.setValorPorLitro(4.80);
        } else {
            System.out.println("Tipo não registrado!");
        }

        System.out.println("Como deseja abastecer?");
        System.out.println("1-Por Litro\n2-Por Valor");
        int abastecer = scan.nextInt();

        if(abastecer == 1) {
            System.out.println("Quantos litros?");
            double litros = scan.nextDouble();
            System.out.println("O valor a pagar será de R$" + combustivel.abastecerPorLitro(litros));
        }else if(abastecer == 2) {
            System.out.println("Quanto deseja abastecer?");
            double valor = scan.nextDouble();
            System.out.println("A quantidade de litros abastecida foi de " + combustivel.abastecerPorValor(valor) + "l");
        } else {
            System.out.println("Opção inválida!");
        }
        scan.nextLine();

        System.out.println("Deseja alterar o valor do combustivel? Sim/Nao");
        String alterarValor = scan.nextLine();

        if(alterarValor.equalsIgnoreCase("sim")) {
            System.out.println("Informe o combustivel que deseja alterar o valor:");
            String qualCombustivel = scan.nextLine();
            System.out.println("O tipo escolhido foi " + combustivel.alterarCombustivel(qualCombustivel));

            System.out.println("Agora informe o novo valor:");
            double novoValor = scan.nextDouble();
            combustivel.alterarValorCombustivel(novoValor);
            System.out.println("O combustivel " + combustivel.getTipoCombustivel() + " passará a custar R$" + combustivel.getValorPorLitro());
        }
        scan.nextLine();

        System.out.println("Deseja alterar a quantidade de combustivel? Sim/Nao");
        String quantidadeCombustivel = scan.nextLine();

        if(quantidadeCombustivel.equalsIgnoreCase("Sim")) {
            System.out.println("Informe a quantidade desejada:");
            double alterarqtdCombustivel = scan.nextDouble();
            System.out.println("Quantidade de combustivel no tanque foi alterada para " + combustivel.alterarQuantidadeCombustivel(alterarqtdCombustivel) + "l");
        }

    }
}
