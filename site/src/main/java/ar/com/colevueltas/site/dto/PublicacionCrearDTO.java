package ar.com.colevueltas.site.dto;

import ar.com.colevueltas.site.model.Condicion;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class PublicacionCrearDTO {

    @NotNull(message = "Error en idUsuarioVendedor")
    private Integer idUsuarioVendedor;

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

    public PublicacionCrearDTO() {
    }

    public PublicacionCrearDTO(Integer idUsuarioVendedor, String titulo, String descripcion, BigDecimal precio, Condicion condicion, Integer idCategoria) {
        this.idUsuarioVendedor = idUsuarioVendedor;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.condicion = condicion;
        this.idCategoria = idCategoria;
    }

    public Integer getIdUsuarioVendedor() {
        return idUsuarioVendedor;
    }

    public void setIdUsuarioVendedor(Integer idUsuarioVendedor) {
        this.idUsuarioVendedor = idUsuarioVendedor;
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
}
