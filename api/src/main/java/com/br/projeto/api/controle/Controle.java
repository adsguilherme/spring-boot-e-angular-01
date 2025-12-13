package com.br.projeto.api.controle;

import com.br.projeto.api.modelo.Cliente;
import com.br.projeto.api.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    @Autowired
    private Repositorio acao;

    @PostMapping("/cadastrar")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return acao.save(cliente);
    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }

//    @GetMapping("/")
//    public String teste(){
//        return "Hello World!";
//    }
}