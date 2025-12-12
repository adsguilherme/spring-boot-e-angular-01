package com.br.projeto.api.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes") // Se não passar o name, vai pegar o nome da classe (ficando Cliente).
@Getter
@Setter
public class Cliente {

    @Id // Annotation para dizer que código será nossa chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Annotation para dizer que o código será gerado automaticamente
    private long codigo;
    private String nome;
    private int idade;
    private String cidade;

}
