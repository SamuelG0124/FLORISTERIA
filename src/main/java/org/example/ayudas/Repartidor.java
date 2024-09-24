package org.example.ayudas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Repartidor {

    Long id;
    String nombre;
    String apellido;
    Long placaMoto;
    String colorMoto;
    String marcaMoto;
    Double propinas;
    Integer numeroEntregas;
    LocalDate fechaContratacion;
    LocalDateTime fechayhoraEntrega;

    public Repartidor() {
    }

    public Repartidor(Long id, String nombre, String apellido, Long placaMoto, String colorMoto, String marcaMoto, Double propinas, Integer numeroEntregas, LocalDate fechaContratacion, LocalDateTime fechayhoraEntrega) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.placaMoto = placaMoto;
        this.colorMoto = colorMoto;
        this.marcaMoto = marcaMoto;
        this.propinas = propinas;
        this.numeroEntregas = numeroEntregas;
        this.fechaContratacion = fechaContratacion;
        this.fechayhoraEntrega = fechayhoraEntrega;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(Long placaMoto) {
        this.placaMoto = placaMoto;
    }

    public String getColorMoto() {
        return colorMoto;
    }

    public void setColorMoto(String colorMoto) {
        this.colorMoto = colorMoto;
    }

    public String getMarcaMoto() {
        return marcaMoto;
    }

    public void setMarcaMoto(String marcaMoto) {
        this.marcaMoto = marcaMoto;
    }

    public Double getPropinas() {
        return propinas;
    }

    public void setPropinas(Double propinas) {
        this.propinas = propinas;
    }

    public Integer getNumeroEntregas() {
        return numeroEntregas;
    }

    public void setNumeroEntregas(Integer numeroEntregas) {
        this.numeroEntregas = numeroEntregas;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public LocalDateTime getFechayhoraEntrega() {
        return fechayhoraEntrega;
    }

    public void setFechayhoraEntrega(LocalDateTime fechayhoraEntrega) {
        this.fechayhoraEntrega = fechayhoraEntrega;
    }
}
