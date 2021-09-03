package br.senai.sc.service;

import br.senai.sc.model.Usuario;
import br.senai.sc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    UsuarioRepository usuarioRepository;

    public Usuario findById(Long id){
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll(Sort.by("id"));
    }

    public boolean save(Usuario usuario){
        try{
           if (usuario != null){
               usuarioRepository.save(usuario);
               return true;
           }else{
               return false;
           }
        }catch (Exception e){
            System.out.println("Erro ao salvar o usuário.");
            return false;
        }
    }

    public boolean deleteById(Long id){
        try{
            if (id != null || id > 0){
                usuarioRepository.deleteById(id);
                return true;
            }else{
                return false;
            }
        } catch (Exception e){
            System.out.println("Erro ao deletar o usuário.");
            return false;
        }
    }
}
