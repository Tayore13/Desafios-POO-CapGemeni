package DesafioPOO;

import java.util.Scanner;

public class Desafio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        calculadoraCientifica13 calculadora = new calculadoraCientifica13();

        System.out.println("Deseja usar a calculadora normal ou cientifica?");
        String calc = scan.nextLine();

        if(calc.equalsIgnoreCase("normal")) {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("+\n-\n*\n/");
            String resp = scan.nextLine();

            System.out.println("Informe o valor de x:");
            double x = scan.nextDouble();

            System.out.println("Informe o valor de y:");
            double y = scan.nextDouble();

            switch (resp) {
                case "+":
                    System.out.println(calculadora.soma(x, y));
                    break;
                case "-":
                    System.out.println(calculadora.subtracao(x, y));
                    break;
                case "*":
                    System.out.println(calculadora.multiplicacao(x, y));
                    break;
                case "/":
                    System.out.println(calculadora.divisao(x, y));
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }

        } else if(calc.equalsIgnoreCase("cientifica")) {
            System.out.println("Qual operação deseja realizar?\n-potencia\nraiz");
            String resp = scan.nextLine();

            System.out.println("Informe o valor de x:");
            double x = scan.nextDouble();

            if(resp.equalsIgnoreCase("potencia")) {
                System.out.println("Informe o expoente:");
                double exp = scan.nextDouble();
                System.out.println(calculadora.potencia(x, exp));
            } else if(resp.equalsIgnoreCase("raiz")) {
                System.out.println(calculadora.raiz(x));
            } else {
                System.out.println("Operação inválida!");
            }
        } else {
            System.out.println("Opção inválida!");
        }

        scan.close();
    }
}
