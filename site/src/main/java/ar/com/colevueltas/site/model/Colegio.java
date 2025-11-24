package ar.com.colevueltas.site.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "colegio")
public class Colegio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;

    private String direccion;

    private String logo;

    public Colegio() {}

    public Colegio(String nombre, String direccion, String logo) {
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
