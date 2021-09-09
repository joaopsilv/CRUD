package br.senai.sc.service;

import br.senai.sc.model.Comentario;

import java.util.List;

public interface ComentarioService{
    public Comentario findById(Long id);
    public List<Comentario> findAll();

    public boolean save(Comentario comentario);
    public boolean deleteById(Long id);
}
