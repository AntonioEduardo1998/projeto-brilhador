package com.example.fornecedor.repositories;

import com.example.fornecedor.domain.Pedido;

import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {

}
