package DesafioPOO;

public class FuncionarioTeste15 {
    public static void main(String[] args) {

        Funcionario15 funcionario1 = new Funcionario15("Mateus", " dos Santos", 1500.00);

        Funcionario15 funcionario2 = new Funcionario15("Lara", " Albuquerque", 2100.00);

        System.out.println("Salario do funcionario " + funcionario1.getNome() + funcionario1.getSobrenome() + " R$" + funcionario1.getSalario());

        System.out.println("Salario da funcionaria " + funcionario2.getNome() + funcionario2.getSobrenome() + " R$" + funcionario2.getSalario());

        System.out.println("Novo salario de " + funcionario1.getNome() + " R$" + funcionario1.aplicandoAumento(10) + "\nSalario anual R$" + funcionario1.getSalarioAnual());

        System.out.println("Novo salario de " + funcionario2.getNome() + " R$" + funcionario2.aplicandoAumento(10) + "\nSalario anual R$" + funcionario2.getSalarioAnual());

        System.out.println("Numero de funcionario que passaram pela empresa: " + Funcionario15.getTotalFuncionarios());

    }
}
