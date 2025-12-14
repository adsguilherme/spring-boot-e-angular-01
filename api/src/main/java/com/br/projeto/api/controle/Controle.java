package com.br.projeto.api.controle;

import com.br.projeto.api.modelo.Cliente;
import com.br.projeto.api.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/")
    public Cliente editar(@RequestBody Cliente cliente){
        return acao.save(cliente);
    }

    @DeleteMapping("/{codigo}")
    public void remover(@PathVariable long codigo){
        acao.deleteById(codigo);
    }

    @GetMapping("/hw")
    public String teste(){
        return "Hello World!";
    }
}