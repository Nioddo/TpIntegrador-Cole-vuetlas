package ar.com.colevueltas.site.repository;

import ar.com.colevueltas.site.model.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Integer> {

    List<Publicacion> findByEstado(String estado);

    List<Publicacion> findById_usuario_vendedor(int id_usuario_vendedor);

    List<Publicacion> findById_categoria(int id_categoria);
}
