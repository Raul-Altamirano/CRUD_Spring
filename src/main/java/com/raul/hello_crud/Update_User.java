package com.raul.hello_crud;

import org.springframework.web.bind.anotation.RestController;

@RestController
public class Update_User {

    @RequestMapping("/actualizar_usuario")
    public String update(){
        return "PUT_user";
    }
}

