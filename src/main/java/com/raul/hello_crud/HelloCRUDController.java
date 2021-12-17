package com.raul.hello_crud;

import org.springframework.web.bind.anotation.RequestMapping;
import org.springframework.web.bind.anotation.RestController;

@RestController
public class hello_crudController {

    @RequestMapping("/home")
    public String hello(){
        return "Hello brow";
    }
}