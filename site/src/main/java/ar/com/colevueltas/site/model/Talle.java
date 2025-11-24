package ar.com.colevueltas.site.model;

import jakarta.persistence.*;

@Entity
@Table(name = "talles")
public class Talle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "talle", nullable = false, unique = true)
    private String talle;

    @Column(name = "descripcion")
    private String descripcion;

    // Constructors
    public Talle() {}

    public Talle(String talle, String descripcion) {
        this.talle = talle;
        this.descripcion = descripcion;
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
