package DesafioPOO;

public class Invoice {

    private int numeroDoItem;
    private String descricao;
    private int quantidade;
    private double preco;


    public Invoice(int numeroDoItem, String descricao, int quantidade, double preco) {
        this.numeroDoItem = numeroDoItem;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }


    public void setNumeroDoItem(int numeroDoItem) {
        this.numeroDoItem = numeroDoItem;
    }

    public int getNumeroDoItem() {
        return numeroDoItem;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setQuantidade(int quantidade) {
        if(quantidade <= 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }


    public void setPreco(double preco) {
        if(preco <= 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public double getPreco() {
        return preco;
    }


    public double getInvoiceAmount() {
        return quantidade * preco;
    }

}
