package DesafioPOO;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CalculadoraCientifica calculadora = new CalculadoraCientifica();

        System.out.println("Deseja ultilizar a calculadora normal ou a cientifica?");
        String resp = sc.nextLine();

        if(resp.equalsIgnoreCase("normal")) {

            System.out.println("Informe 2 valores para fazer uma operação:");
            System.out.println("1°");
            double x = sc.nextDouble();
            System.out.println("2°");
            double y = sc.nextDouble();
            sc.nextLine();

            System.out.println("Qual operação deseja realizar?");
            System.out.println("| + | - | / | * |");
            String operacao = sc.nextLine();

            switch (operacao) {
                case "+":
                    System.out.println(calculadora.soma(x, y));
                    break;
                case "-":
                    System.out.println(calculadora.subtracao(x, y));
                    break;
                case "/":
                    System.out.println(calculadora.divisao(x, y));
                    break;
                case "*":
                    System.out.println(calculadora.multiplicacao(x, y));
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }

        } else if(resp.equalsIgnoreCase("cientifica")) {

            System.out.println("Qual operação deseja realizar?");
            System.out.println("1-Potencia\n2-Raiz");
            int op = sc.nextInt();

            System.out.println("Informe o valor de x:");
            double x = sc.nextDouble();

            if(op == 1) {
                System.out.println("Informe o expoente:");
                double expo = sc.nextDouble();

                System.out.println(calculadora.potencia(x, expo));
            } else if(op == 2) {
                System.out.println(calculadora.raiz(x));
            } else {
                System.out.println("Operação inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
