package br.senai.sc.repository;

import br.senai.sc.model.Usuario;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioRepositoryTest {

    private UsuarioRepository usuarioRepository;

    @Test
    void findAll(){
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Usuário 1", "Turma 1", "2003"),
                new Usuario("Usuário 2", "Turma 2", "2005"),
                new Usuario("Usuário 3", "Turma 3", "2000")
        );
        usuarioRepository.saveAll(usuarios);
        usuarioRepository.findAll();
    }

    @Test
    void save(){
        Usuario usuario = new Usuario("Usuário 1", "Turma 1", "2003");
        usuarioRepository.save(usuario);
    }

    @Test
    void deleteAll(){
        usuarioRepository.deleteAll();
    }
}