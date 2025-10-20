package ar.com.colevueltas.site.service;

import ar.com.colevueltas.site.dto.UsuarioCrearDTO;
import ar.com.colevueltas.site.model.Usuario;
import ar.com.colevueltas.site.repository.ChatRepository;
import ar.com.colevueltas.site.repository.CompraRepository;
import ar.com.colevueltas.site.repository.PublicacionRepository;
import ar.com.colevueltas.site.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioService {
    @Autowired
    /*private PasswordEncoder passwordEncoder;*/

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario create(UsuarioCrearDTO dto){
        Usuario usuario = new Usuario();

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

        return repository.save(usuario);
    }
}
