package br.senai.sc.controller;

import br.senai.sc.model.Usuario;
import br.senai.sc.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UsuarioController{

    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/usuario/list")
    public String list(Model model){
        model.addAttribute("usuarios", usuarioService.findAll());
        return "/usuario/list";
    }

    @GetMapping("/usuario/add")
    public String add(Model model){
        model.addAttribute("usuario", new Usuario());
        return "/usuario/add";
    }

    @PostMapping("/usuario/save")
    public RedirectView save(Usuario usuario){
        usuarioService.save(usuario);
        return new RedirectView("/usuario/list");
    }

    @GetMapping("/usuario/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("usuario", usuarioService.findById(id));
        return "/usuario/edit";
    }

    @PostMapping("/usuario/edit/{id}")
    public RedirectView editUsuario(Usuario usuario, @PathVariable("id") long id){
        Usuario user = usuarioService.findById(id);
        user.setNome(usuario.getNome());
        user.setAno(usuario.getAno());
        user.setTurma(usuario.getTurma());
        usuarioService.save(user);
        return new RedirectView("/usuario/list");
    }

    @PostMapping("/usuario/delete/{id}")
    public RedirectView deleteById(@PathVariable("id") long id){
        usuarioService.deleteById(id);
        return new RedirectView("/usuario/list");
    }
}
