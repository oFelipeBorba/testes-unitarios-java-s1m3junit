package br.senai.sc.models;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class AvaliadorTeste {

    @Test
    public void deveEncontrarMaiorEMenorLance(){
        Usuario brayam = new Usuario("Brayam",25,"111.222.333-45");
        Lance l1 = new Lance(200,brayam);
        Lance l2 = new Lance(300,brayam);
        Lance l3 = new Lance(400,brayam);
        Leilao leilao =  new Leilao(new Date(2023,01,18),new Date(2023,01,20));
        leilao.adiciona(l1);
        leilao.adiciona(l2);
        leilao.adiciona(l3);
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        Assert.assertEquals(400,leiloeiro.getMaiorDeTodos(),0);
        Assert.assertEquals(200,leiloeiro.getMenorDeTodos(),0);
    }

}
