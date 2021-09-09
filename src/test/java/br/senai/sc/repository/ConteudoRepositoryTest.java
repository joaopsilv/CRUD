package br.senai.sc.repository;

import br.senai.sc.model.Conteudo;
import br.senai.sc.model.Usuario;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConteudoRepositoryTest {

    private ConteudoRepository conteudoRepository;

    @Test
    void findAll(){
        List<Conteudo> conteudos = Arrays.asList(
                new Conteudo("Conteúdo 1", "Primeiro conteúdo", "20/05/2000"),
                new Conteudo("Conteúdo 2", "Segundo conteúdo", "20/05/2003"),
                new Conteudo("Conteúdo 3", "Terceiro conteúdo", "20/05/2005")
        );
        conteudoRepository.saveAll(conteudos);
        conteudoRepository.findAll();
    }

    @Test
    void save(){
        Conteudo conteudo = new Conteudo("Conteúdo 1,","Primeiro conteúdo", "20/05/2000");
        conteudoRepository.save(conteudo);
    }

    @Test
    void deleteAll(){
        conteudoRepository.deleteAll();
    }
}