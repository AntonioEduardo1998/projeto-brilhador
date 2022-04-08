package com.example.fornecedor.repositories;

import com.example.fornecedor.domain.Fornecedor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.client.RestTemplate;

public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {

    final String url_estoque = "http://localhost:3009/products/";
    
    RestTemplate restTemplate = new RestTemplate();

    public static String getEstoque(){
        String result = restTemplate.getForObject(url_estoque, String.class);
        return result;
    }

    public static String getProduto(Number id){
        String url = url_estoque.concat(id.toString());
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}
