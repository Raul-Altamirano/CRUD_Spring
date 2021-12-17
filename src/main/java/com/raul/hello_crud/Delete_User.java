package com.raul.hello_crud;

import org.springframework.web.bind.anotation.RestController;

@RestController
public class Delete_User {

    @RequestMapping("/borrar_usuario")
    public String deleting(){
        return "Delete_user";
    }
}

