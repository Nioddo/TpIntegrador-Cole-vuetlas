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
        List<Publicacion> publicaciones = repository.findById_usuario_vendedor(idVendedor);

        return publicaciones.stream().map(pub -> {
            PublicacionDTO dto = new PublicacionDTO();
            dto.setId(pub.getId());
            dto.setTitulo(pub.getTitulo());
            dto.setDescripcion(pub.getDescripcion());
            dto.setPrecio(pub.getPrecio());
            dto.setCondicion(pub.getCondicion());
            dto.setEstado(pub.getEstado());
            dto.setId_categoria(pub.getId_categoria());
            dto.setFecha_publicacion(pub.getFecha_publicacion());
            return dto;
        }).toList();
    }

    public Publicacion create(int id_usuario_vendedor, PublicacionCrearDTO dto) {
        Publicacion publicacion = new Publicacion();

        publicacion.setId_usuario_vendedor(id_usuario_vendedor);
        publicacion.setTitulo(dto.getTitulo());
        publicacion.setDescripcion(dto.getDescripcion());
        publicacion.setPrecio(dto.getPrecio());
        publicacion.setCondicion(dto.getCondicion());
        publicacion.setId_categoria(dto.getIdCategoria());
        publicacion.setEstado(EstadoPublicacion.Activo);
        publicacion.setFecha_publicacion(LocalDateTime.now());
        publicacion.setFecha_ultima_actualizacion(LocalDateTime.now());
        publicacion.setDescuento(BigDecimal.ZERO);
        publicacion.setDescuento_fecha_inicio(null);
        publicacion.setDescuento_fecha_fin(null);
        publicacion.setFecha_eliminacion(null);

        return repository.save(publicacion);
    }

}
