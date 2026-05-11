package DesafioPOO;

public class FaturaTeste {
    public static void main(String[] args) {

        Fatura fatura = new Fatura("0001", "Computador", -3, 1500);

        System.out.println("    Tec Store   ");
        System.out.println("-------------------");
        System.out.println("Produto: " + fatura.getDescricao());
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Quantidade: " + fatura.getQtdCompra());
        System.out.println("Preço: " + fatura.getPrecoItem());
        System.out.println("-------------------");
        System.out.println("Total R$" + fatura.getTotalFatura());
    }
}
