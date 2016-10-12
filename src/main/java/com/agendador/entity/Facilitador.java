package com.agendador.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by Ivaldo on 12/10/2016.
 */
public class Facilitador {

    @Id
    private String id;

    private String nome;

    private String cargo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
