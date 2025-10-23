/*package ar.com.colevueltas.site.AAAporahorano;

import ar.com.colevueltas.site.dto.PublicacionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")

public class PublicacionNOController {

    private final PublicacionNOService publicacionService;

    @Autowired
    public PublicacionNOController(PublicacionNOService publicacionService) {
        this.publicacionService = publicacionService;
    }

    @Autowired
    private PublicacionNORepository repository;

    @GetMapping
    public String pagPrinc(){
        return "PAGIUNA PRINCIPAL PRODICTOS";
    }

    @GetMapping("/{id}")
    public PublicacionDTO prodInd(@PathVariable("id") int id){
        return publicacionService.obtenerPostDeID(id);
    }

    @PostMapping("/new")
    public PublicacionNO createPublicacion(@RequestBody PublicacionDTO dto) {
        return publicacionService.create(dto);
    }

    @PutMapping("/{id}")
    public PublicacionNO replacePublicacion(@PathVariable int id, @RequestBody PublicacionDTO dto) {
        return publicacionService.replace(id, dto);
    }

    @PatchMapping("/{id}")
    public PublicacionNO updatePublicacion(@PathVariable int id, @RequestBody PublicacionDTO dto) {
        return publicacionService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletePublicacion(@PathVariable int id) {
        publicacionService.delete(id);
    }

}*/
