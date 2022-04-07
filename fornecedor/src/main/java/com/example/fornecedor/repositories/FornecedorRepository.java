package com.example.fornecedor.repositories;

import com.example.fornecedor.domain.Fornecedor;

import org.springframework.data.repository.CrudRepository;

public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {
}
