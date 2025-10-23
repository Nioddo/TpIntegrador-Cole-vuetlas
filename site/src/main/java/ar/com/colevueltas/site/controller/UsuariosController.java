package ar.com.colevueltas.site.controller;

import ar.com.colevueltas.site.dto.NivelDTO;
import ar.com.colevueltas.site.dto.ReputacionVendedorDTO;
import ar.com.colevueltas.site.dto.UsuarioCrearDTO;
import ar.com.colevueltas.site.model.Usuario;
import ar.com.colevueltas.site.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")

public class UsuariosController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuariosController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @PostMapping
    public Usuario createUsuario(@RequestBody UsuarioCrearDTO dto){
        return usuarioService.create(dto);
    }

    @GetMapping("/{id}/nivel")
    public NivelDTO buscarNivel(@PathVariable("id") int id){
        return usuarioService.obtenerNivel(id);
    }

    @GetMapping("/{id}/reputacion")
    public ReputacionVendedorDTO buscarReputacion(@PathVariable("id") int id){
        return usuarioService.obtenerReputacionVendedor(id);
    }
}
