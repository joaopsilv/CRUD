package br.senai.sc.repository;

import br.senai.sc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    public List<Usuario> findAll();
}
