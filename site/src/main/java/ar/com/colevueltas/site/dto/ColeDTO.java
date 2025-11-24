package ar.com.colevueltas.site.dto;

import java.util.List;

public class ColeDTO {
    private Integer id;
    private String nombre;
    private String direccion;
    private String logo;

    public ColeDTO() {
    }

    public ColeDTO(Integer id, String nombre, String direccion, String logo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.logo = logo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
