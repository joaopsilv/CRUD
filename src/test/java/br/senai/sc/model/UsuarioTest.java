package br.senai.sc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest{

    private Usuario usuario;

    public UsuarioTest(){
        usuario = new Usuario();
    }

    @Test
    void getNome(){
        usuario.setNome("Usuário 1");
        assertEquals("Usuário 1", usuario.getNome());
    }

    @Test
    void setNome(){
        usuario.setNome("Usuário 2");
        assertEquals("Usuário 2", usuario.getNome());
    }

    @Test
    void getTurma(){
        usuario.setTurma("Turma 1");
        assertEquals("Turma 1", usuario.getTurma());
    }

    @Test
    void setTurma(){
        usuario.setTurma("Turma 2");
        assertEquals("Turma 2", usuario.getTurma());
    }

    @Test
    void getAno(){
        usuario.setAno("2003");
        assertEquals("2003", usuario.getAno());
    }

    @Test
    void setAno(){
        usuario.setAno("2005");
        assertEquals("2005", usuario.getAno());
    }
}