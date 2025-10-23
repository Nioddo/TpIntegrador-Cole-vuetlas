package ar.com.colevueltas.site.dto;

import ar.com.colevueltas.site.model.Condicion;
import java.math.BigDecimal;

public class PublicacionCrearDTO {

    private Integer idUsuarioVendedor;
    private String titulo;
    private String descripcion;
    private BigDecimal precio;
    private Condicion condicion;
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
