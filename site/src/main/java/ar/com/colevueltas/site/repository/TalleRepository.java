package ar.com.colevueltas.site.repository;

import ar.com.colevueltas.site.model.Talle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TalleRepository extends JpaRepository<Talle, Integer> {
    // Extra opcional si querés buscar por nombre
    Optional<Talle> findByTalle(String talle);
}
