package com.example.fornecedor.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Pedido {
    @Id
    @GeneratedValue
    private Long id;
    private String autor;
    private String descricao;
    private Number id_produto;
    
    public Pedido() {
    }

    public Pedido(String autor, String descricao, Number id_produto) {
        this.autor = autor;
        this.descricao = descricao;
        this.id_produto = id_produto;
    }
    
    public String getAutor() {
        return autor;
    }
    public Number getId_produto() {
        return id_produto;
    }
    public void setId_produto(Number id_produto) {
        this.id_produto = id_produto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
