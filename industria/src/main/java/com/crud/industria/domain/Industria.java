package com.crud.industria.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.UUID;

import static java.util.UUID.randomUUID;

@Entity
public class Industria {

    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String tipo;
    private String cidade;


    public Industria() {
    }

    public Industria(String nome, String tipo, String cidade) {
        this.id = randomUUID();
        this.nome = nome;
        this.tipo = tipo;
        this.cidade = cidade;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
