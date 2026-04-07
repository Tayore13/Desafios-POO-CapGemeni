package DesafioPOO;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Ricardo", "da Silva", 2093.52);

        Funcionario funcionario2 = new Funcionario("Emilly", "Ferreira", 2331.25);

        System.out.println("Funcionarios registrados:");
        System.out.println(funcionario1.getNomeCompleto());
        System.out.println(funcionario2.getNomeCompleto());
        System.out.println("-----------------------");

        System.out.println("Salario de " + funcionario1.getNome());
        System.out.printf("R$ %.2f%n", funcionario1.getSalarioMensal());
        System.out.println("-----------------------");

        System.out.println("Salario de " + funcionario2.getNome());
        System.out.printf("R$ %.2f%n", funcionario2.getSalarioMensal());
        System.out.println("-----------------------");

        System.out.println("Salario anual de ambos:");
        System.out.printf("%s R$%.2f%n", funcionario1.getNome(), funcionario1.salarioAnual());
        System.out.printf("%s R$%.2f%n", funcionario2.getNome(), funcionario2.salarioAnual());

        System.out.println("Aplicando aumento em ambos os salarios:");
        funcionario1.aumentoSalario(10);
        System.out.printf("Salario mensal de %s R$%.2f. Anual R$%.2f%n", funcionario1.getNome(), funcionario1.getSalarioMensal(), funcionario1.salarioAnual());
        funcionario2.aumentoSalario(10);
        System.out.printf("Salario mensal de %s R$%.2f. Anual R$%.2f%n", funcionario2.getNome(), funcionario2.getSalarioMensal(), funcionario2.salarioAnual());

    }
}
