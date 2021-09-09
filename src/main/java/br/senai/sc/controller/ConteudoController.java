package br.senai.sc.controller;

import br.senai.sc.model.Conteudo;
import br.senai.sc.service.ComentarioServiceImpl;
import br.senai.sc.service.ConteudoServiceImpl;
import br.senai.sc.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ConteudoController{

    @Autowired
    ConteudoServiceImpl conteudoService;

    @Autowired
    UsuarioServiceImpl usuarioService;

    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping
    public String list(Model model){
        model.addAttribute("conteudos", conteudoService.findAll());
        return "conteudo/list";
    }

    @GetMapping("/conteudo/add")
    public String add(Model model){
        model.addAttribute("conteudo", new Conteudo());
        model.addAttribute("usuarios", usuarioService.findAll());
        model.addAttribute("comentarios", comentarioService.findAll());
        return "/conteudo/add";
    }

    @PostMapping("/conteudo/save")
    public RedirectView save(Conteudo conteudo){
        conteudoService.save(conteudo);
        return new RedirectView("/");
    }

    @GetMapping("/conteudo/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("conteudo", conteudoService.findById(id));
        model.addAttribute("usuarios", usuarioService.findAll());
        model.addAttribute("comentarios", comentarioService.findAll());
        return "/conteudo/edit";
    }

    @PostMapping("/conteudo/edit/{id}")
    public RedirectView editConteudo(Conteudo conteudo, @PathVariable("id") long id){
        Conteudo content = conteudoService.findById(id);
        content.setNome(conteudo.getNome());
        content.setDescricao(conteudo.getDescricao());
        content.setData(conteudo.getData());
        content.setUsuario(conteudo.getUsuario());
        content.setComentario(conteudo.getComentario());
        conteudoService.save(content);
        return new RedirectView("/");
    }

    @PostMapping("/conteudo/delete/{id}")
    public RedirectView deleteById(@PathVariable("id") long id){
        conteudoService.deleteById(id);
        return new RedirectView("/");
    }
}
