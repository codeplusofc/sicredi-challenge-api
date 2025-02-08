package com.sicredi.challenge.controller; // declaração do pacote controller

import com.sicredi.challenge.entity.UserEntity; // importando a classe UserEntity
import com.sicredi.challenge.repository.UserRepository; // Importa a interface UserRepository
import org.springframework.beans.factory.annotation.Autowired; // Importa a anotação @Autowired, que permite injetar automaticamente dependências (como o UserRepository) no controlador.
import org.springframework.web.bind.annotation.*; // Essa linha importa todas as anotações (Tipo @RestController)

import java.util.List; // Importa a classe List, que será usada para retornar uma lista de objetos do tipo UserEntity.

@RestController // define que essa classe é um controlador REST
@RequestMapping ("/user") // define o caminho para as requisições, qualquer requisição que comece com /user será direcionada para essa classe
public class UserController { // Aqui declaramos a classe UserController
    @Autowired
    private UserRepository userRepository; // Injeta automaticamente uma instância do UserRepository no controlador. Isso permite que o controlador use os métodos do repositório para acessar o banco de dados.

    @GetMapping // Mapeia requisições do tipo GET(read)
    public List<UserEntity> retornaUsuario() {
        return userRepository.findAll(); // Retorna todos os usuários cadastrados no banco de dados. O metodo findAll() é fornecido pelo Spring Data JPA.

    }

    @PostMapping // Mapeia requisições do tipo POST(create)
    public UserEntity createUser(@RequestBody UserEntity userEntity) { // irá receber um corpo do tipo JSON e criar um objeto do tipo UserEntity de nome userEntity
        return userRepository.save(userEntity); // Salva o novo usuário no banco de dados e retorna o objeto salvo.
    }

}
