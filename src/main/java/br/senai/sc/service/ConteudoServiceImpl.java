package br.senai.sc.service;

import br.senai.sc.model.Conteudo;
import br.senai.sc.repository.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConteudoServiceImpl implements ConteudoService{
    @Autowired
    ConteudoRepository conteudoRepository;

    public Conteudo findById(Long id){
        return conteudoRepository.findById(id).get();
    }

    public List<Conteudo> findAll(){
        return conteudoRepository.findAll(Sort.by("id"));
    }

    public boolean save(Conteudo conteudo){
        try{
            if (conteudo != null){
                conteudoRepository.save(conteudo);
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println("Erro ao salvar o conteúdo.");
            return false;
        }
    }

    public boolean deleteById(Long id){
        try{
            if (id != null || id > 0){
                conteudoRepository.deleteById(id);
                return true;
            }else{
                return false;
            }
        } catch (Exception e){
            System.out.println("Erro ao deletar o conteúdo.");
            return false;
        }
    }
}
