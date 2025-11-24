package ar.com.colevueltas.site.service;

import ar.com.colevueltas.site.dto.ColeDTO;
import ar.com.colevueltas.site.model.Colegio;
import ar.com.colevueltas.site.repository.ColegioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ColegioService {
    private final ColegioRepository colegioRepository;

    public ColegioService(ColegioRepository colegioRepository) {
        this.colegioRepository = colegioRepository;
    }

    public List<ColeDTO> colegios(){
        List<ColeDTO> listaColeCursos=new ArrayList<>();
        for(Colegio cole : colegioRepository.findAll()){
            ColeDTO coleDto = new ColeDTO();

            coleDto.setNombre(cole.getNombre());
            coleDto.setId(cole.getId());
            coleDto.setDireccion(cole.getDireccion());
            coleDto.setLogo(cole.getLogo());
            listaColeCursos.add(coleDto);
        }
        return listaColeCursos;
    }
}
