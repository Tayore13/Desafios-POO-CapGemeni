package DesafioPOO;

import java.util.Scanner;

public class testeContaCorrente02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        contaCorrente02 conta = new contaCorrente02("0001", "Michael");

        System.out.println(conta);

        System.out.println("Deseja manter o nome?");
        String mantem = scan.nextLine();

        if(mantem.equalsIgnoreCase("nao")) {
            System.out.println("Informe o novo nome: ");
            String novonome = scan.nextLine();

            System.out.println("Nome alterado para: " + conta.alterarNome(novonome));
        }

        System.out.println("Informe o saldo da sua conta R$");
        conta.setSaldo(scan.nextDouble());

        while(true) {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1-Deposito\n2-Saque");
            int operacao = scan.nextInt();

            if(operacao == 1) {
                System.out.println("Valor do deposito R$");
                double valor = scan.nextDouble();
                conta.deposito(valor);
            } else if(operacao == 2) {
                System.out.println("Valor do saque R$");
                double valor = scan.nextDouble();
                conta.saque(valor);
            }

            System.out.println("Saldo atual da conta R$" + conta.getSaldo());

            System.out.println("Deseja finalizar a operação? 1-Sim / 2-Não");
            int finaliza = scan.nextInt();

            if(finaliza == 1) {
                break;
            }
        }

        System.out.println(conta + "\nSaldo atual R$" + conta.getSaldo());

    }
}
