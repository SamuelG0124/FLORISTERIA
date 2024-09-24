package org.example.modelos;

import java.time.LocalDate;

public class Cliente {

    private Long id;
    private  String nombre;
    private String Apellidos;
    private String telefono;
    private String direccion;
    private String metodoPago;
    private String prefernciasProductos;
    private Integer edad;
    private String genero;
    private LocalDate ultimaCompra;


    public Cliente() {

    }

    public Cliente(Long id, String nombre, String apellidos, String telefono, String direccion, String metodoPago, String prefernciasProductos, Integer edad, String genero, LocalDate ultimaCompra) {
        this.id = id;
        this.nombre = nombre;
        Apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.metodoPago = metodoPago;
        this.prefernciasProductos = prefernciasProductos;
        this.edad = edad;
        this.genero = genero;
        this.ultimaCompra = ultimaCompra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getPrefernciasProductos() {
        return prefernciasProductos;
    }

    public void setPrefernciasProductos(String prefernciasProductos) {
        this.prefernciasProductos = prefernciasProductos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getUltimaCompra() {
        return ultimaCompra;
    }

    public void setUltimaCompra(LocalDate ultimaCompra) {
        this.ultimaCompra = ultimaCompra;
    }
}


