package org.example.ayudas;

public class Proveedor {

    private Long id;
    private String nombreProveedor;
    private String telefonoContacto;
    private String correoElectronico;
    private String direccion;
    private String ciudad;
    private String pais;
    private String calidadProveedor;
    private String tipoFloresSuministradas;
    private Integer cantidadMinimaPedido;

    public Proveedor() {
    }

    public Proveedor(Long id, String nombreProveedor, String telefonoContacto, String correoElectronico, String direccion, String ciudad, String pais, String calidadProveedor, String tipoFloresSuministradas, Integer cantidadMinimaPedido) {
        this.id = id;
        this.nombreProveedor = nombreProveedor;
        this.telefonoContacto = telefonoContacto;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.calidadProveedor = calidadProveedor;
        this.tipoFloresSuministradas = tipoFloresSuministradas;
        this.cantidadMinimaPedido = cantidadMinimaPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalidadProveedor() {
        return calidadProveedor;
    }

    public void setCalidadProveedor(String calidadProveedor) {
        this.calidadProveedor = calidadProveedor;
    }

    public String getTipoFloresSuministradas() {
        return tipoFloresSuministradas;
    }

    public void setTipoFloresSuministradas(String tipoFloresSuministradas) {
        this.tipoFloresSuministradas = tipoFloresSuministradas;
    }

    public Integer getCantidadMinimaPedido() {
        return cantidadMinimaPedido;
    }

    public void setCantidadMinimaPedido(Integer cantidadMinimaPedido) {
        this.cantidadMinimaPedido = cantidadMinimaPedido;
    }
}
