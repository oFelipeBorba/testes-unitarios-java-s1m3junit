package br.senai.sc.models;

import java.util.List;

public class Avaliador {

    private double maiorDeTodos;
    private double menorDeTodos;

    public Avaliador() {
        this.maiorDeTodos = Double.NEGATIVE_INFINITY;
        this.menorDeTodos = Double.POSITIVE_INFINITY;
    }

    public void avalia(Leilao leilao) {
        List<Lance> lancesDoLeilao = leilao.getListaLances();
        for (Lance lance : lancesDoLeilao){
            if (lance.getValor() > this.maiorDeTodos){
                this.maiorDeTodos = lance.getValor();
            } else if (lance.getValor() < this.menorDeTodos) {
                this.menorDeTodos = lance.getValor();
            }
        }
    }

    public double getMaiorDeTodos() {
        return maiorDeTodos;
    }

    public void setMaiorDeTodos(double maiorDeTodos) {
        this.maiorDeTodos = maiorDeTodos;
    }

    public double getMenorDeTodos() {
        return menorDeTodos;
    }

    public void setMenorDeTodos(double menorDeTodos) {
        this.menorDeTodos = menorDeTodos;
    }
}
