package br.senai.sc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "comentario")
public class Comentario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 250)
    @NotNull
    private String texto;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        this.texto = texto;
    }

    @Override
    public String toString(){
        return texto;
    }
}
