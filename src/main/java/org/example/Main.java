package org.example;

import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente clienteUno=new Cliente();
        Cliente clienteDos=new Cliente(1L, "Samuel", "Giraldo", "3015194779", "Crr 44#26-50","Tarjeta Debito,", "rosas",18,"Masculino,",LocalDate.now());

        System.out.println("ID: " + clienteDos.getId());
        System.out.println("Nombre: " + clienteDos.getNombre());
        System.out.println("Apellidos: " + clienteDos.getApellidos());
        System.out.println("Teléfono: " + clienteDos.getTelefono());
        System.out.println("Dirección: " + clienteDos.getDireccion());
        System.out.println("Método de Pago: " + clienteDos.getMetodoPago());
        System.out.println("Preferencias de Productos: " + clienteDos.getPrefernciasProductos());
        System.out.println("Edad: " + clienteDos.getEdad());
        System.out.println("Género: " + clienteDos.getGenero());
        System.out.println("Última Compra: " + clienteDos.getUltimaCompra());

        Flor florUno=new Flor();
        Flor florDos=new Flor( 1L,
                "Rosa",
                "Rosa rubiginosa",
                "Rojo",
                "Dulce",
                "Jardines",
                "6 meses",
                12.50,
                30,
                20       );


        System.out.println("ID: " + florDos.getId());
        System.out.println("Nombre Común: " + florDos.getNombreComun());
        System.out.println("Nombre Científico: " + florDos.getNombreCientifico());
        System.out.println("Color: " + florDos.getColor());
        System.out.println("Fragancia: " + florDos.getFragancia());
        System.out.println("Hábitat: " + florDos.getHabitat());
        System.out.println("Tiempo de Crecimiento: " + florDos.getTiempoCrecimiento());
        System.out.println("Precio: $" + florDos.getPrecio());
        System.out.println("Tamaño: " + florDos.getTamano() + " cm");
        System.out.println("Número de Pétalos: " + florDos.getNumeroPetalos());








    }




}