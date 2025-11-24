package ar.com.colevueltas.site.model;

import jakarta.persistence.*;

@Entity
@Table(name = "publicacion_uniforme")
public class PublicacionUniforme {

    @Id
    @Column(name = "id_publicacion")
    private Integer idPublicacion;

    @ManyToOne
    @JoinColumn(name = "id_talle", referencedColumnName = "id")
    private Talle talle;

    @Column(name = "id_colegio")
    private Integer idColegio;

    public PublicacionUniforme() {}

    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Talle getTalle() {
        return talle;
    }

    public void setTalle(Talle talle) {
        this.talle = talle;
    }

    public Integer getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(Integer idColegio) {
        this.idColegio = idColegio;
    }
}
