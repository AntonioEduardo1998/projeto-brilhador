package com.example.fornecedor.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue
    private Number id;
    private String nome;
    private String descricao;
    private String tipo;
    private UUID id_fornecedor;
    
    public Produto() {
    }

    public Produto(String nome, String descricao, String tipo, UUID id_fornecedor) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.id_fornecedor = id_fornecedor;
    }

    public UUID getId_fornecedor() {
        return id_fornecedor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setId_fornecedor(UUID id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

}
