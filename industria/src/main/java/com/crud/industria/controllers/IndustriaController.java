package com.crud.industria.controllers;

import com.crud.industria.domain.Industria;
import com.crud.industria.repositories.IndustriaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndustriaController {

    private final IndustriaRepository repository;

    IndustriaController(IndustriaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/industrias")
    Iterable<Industria> listar(){
        return repository.findAll();
    }

    @PostMapping("/industria")
    Industria incluir(@RequestBody Industria novaIndustria){
        return repository.save(novaIndustria);
    }

}
