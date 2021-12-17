package com.raul.hello_crud;

import org.springframework.web.bind.anotation.RestController;

@RestController
public class Read_User {

    @RequestMapping("/crear_usuario")
    public String creating(){
        return "GET_data_user";
    }
}

