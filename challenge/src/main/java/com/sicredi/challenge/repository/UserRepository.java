package com.sicredi.challenge.repository; // Aqui estamos declarando o pacote onde essa interface está localizada

import com.sicredi.challenge.entity.UserEntity; // Essa linha importa a classe UserEntity
import org.springframework.data.jpa.repository.JpaRepository; // Essa linha importa a interface JpaRepository do Spring Data JPA
import org.springframework.stereotype.Repository; // Essa linha importa a anotação @Repository

@Repository // Essa anotação marca a interface como um repositório
public interface UserRepository extends JpaRepository<UserEntity, Long> {
} // Define um repositório para a entidade UserEntity com métodos CRUD prontos e operações no banco de dados usando Spring Data JPA.
