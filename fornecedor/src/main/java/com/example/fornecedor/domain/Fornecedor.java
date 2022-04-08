package com.example.fornecedor.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static java.util.UUID.randomUUID;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String cidade;

    public Fornecedor() {
    }

    public Fornecedor(String nome) {
        this.id = randomUUID();
        this.setNome(nome);
    }

    public Fornecedor(String nome, String cidade) {
        this.id = randomUUID();
        this.setNome(nome);
        this.setCidade(cidade);
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public UUID getId() {
        return id;
    }

    
}
