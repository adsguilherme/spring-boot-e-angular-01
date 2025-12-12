package com.br.projeto.api.controle;

import com.br.projeto.api.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @Autowired
    private Repositorio acao;

    @GetMapping("/")
    public String teste(){
        return "Hello World!";
    }
}