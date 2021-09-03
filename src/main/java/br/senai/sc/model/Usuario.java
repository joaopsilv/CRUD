package br.senai.sc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "usuario")
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100)
    @NotNull
    private String nome;

    @Size(max = 10)
    @NotNull
    private String turma;

    @Size(max = 10)
    @NotNull
    private String ano;

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

    public String getTurma(){
        return turma;
    }
    public void setTurma(String turma){
        this.turma = turma;
    }

    public String getAno(){
        return ano;
    }
    public void setAno(String ano){
        this.ano = ano;
    }

    @Override
    public String toString(){
        return nome;
    }
}
