package br.senai.sc.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "conteudo")
public class Conteudo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100)
    @NotNull
    private String nome;

    @Size(max = 250)
    @NotNull
    private String descricao;

    @Size(max = 25)
    @NotNull
    private String data;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "comentario_id")
    private Comentario comentario;

    public Conteudo(){
    }

    public Conteudo(String nome, String descircao, String data){
        this.nome = nome;
        this.descricao = descircao;
        this.data = data;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data = data;
    }

    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public Comentario getComentario(){
        return comentario;
    }
    public void setComentario(Comentario comentario){
        this.comentario = comentario;
    }
}
