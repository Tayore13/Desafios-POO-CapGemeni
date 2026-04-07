package DesafioPOO;


public class TesteInvoice {
    public static void main(String[] args) {

        Invoice invoice = new Invoice(1234, "Teclado Mecanico", 5, 89.99);

        Invoice invoice2 = new Invoice(5678, "Headset Baseus", -3, -298.79);


        System.out.println("Produto selecionado: " + invoice.getDescricao() + "\nQuantidade comprada: " + invoice.getQuantidade() + "\nValor do produto R$" + invoice.getPreco());

        System.out.println("Total a pagar R$" + invoice.getInvoiceAmount());

        System.out.println("Produto selecionado: " + invoice2.getDescricao() + "\nQuantidade comprada: " + invoice2.getQuantidade() + "\nValor do produto R$" + invoice2.getPreco());

        System.out.println("Total a pagar do segundo item, R$" + invoice2.getInvoiceAmount());
    }
}
