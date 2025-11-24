package ar.com.colevueltas.site.controller;

import ar.com.colevueltas.site.dto.ColeDTO;
import ar.com.colevueltas.site.service.ColegioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")

public class ColeController {

    private final ColegioService colegioService;

    public ColeController(ColegioService colegioService) {
        this.colegioService = colegioService;
    }

    @GetMapping("/colegios")
    public List<ColeDTO> obtenerColegios() {
        return colegioService.colegios();
    }
}
