package br.com.aquila.rebeca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/perfil")
public class PerfilController {
    @GetMapping
    public String index(){
        return "perfil/pesquisa";
    }

    public String pesquisa(){
        return "";
    }
}
