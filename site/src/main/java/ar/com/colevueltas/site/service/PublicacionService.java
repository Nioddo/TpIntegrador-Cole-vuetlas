package ar.com.colevueltas.site.service;

import ar.com.colevueltas.site.dto.PublicacionDTO;
import ar.com.colevueltas.site.model.Publicacion;
import ar.com.colevueltas.site.repository.PublicacionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PublicacionService {
    private final PublicacionRepository repository;

    public PublicacionService(PublicacionRepository repository) {
        this.repository = repository;
    }

    public PublicacionDTO obtenerPostDeID(int idpub) {
        Publicacion pub = repository.findById(idpub).orElse(null);
        if (pub == null) return null;

        // Conversión manual a DTO
        PublicacionDTO dto = new PublicacionDTO();
        dto.setId(pub.getId());
        dto.setTitulo(pub.getTitulo());
        dto.setDescripcion(pub.getDescripcion());
        dto.setPublicacion(pub.getPublicacion());
        dto.setPrecio(pub.getPrecio());
        dto.setEstado(pub.getEstado());
        dto.setDescuento(pub.getDescuento());
        dto.setId_cat(pub.getId_cat());
        dto.setId_col(pub.getId_col());
        dto.setId_usu(pub.getId_usu());
        dto.setId_anio(pub.getId_anio());

        return dto;
    }

    public Publicacion create(PublicacionDTO dto){
        Publicacion p = new Publicacion();
        p.setTitulo(dto.getTitulo());
        p.setDescripcion(dto.getDescripcion());
        p.setPublicacion(dto.getPublicacion());
        p.setPrecio(dto.getPrecio());
        p.setEstado(dto.getEstado());
        p.setDescuento(dto.getDescuento());
        p.setId_cat(dto.getId_cat());
        p.setId_col(dto.getId_col());
        p.setId_usu(dto.getId_usu());
        p.setId_anio(dto.getId_anio());
        return repository.save(p);
    }

    public Publicacion replace(int id, PublicacionDTO dto) {
        Publicacion p = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Publicación no encontrada"));

        // Reemplazo completo
        p.setTitulo(dto.getTitulo());
        p.setDescripcion(dto.getDescripcion());
        p.setPublicacion(dto.getPublicacion());
        p.setPrecio(dto.getPrecio());
        p.setEstado(dto.getEstado());
        p.setDescuento(dto.getDescuento());
        p.setId_cat(dto.getId_cat());
        p.setId_col(dto.getId_col());
        p.setId_usu(dto.getId_usu());
        p.setId_anio(dto.getId_anio());

        return repository.save(p);
    }

    public Publicacion update(int id, PublicacionDTO dto) {
        Publicacion p = repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Publicación no encontrada"));

        // Actualización parcial: solo modifica los campos no nulos
        if(dto.getTitulo() != null) p.setTitulo(dto.getTitulo());
        if(dto.getDescripcion() != null) p.setDescripcion(dto.getDescripcion());
        if(dto.getPublicacion() != null) p.setPublicacion(dto.getPublicacion());
        if(dto.getPrecio() != null) p.setPrecio(dto.getPrecio());
        if(dto.getEstado() != null) p.setEstado(dto.getEstado());
        if(dto.getDescuento() != null) p.setDescuento(dto.getDescuento());
        if(dto.getId_cat() != 0) p.setId_cat(dto.getId_cat());
        if(dto.getId_col() != 0) p.setId_col(dto.getId_col());
        if(dto.getId_usu() != 0) p.setId_usu(dto.getId_usu());
        if(dto.getId_anio() != 0) p.setId_anio(dto.getId_anio());

        return repository.save(p);
    }

    public void delete(int id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Publicación no encontrada");
        }
        repository.deleteById(id);
    }

}
