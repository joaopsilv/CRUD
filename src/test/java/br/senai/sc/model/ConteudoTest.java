package br.senai.sc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConteudoTest {

    private Conteudo conteudo;

    public ConteudoTest(){
        conteudo = new Conteudo();
    }

    @Test
    void getNome(){
        conteudo.setNome("Conteúdo 1");
        assertEquals("Conteúdo 1", conteudo.getNome());
    }

    @Test
    void setNome(){
        conteudo.setNome("Conteúdo 2");
        assertEquals("Conteúdo 2", conteudo.getNome());
    }

    @Test
    void getDescricao(){
        conteudo.setDescricao("Primeiro conteúdo");
        assertEquals("Primeiro conteúdo", conteudo.getDescricao());
    }

    @Test
    void setDescricao(){
        conteudo.setDescricao("Segundo conteúdo");
        assertEquals("Segundo conteúdo", conteudo.getDescricao());
    }

    @Test
    void getData(){
        conteudo.setData("20/05/2000");
        assertEquals("20/05/2000", conteudo.getData());
    }

    @Test
    void setData(){
        conteudo.setData("20/05/2003");
        assertEquals("20/05/2003", conteudo.getData());
    }
}