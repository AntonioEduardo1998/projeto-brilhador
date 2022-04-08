package com.example.fornecedor.controllers;

import com.example.fornecedor.domain.Fornecedor;
import com.example.fornecedor.domain.Produto;
import com.example.fornecedor.repositories.FornecedorRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FornecedorController {
    
    private final FornecedorRepository fornecedorRepository;

    FornecedorController(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @GetMapping("/fornecedores")
    Iterable<Fornecedor> listar(){
        return fornecedorRepository.findAll();
    }

    @PostMapping("/fornecedor")
    Fornecedor incluir(@RequestBody Fornecedor novoFornecedor){
        return fornecedorRepository.save(novoFornecedor);
    }

    @GetMapping("/fornecedor/estoque")
    String listarEstoque() {
        return FornecedorRepository.getEstoque();
    }

}
