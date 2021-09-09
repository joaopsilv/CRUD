package br.senai.sc.service;

import br.senai.sc.model.Comentario;
import br.senai.sc.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService{
    @Autowired
    ComentarioRepository comentarioRepository;

    public Comentario findById(Long id){
        return comentarioRepository.findById(id).get();
    }

    public List<Comentario> findAll(){
        return comentarioRepository.findAll(Sort.by("id"));
    }

    public boolean save(Comentario comentario){
        try{
            if (comentario != null){
                comentarioRepository.save(comentario);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println("Erro ao salvar o comentário.");
            return false;
        }
    }

    public boolean deleteById(Long id){
        try{
            if (id != null || id > 0){
                comentarioRepository.deleteById(id);
                return true;
            }else{
                return false;
            }
        } catch (Exception e){
            System.out.println("Erro ao deletar o comentário.");
            return false;
        }
    }
}
