package org.example.modelos;

public class Flor {

    private Long id;
    private String nombreComun;
    private String nombreCientifico;
    private String Color;
    private  String fragancia;
    private String Habitat;
    private String tiempoCrecimiento;
    private Double precio;
    private Integer tamano;
    private Integer numeroPetalos;

    public Flor() {
    }

    public Flor(Long id, String nombreComun, String nombreCientifico, String color, String fragancia, String habitat, String tiempoCrecimiento, Double precio, Integer tamano, Integer numeroPetalos) {
        this.id = id;
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        Color = color;
        this.fragancia = fragancia;
        Habitat = habitat;
        this.tiempoCrecimiento = tiempoCrecimiento;
        this.precio = precio;
        this.tamano = tamano;
        this.numeroPetalos = numeroPetalos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String habitat) {
        Habitat = habitat;
    }

    public String getTiempoCrecimiento() {
        return tiempoCrecimiento;
    }

    public void setTiempoCrecimiento(String tiempoCrecimiento) {
        this.tiempoCrecimiento = tiempoCrecimiento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Integer getNumeroPetalos() {
        return numeroPetalos;
    }

    public void setNumeroPetalos(Integer numeroPetalos) {
        this.numeroPetalos = numeroPetalos;
    }
}
