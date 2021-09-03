package br.senai.sc.service;

import br.senai.sc.model.Usuario;

import java.util.List;

public interface UsuarioService{
    public Usuario findById(Long id);
    public List<Usuario> findAll();

    public boolean save(Usuario usuario);
    public boolean deleteById(Long id);
}
