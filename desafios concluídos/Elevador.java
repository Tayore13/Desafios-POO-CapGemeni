package DesafioPOO;

public class Elevador {

    private int AndarAtual;
    private int TotalAndares;
    private int CapacidadeElevador;
    private int PessoasPresentes;


    public Elevador(int TotalAndares, int CapacidadeElevador) {
        this.TotalAndares = TotalAndares;
        this.CapacidadeElevador = CapacidadeElevador;
        this.AndarAtual = 0;
        this.PessoasPresentes = 0;
    }


    public int getAndarAtual() {
        return AndarAtual;
    }


    public int getTotalAndares() {
        return TotalAndares;
    }


    public int getCapacidadeElevador() {
        return CapacidadeElevador;
    }


    public int getPessoasPresentes() {
        return PessoasPresentes;
    }


    public void entra() {
        if(PessoasPresentes >= CapacidadeElevador) {
            System.out.println("Capacidade máxima atingida!");
        } else {
            PessoasPresentes++;
        }
    }


    public void sai() {
        if(PessoasPresentes <= 0) {
            System.out.println("Não há pessoas presentes para sair!");
        } else {
            PessoasPresentes--;
        }
    }


    public void sobe() {
        if(AndarAtual < TotalAndares) {
            AndarAtual++;
        } else {
            System.out.println("Já está no último andar!");
        }
    }


    public void desce() {
        if(AndarAtual > 0) {
            AndarAtual--;
        } else {
            System.out.println("Já está no térreo!");
        }
    }
}
