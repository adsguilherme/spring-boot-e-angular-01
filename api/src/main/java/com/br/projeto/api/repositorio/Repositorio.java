package com.br.projeto.api.repositorio;

import com.br.projeto.api.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Cliente, Long> {

}
