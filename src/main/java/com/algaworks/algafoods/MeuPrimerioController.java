package com.algaworks.algafoods;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AtivaçãoCliente;

@Controller
public class MeuPrimerioController {

    @GetMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "Hello !";
    }

}
