package br.senai.sc.service;

import br.senai.sc.model.Conteudo;

import java.util.List;

public interface ConteudoService{
    public Conteudo findById(Long id);
    public List<Conteudo> findAll();

    public boolean save(Conteudo conteudo);
    public boolean deleteById(Long id);
}
