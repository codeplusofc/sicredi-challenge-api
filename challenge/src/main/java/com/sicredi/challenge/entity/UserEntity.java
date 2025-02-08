package com.sicredi.challenge.entity; // declaração do pacote

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserEntity { //A classe UserEntity representa uma entidade (como um usuário) que será usada no controlador
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome; // atributo do usuário encapsulado

    public String getNome() { // metodo get
        return nome;
    }

    public void setNome(String nome) { //metodo set
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
