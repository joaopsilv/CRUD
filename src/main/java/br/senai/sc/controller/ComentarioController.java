package br.senai.sc.controller;

import br.senai.sc.model.Comentario;
import br.senai.sc.service.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ComentarioController{

    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/comentario/list")
    public String list(Model model){
        model.addAttribute("comentarios", comentarioService.findAll());
        return "/comentario/list";
    }

    @GetMapping("/comentario/add")
    public String add(Model model){
        model.addAttribute("comentario",new Comentario());
        return "/comentario/add";
    }

    @PostMapping("/comentario/save")
    public RedirectView save(Comentario comentario){
        comentarioService.save(comentario);
        return new RedirectView("/comentario/list");
    }

    @GetMapping("/comentario/edit/{id}")
    public String edit(@PathVariable long id, Model model){
        model.addAttribute("comentario", comentarioService.findById(id));
        return "/comentario/edit";
    }

    @PostMapping("/comentario/edit/{id}")
    public RedirectView editComentario(Comentario comentario, @PathVariable("id") long id){
        Comentario coment = comentarioService.findById(id);
        coment.setTexto(comentario.getTexto());
        comentarioService.save(coment);
        return new RedirectView("/comentario/list");
    }

    @PostMapping("/comentario/delete/{id}")
    public RedirectView deleteById(@PathVariable("id") long id){
        comentarioService.deleteById(id);
        return new RedirectView("/comentario/list");
    }
}
