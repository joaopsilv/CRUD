package br.senai.sc.repository;

import br.senai.sc.model.Conteudo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConteudoRepository extends JpaRepository<Conteudo, Long>{
    public List<Conteudo> findAll();
}
