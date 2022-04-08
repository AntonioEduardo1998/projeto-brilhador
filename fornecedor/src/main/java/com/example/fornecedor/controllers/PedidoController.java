package com.example.fornecedor.controllers;

import com.example.fornecedor.domain.Pedido;
import com.example.fornecedor.repositories.FornecedorRepository;
import com.example.fornecedor.repositories.PedidoRepository;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Error;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {
    
    private static final Pedido Error = null;
    private final FornecedorRepository fornecedorRepository;
    private final PedidoRepository pedidoRepository;

    public PedidoController(FornecedorRepository fornecedorRepository, PedidoRepository pedidoRepository) {
        this.fornecedorRepository = fornecedorRepository;
        this.pedidoRepository = pedidoRepository;
    }

    @GetMapping("/fornecedores/pedidos")
    Iterable<Pedido> listar(){
        return pedidoRepository.findAll();
    }

    @PostMapping("/pedido")
    Pedido incluir(@RequestBody Pedido novoPedido){
        String produto = FornecedorRepository.getProduto(novoPedido.getId_produto());
        if (!produto.isEmpty()) {
            return pedidoRepository.save(novoPedido);
        } else {
            return Error;
        }
    }
}
