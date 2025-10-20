package ar.com.colevueltas.site.dto;

import ar.com.colevueltas.site.model.Genero;

import java.time.LocalDate;

public class UsuarioCrearDTO {
    private String nombre;
    private String apellido;
    private String mail;
    private String contraseña;
    private int dni;
    private Genero genero;
    private LocalDate fecha_nacimiento;
    private String telefono;

    public UsuarioCrearDTO() {
    }

    public UsuarioCrearDTO(String nombre, String apellido, String mail, String contraseña, int dni, Genero genero, LocalDate fecha_nacimiento, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.contraseña = contraseña;
        this.dni = dni;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
