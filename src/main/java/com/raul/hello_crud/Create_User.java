package com.raul.hello_crud;

import org.springframework.web.bind.anotation.RestController;

@RestController
public class Create_User {

    @RequestMapping("/crear_usuario")
    public String creating(){
        return "POST_data_user";
    }
}

