package ar.com.colevueltas.site.service;


import ar.com.colevueltas.site.dto.CompraDTO;
import ar.com.colevueltas.site.dto.PublicacionCrearDTO;
import ar.com.colevueltas.site.dto.PublicacionDTO;
import ar.com.colevueltas.site.model.Compra;
import ar.com.colevueltas.site.model.EstadoPublicacion;
import ar.com.colevueltas.site.model.Publicacion;
import ar.com.colevueltas.site.repository.PublicacionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PublicacionService {
    private final PublicacionRepository repository;

    public PublicacionService(PublicacionRepository repository) {
        this.repository = repository;
    }

    public List<PublicacionDTO> getPublicacionesByUsuario(int idVendedor) {
        List<Publicacion> publicaciones = repository.findByIdUsuarioVendedor(idVendedor);

        return publicaciones.stream().map(pub -> {
            PublicacionDTO dto = new PublicacionDTO();
            dto.setId(pub.getId());
            dto.setTitulo(pub.getTitulo());
            dto.setDescripcion(pub.getDescripcion());
            dto.setPrecio(pub.getPrecio());
            dto.setCondicion(pub.getCondicion());
            dto.setEstado(pub.getEstado());
            dto.setId_categoria(pub.getIdCategoria());
            dto.setFecha_publicacion(pub.getFechaPublicacion());
            return dto;
        }).toList();
    }

    public Publicacion create(int id_usuario_vendedor, PublicacionCrearDTO dto) {
        Publicacion publicacion = new Publicacion();

        publicacion.setIdUsuarioVendedor(id_usuario_vendedor);
        publicacion.setTitulo(dto.getTitulo());
        publicacion.setDescripcion(dto.getDescripcion());
        publicacion.setPrecio(dto.getPrecio());
        publicacion.setCondicion(dto.getCondicion());
        publicacion.setIdCategoria(dto.getIdCategoria());
        publicacion.setEstado(EstadoPublicacion.Activo);
        publicacion.setFechaPublicacion(LocalDateTime.now());
        publicacion.setFechaUltimaActualizacion(LocalDateTime.now());
        publicacion.setDescuento(BigDecimal.ZERO);
        publicacion.setDescuentoFechaInicio(null);
        publicacion.setDescuentoFechaFin(null);
        publicacion.setFechaEliminacion(null);

        return repository.save(publicacion);
    }

}
