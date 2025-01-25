package com.sicredi.challenge.controller;

import com.sicredi.challenge.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/user")
public class UserController {

    @GetMapping
    public UserEntity retornaUsuario() {
        UserEntity usuario = new UserEntity();
        usuario.setNome("Gabriel");
        return usuario;
    }

}
