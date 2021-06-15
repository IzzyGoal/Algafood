package com.algaworks.algafoods;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimerioController {

    @GetMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "Hello !";
    }
}
