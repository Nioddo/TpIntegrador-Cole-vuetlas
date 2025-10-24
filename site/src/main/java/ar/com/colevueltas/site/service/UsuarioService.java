package ar.com.colevueltas.site.service;

import ar.com.colevueltas.site.dto.NivelDTO;
import ar.com.colevueltas.site.dto.ReputacionVendedorDTO;
import ar.com.colevueltas.site.dto.UsuarioCrearDTO;
import ar.com.colevueltas.site.globals.BadRequestException;
import ar.com.colevueltas.site.model.Usuario;
import ar.com.colevueltas.site.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioService {
    @Autowired
    /*private PasswordEncoder passwordEncoder;*/

    private final UsuarioRepository repository;
    private final NivelRepository nivelRepository;

    public UsuarioService(UsuarioRepository repository, NivelRepository nivelRepository) {
        this.repository = repository;
        this.nivelRepository = nivelRepository;
    }

    public Usuario create(UsuarioCrearDTO dto){
        Usuario usuario = new Usuario();

        if(repository.existsByMail(dto.getMail())){
            throw new BadRequestException("El mail ya está en uso");
        }
        if(repository.existsByDni(dto.getDni())){
            throw new BadRequestException("El dni ya está en uso");
        }

        usuario.setNombre(dto.getNombre());
        usuario.setApellido(dto.getApellido());
        usuario.setMail(dto.getMail());
        usuario.setContraseña(dto.getContraseña());
        usuario.setDni(dto.getDni());

        usuario.setFecha_registro(LocalDateTime.now());

        usuario.setGenero(dto.getGenero());
        usuario.setFecha_nacimiento(dto.getFecha_nacimiento());
        usuario.setTelefono(dto.getTelefono());

        usuario.setNivel(1);
        usuario.setEs_verificado(false);
        usuario.setCalificacion_vendedor_promedio(0.0);
        usuario.setTotal_calificaciones_vendedor(0);
        usuario.setCalificacion_comprador_promedio(0.0);
        usuario.setTotal_calificaciones_comprador(0);
        usuario.setXp(0);
        usuario.setFecha_eliminacion(null);

        return repository.save(usuario);
    }

    public NivelDTO obtenerNivel(int id){
        Usuario user = repository.findById(id);
        return new NivelDTO(id, user.getXp(), user.getNivel(), nivelRepository.findByNivel(user.getNivel()).getNombreNivel());
    }

    public ReputacionVendedorDTO obtenerReputacionVendedor(int id){
        Usuario user = repository.findById(id);
        return new ReputacionVendedorDTO(id, user.getCalificacion_vendedor_promedio(), user.getTotal_calificaciones_vendedor());
    }
}
