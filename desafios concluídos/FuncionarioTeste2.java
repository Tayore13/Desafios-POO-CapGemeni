package DesafioPOO;

public class FuncionarioTeste2 {
    public static void main(String[] args) {

        Funcionario2 funcionario1 = new Funcionario2("Douglas", "Albuquerque", 1980);
        Funcionario2 funcionario2 = new Funcionario2("Diego", "Chaves", 2300);

        System.out.println("O funcionário " + funcionario1.getNome() + " recebe R$" + funcionario1.getSalarioMensal());

        System.out.println("O funcionário " + funcionario2.getNome() + " recebe R$" + funcionario2.getSalarioMensal());
        System.out.println("");




        System.out.println("Efetivado aumento de 10% no salario de cada.");
        System.out.println(funcionario1.getNome() + " R$" + funcionario1.aumentoSalario());
        System.out.println(funcionario2.getNome() + " R$" + funcionario2.aumentoSalario());
        System.out.println("");
        System.out.println("Salario anual do funcionario " + funcionario1.getNome() + " R$" + funcionario1.salarioAnual());
        System.out.println("Salario anual do funcionario " + funcionario2.getNome() + " R$" + funcionario2.salarioAnual());

        System.out.println("Total de funcionarios registrados: " + funcionario1.getFuncionarios());

    }
}
