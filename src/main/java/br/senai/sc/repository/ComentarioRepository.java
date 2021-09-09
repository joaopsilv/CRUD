package br.senai.sc.repository;

import br.senai.sc.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{
    public List<Comentario> findAll();
}
