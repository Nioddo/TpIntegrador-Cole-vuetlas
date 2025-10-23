package ar.com.colevueltas.site.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int id_usuario_vendedor;

    private String titulo;

    private String descripcion;

    private BigDecimal precio;

    @Enumerated(EnumType.STRING)
    private Condicion condicion;

    private LocalDateTime fecha_publicacion;

    private LocalDateTime fecha_ultima_actualizacion;

    @Enumerated(EnumType.STRING)
    private EstadoPublicacion estado;

    @Column(precision = 5, scale = 2)
    private BigDecimal descuento;

    private LocalDateTime descuento_fecha_inicio;

    private LocalDateTime descuento_fecha_fin;

    private int id_categoria;

    private LocalDateTime fecha_eliminacion;

    // --- Constructores ---
    public Publicacion() {
        this.estado = EstadoPublicacion.Activo;
        this.descuento = BigDecimal.ZERO;
    }

    public Publicacion(int id_usuario_vendedor, String titulo, String descripcion, BigDecimal precio,
                       Condicion condicion, LocalDateTime fecha_publicacion, LocalDateTime fecha_ultima_actualizacion,
                       EstadoPublicacion estado, BigDecimal descuento, LocalDateTime descuento_fecha_inicio,
                       LocalDateTime descuento_fecha_fin, int id_categoria, LocalDateTime fecha_eliminacion) {
        this.id_usuario_vendedor = id_usuario_vendedor;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.condicion = condicion;
        this.fecha_publicacion = fecha_publicacion;
        this.fecha_ultima_actualizacion = fecha_ultima_actualizacion;
        this.estado = estado;
        this.descuento = descuento;
        this.descuento_fecha_inicio = descuento_fecha_inicio;
        this.descuento_fecha_fin = descuento_fecha_fin;
        this.id_categoria = id_categoria;
        this.fecha_eliminacion = fecha_eliminacion;
    }

    // --- Getters y Setters ---
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_usuario_vendedor() {
        return id_usuario_vendedor;
    }

    public void setId_usuario_vendedor(int id_usuario_vendedor) {
        this.id_usuario_vendedor = id_usuario_vendedor;
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

    public LocalDateTime getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(LocalDateTime fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }

    public LocalDateTime getFecha_ultima_actualizacion() {
        return fecha_ultima_actualizacion;
    }

    public void setFecha_ultima_actualizacion(LocalDateTime fecha_ultima_actualizacion) {
        this.fecha_ultima_actualizacion = fecha_ultima_actualizacion;
    }

    public EstadoPublicacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoPublicacion estado) {
        this.estado = estado;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    public LocalDateTime getDescuento_fecha_inicio() {
        return descuento_fecha_inicio;
    }

    public void setDescuento_fecha_inicio(LocalDateTime descuento_fecha_inicio) {
        this.descuento_fecha_inicio = descuento_fecha_inicio;
    }

    public LocalDateTime getDescuento_fecha_fin() {
        return descuento_fecha_fin;
    }

    public void setDescuento_fecha_fin(LocalDateTime descuento_fecha_fin) {
        this.descuento_fecha_fin = descuento_fecha_fin;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public LocalDateTime getFecha_eliminacion() {
        return fecha_eliminacion;
    }

    public void setFecha_eliminacion(LocalDateTime fecha_eliminacion) {
        this.fecha_eliminacion = fecha_eliminacion;
    }
}
