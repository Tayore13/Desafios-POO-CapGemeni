package DesafioPOO;

public class Fatura {

    private String numero;
    private String descricao;
    private int qtdCompra;
    private double precoItem;


    public Fatura(String numero, String descricao, int qtdCompra, double precoItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQtdCompra(qtdCompra);
        setPrecoItem(precoItem);
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getNumero() {
        return numero;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }


    public void setQtdCompra(int qtdCompra) {
        if(qtdCompra < 0) {
            qtdCompra = 0;
        }
        this.qtdCompra = qtdCompra;
    }
    public int getQtdCompra() {
        return qtdCompra;
    }


    public void setPrecoItem(double precoItem) {
        if(precoItem < 0) {
            precoItem = 0;
        }
        this.precoItem = precoItem;
    }
    public double getPrecoItem() {
        return precoItem;
    }


    public double getTotalFatura() {
        return qtdCompra * precoItem;

    }
}
