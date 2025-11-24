package ar.com.colevueltas.site.dto;

import ar.com.colevueltas.site.model.Condicion;
import ar.com.colevueltas.site.model.Tipo;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

public class PublicacionCrearDTO {

    @NotBlank(message = "El titulo es obligatorio")
    private String titulo;

    private String descripcion;

    @NotNull(message = "El precio es obligatorio")
    @Min(value = 0, message = "El precio no puede ser menor a cero")
    private BigDecimal precio;

    @NotNull(message = "Elegir una condición")
    private Condicion condicion;

    @NotNull(message = "Elegir una categoría")
    private Integer idCategoria;

    @NotNull(message = "Debe agregar al menos una imagen")
    private List<MultipartFile> imagenes;

    private Integer idColegio;

    @NotNull(message = "Debe ser objeto o publicacion")
    private Tipo tipoPublicacion;

    private Integer idTalle;

    public PublicacionCrearDTO() {
    }

    public PublicacionCrearDTO(String titulo, String descripcion, BigDecimal precio, Condicion condicion, Integer idCategoria, List<MultipartFile> imagenes, Integer idColegio, Tipo tipoPublicacion, Integer idTalle) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.condicion = condicion;
        this.idCategoria = idCategoria;
        this.imagenes = imagenes;
        this.idColegio = idColegio;
        this.tipoPublicacion = tipoPublicacion;
        this.idTalle = idTalle;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public List<MultipartFile> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<MultipartFile> imagenes) {
        this.imagenes = imagenes;
    }

    public Integer getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(Integer idColegio) {
        this.idColegio = idColegio;
    }

    public Tipo getTipoPublicacion() {
        return tipoPublicacion;
    }

    public void setTipoPublicacion(Tipo tipoPublicacion) {
        this.tipoPublicacion = tipoPublicacion;
    }

    public Integer getIdTalle() {
        return idTalle;
    }

    public void setIdTalle(Integer idTalle) {
        this.idTalle = idTalle;
    }
}
