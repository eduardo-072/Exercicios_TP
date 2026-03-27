package clima.springClima.controller;

import clima.springClima.model.ClimaDados;
import clima.springClima.service.ClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClimaController {

    @Autowired
    private ClimaService service;

    @GetMapping("/")
    public String form() {
        return "form";
    }

    @PostMapping("/buscar")
    public String buscar(@RequestParam double latitude,
                         @RequestParam double longitude,
                         Model model) {

        ClimaDados dados = service.buscarClima(latitude, longitude);

        if (dados == null) {
            model.addAttribute("erro", "Erro ao buscar clima");
            return "form";
        }

        String descricao = service.descricaoClima(
                dados.getClimaAtual().getWeathercode()
        );

        model.addAttribute("dados", dados);
        model.addAttribute("descricao", descricao);

        return "index";
    }
}