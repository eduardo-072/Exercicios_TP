package atividade04.spring.controller;

import atividade04.spring.model.Pais;
import atividade04.spring.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PaisController {

    @Autowired
    private PaisService service;

    @GetMapping("/")
    public String form() {
        return "form";
    }

    @PostMapping("/buscar")
    public String buscarPais(@RequestParam String nome, Model model) {

        Pais pais = service.buscarPais(nome);
        model.addAttribute("pais", pais);

        return "resultado";
    }
}