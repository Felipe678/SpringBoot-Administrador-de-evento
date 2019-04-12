/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventoapp.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author Felipe Oliveira2
 */
@Entity
public class Evento implements Serializable{
    private static final long serialVersioUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    @NotBlank
    private String nome;
    @NotBlank
    private String local;
    @NotBlank
    private String data;
    @NotBlank
    private String horario;
    
    @OneToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Convidado> convidados;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
    
}
