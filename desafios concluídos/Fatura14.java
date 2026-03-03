package DesafioPOO;

public class Fatura14 {


    private String numero;
    private String descricao;
    private int qtd;
    private double valor;


    public Fatura14(String numero, String descricao, int qtd, double valor) {
        this.numero = numero;
        this.descricao = descricao;
        setQtd(qtd);
        setValor(valor);
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


    public void setQtd(int qtd) {
        if(qtd < 0) {
            qtd = 0;
        }
        this.qtd = qtd;
    }
    public int getQtd() {
        return qtd;
    }


    public void setValor(double valor) {
        if(valor < 0) {
            valor = 0;
        }
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }


    public double getTotalFatura() {
        return qtd * valor;
    }
}
