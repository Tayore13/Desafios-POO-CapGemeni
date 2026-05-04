package DesafioPOO;

public class Agenda {


    private agenda12[] agenda = new agenda12[10];
    private int contandor = 0;


    public Agenda() {

    }


    public void armazenarPessoa(String nome, int idade, float altura) {
        if(contandor < agenda.length) {
            agenda[contandor] = new agenda12(nome, idade, altura);
            contandor++;
        } else {
            System.out.println("Agenda cheia, libere espaço para poder armazear!");
        }
    }


    public int buscarPessoa(String nome) {

        for(int i = 0; i < contandor; i++) {

            if(agenda[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }


    public void removerPessoa(String nome) {

        int posicação = buscarPessoa(nome);

        if(posicação == -1) {
            System.out.println("Pessoa não encontrada!");
            return;
        }

        for(int i = posicação; i < contandor - 1; i++) {
            agenda[i] = agenda[i + 1];
        }

        agenda[contandor - 1] = null;
        contandor--;
    }


    public void imprimirAgenda() {

        if(contandor == 0) {
            System.out.println("Agenda vazia!");
            return;
        }

        for(int i = 0; i < contandor; i++) {
            System.out.println("Nome: " + agenda[i].getNome());
            System.out.println("Idade: " + agenda[i].getIdade());
            System.out.println("Altura: " + agenda[i].getAltura());
            System.out.println("---------------------");
        }
    }


    public void imprimirPessoa(int index) {

        if(index >= 0 && index < contandor) {
            System.out.println("Nome: " + agenda[index].getNome());
            System.out.println("Idade: " + agenda[index].getIdade());
            System.out.println("Altura: " + agenda[index].getAltura());
        } else {
            System.out.println("Índece inválido!");
        }
    }

}
