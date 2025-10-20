package ar.com.colevueltas.site.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "publicacion")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "id_usuario_vendedor", nullable = false)
    private Integer id_usuario_vendedor;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "condicion")
    private String condicion; // Nuevo, Excelente, Muy bueno, etc.

    @Column(name = "fecha_publicacion")
    private Date fecha_publicacion;

    @Column(name = "fecha_ultima_actualizacion")
    private Date fecha_ultima_actualizacion;

    @Column(name = "estado")
    private String estado; // Activo, Pausado, Vendido, etc.

    @Column(name = "descuento")
    private BigDecimal descuento;

    @Column(name = "id_categoria", nullable = false)
    private Integer id_categoria;

    // getters y setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getId_usuario_vendedor() { return id_usuario_vendedor; }
    public void setId_usuario_vendedor(Integer id_usuario_vendedor) { this.id_usuario_vendedor = id_usuario_vendedor; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }

    public String getCondicion() { return condicion; }
    public void setCondicion(String condicion) { this.condicion = condicion; }

    public Date getFecha_publicacion() { return fecha_publicacion; }
    public void setFecha_publicacion(Date fecha_publicacion) { this.fecha_publicacion = fecha_publicacion; }

    public Date getFecha_ultima_actualizacion() { return fecha_ultima_actualizacion; }
    public void setFecha_ultima_actualizacion(Date fecha_ultima_actualizacion) { this.fecha_ultima_actualizacion = fecha_ultima_actualizacion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public BigDecimal getDescuento() { return descuento; }
    public void setDescuento(BigDecimal descuento) { this.descuento = descuento; }

    public Integer getId_categoria() { return id_categoria; }
    public void setId_categoria(Integer id_categoria) { this.id_categoria = id_categoria; }
}

