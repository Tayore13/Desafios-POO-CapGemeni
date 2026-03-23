package DesafioPOO;

import java.time.LocalDate;
import java.util.ArrayList;

public class agendamento17 {

    private String compromisso;
    private LocalDate data;
    private String nome;
    private String contato;


    public agendamento17(String compromisso, LocalDate data, String nome, String contato) {
        this.compromisso = compromisso;
        this.data = data;
        this.nome = nome;
        this.contato = contato;
    }


    public void setCompromisso(String compromisso) {
        this.compromisso = compromisso;
    }
    public String getCompromisso() {
        return compromisso;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalDate getData() {
        return data;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setContato(String contato) {
        this.contato = contato;
    }
    public String getContato() {
        return contato;
    }


    public void exibir() {
        System.out.println("Compromisso: " + compromisso);
        System.out.println("Data: " + data);
        System.out.println("Pessoa: " + nome);
        System.out.println("Contato: " + contato);
        System.out.println("-----------------------------");
    }


    public static void buscarPessoa(ArrayList<agendamento17> lista, String nome) {

        for(agendamento17 c : lista) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.exibir();
            }
        }
    }


    public static void buscarPorData(ArrayList<agendamento17> lista, LocalDate data) {

        for(agendamento17 c : lista) {
            if(c.getData().equals(data)) {
                c.exibir();
            }
        }
    }


}


