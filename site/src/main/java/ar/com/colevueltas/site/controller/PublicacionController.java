package ar.com.colevueltas.site.controller;

import ar.com.colevueltas.site.dto.PublicacionDTO;
import ar.com.colevueltas.site.model.Publicacion;
import ar.com.colevueltas.site.repository.PublicacionRepository;
import ar.com.colevueltas.site.service.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")

public class PublicacionController {

    private final PublicacionService publicacionService;

    @Autowired
    public PublicacionController(PublicacionService publicacionService) {
        this.publicacionService = publicacionService;
    }

    @Autowired
    private PublicacionRepository repository;

    @GetMapping
    public String pagPrinc(){
        return "PAGIUNA PRINCIPAL PRODICTOS";
    }

    @GetMapping("/{id}")
    public PublicacionDTO prodInd(@PathVariable("id") int id){
        return publicacionService.obtenerPostDeID(id);
    }

    @PostMapping("/new")
    public Publicacion createPublicacion(@RequestBody PublicacionDTO dto) {
        return publicacionService.create(dto);
    }

    @PutMapping("/{id}")
    public Publicacion replacePublicacion(@PathVariable int id, @RequestBody PublicacionDTO dto) {
        return publicacionService.replace(id, dto);
    }

    @PatchMapping("/{id}")
    public Publicacion updatePublicacion(@PathVariable int id, @RequestBody PublicacionDTO dto) {
        return publicacionService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletePublicacion(@PathVariable int id) {
        publicacionService.delete(id);
    }

}
