package org.example;

import org.example.ayudas.Proveedor;
import org.example.ayudas.Repartidor;
import org.example.modelos.Cliente;
import org.example.modelos.Flor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente clienteUno=new Cliente();
        Cliente clienteDos=new Cliente(1L, "Samuel", "Giraldo", "3015194779", "Crr 44#26-50","Tarjeta Debito,", "rosas",18,"Masculino,",LocalDate.now());


        System.out.println("ID: " + clienteUno.getId());
        System.out.println("Nombre: " + clienteUno.getNombre());
        System.out.println("Apellidos: " + clienteUno.getApellidos());
        System.out.println("Teléfono: " + clienteUno.getTelefono());
        System.out.println("Dirección: " + clienteUno.getDireccion());
        System.out.println("Método de Pago: " + clienteUno.getMetodoPago());
        System.out.println("Preferencias de Productos: " + clienteUno.getPrefernciasProductos());
        System.out.println("Edad: " + clienteUno.getEdad());
        System.out.println("Género: " + clienteUno.getGenero());
        System.out.println("Última Compra: " + clienteUno.getUltimaCompra());



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


        System.out.println("ID: " + florUno.getId());
        System.out.println("Nombre Común: " + florUno.getNombreComun());
        System.out.println("Nombre Científico: " + florUno.getNombreCientifico());
        System.out.println("Color: " + florUno.getColor());
        System.out.println("Fragancia: " + florUno.getFragancia());
        System.out.println("Hábitat: " + florUno.getHabitat());
        System.out.println("Tiempo de Crecimiento: " + florDos.getTiempoCrecimiento());
        System.out.println("Precio: $" + florUno.getPrecio());
        System.out.println("Tamaño: " + florUno.getTamano() + " cm");
        System.out.println("Número de Pétalos: " + florUno.getNumeroPetalos());



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


        Repartidor repartidor1=new Repartidor();
        Repartidor repartidor2=new Repartidor(
                1L,
                "Carlos",
                "Martínez",
                123456L,
                "Negro",
                "Yamaha",
                150.75,
                25,
                LocalDate.of(2023, 1, 15),
                LocalDateTime.now());

        System.out.println("ID: " + repartidor1.getId());
        System.out.println("Nombre: " + repartidor1.getNombre());
        System.out.println("Apellido: " + repartidor1.getApellido());
        System.out.println("Placa de la Moto: " + repartidor1.getPlacaMoto());
        System.out.println("Color de la Moto: " + repartidor1.getColorMoto());
        System.out.println("Marca de la Moto: " + repartidor1.getMarcaMoto());
        System.out.println("Propinas: $" + repartidor1.getPropinas());
        System.out.println("Número de Entregas: " + repartidor1.getNumeroEntregas());
        System.out.println("Fecha de Contratación: " + repartidor1.getFechaContratacion());
        System.out.println("Fecha y Hora de Entrega: " + repartidor1.getFechayhoraEntrega());



        System.out.println("ID: " + repartidor2.getId());
        System.out.println("Nombre: " + repartidor2.getNombre());
        System.out.println("Apellido: " + repartidor2.getApellido());
        System.out.println("Placa de la Moto: " + repartidor2.getPlacaMoto());
        System.out.println("Color de la Moto: " + repartidor2.getColorMoto());
        System.out.println("Marca de la Moto: " + repartidor2.getMarcaMoto());
        System.out.println("Propinas: $" + repartidor2.getPropinas());
        System.out.println("Número de Entregas: " + repartidor2.getNumeroEntregas());
        System.out.println("Fecha de Contratación: " + repartidor2.getFechaContratacion());
        System.out.println("Fecha y Hora de Entrega: " + repartidor2.getFechayhoraEntrega());


        Proveedor proveedor1 =new Proveedor();
        Proveedor proveedor2;
        proveedor2 = new Proveedor(
                2002L,
                "Flores y Rosas S.A.",
                "555-6789",
                "contacto@floresyrosas.com",
                "Avenida Floral 123",
                "Bogotá",
                "Colombia",
                "Alta",
                "Rosas, Tulipanes",
                50
        );

        System.out.println("ID: " + proveedor2.getId());
        System.out.println("Nombre del Proveedor: " + proveedor1.getNombreProveedor());
        System.out.println("Teléfono de Contacto: " + proveedor1.getTelefonoContacto());
        System.out.println("Correo Electrónico: " + proveedor1.getCorreoElectronico());
        System.out.println("Dirección: " + proveedor1.getDireccion());
        System.out.println("Ciudad: " + proveedor1.getCiudad());
        System.out.println("País: " + proveedor1.getPais());
        System.out.println("Calidad del Proveedor: " + proveedor1.getCalidadProveedor());
        System.out.println("Tipo de Flores Suministradas: " + proveedor1.getTipoFloresSuministradas());
        System.out.println("Cantidad Mínima de Pedido: " + proveedor1.getCantidadMinimaPedido());

        System.out.println("ID: " + proveedor2.getId());
        System.out.println("Nombre del Proveedor: " + proveedor2.getNombreProveedor());
        System.out.println("Teléfono de Contacto: " + proveedor2.getTelefonoContacto());
        System.out.println("Correo Electrónico: " + proveedor2.getCorreoElectronico());
        System.out.println("Dirección: " + proveedor2.getDireccion());
        System.out.println("Ciudad: " + proveedor2.getCiudad());
        System.out.println("País: " + proveedor2.getPais());
        System.out.println("Calidad del Proveedor: " + proveedor2.getCalidadProveedor());
        System.out.println("Tipo de Flores Suministradas: " + proveedor2.getTipoFloresSuministradas());
        System.out.println("Cantidad Mínima de Pedido: " + proveedor2.getCantidadMinimaPedido());


        Scanner recogerDatos=new Scanner(System.in);
        System.out.println("Pedir datos por consola para Cliente");

        System.out.print("Ingrese ID: ");
        clienteUno.setId(recogerDatos.nextLong());
        recogerDatos.nextLine();

        System.out.print("Ingrese el nombre: ");
        clienteUno.setNombre(recogerDatos.nextLine());

        System.out.print("Ingrese los apellidos: ");
        clienteUno.setApellidos(recogerDatos.nextLine());

        System.out.print("Ingrese el teléfono: ");
        clienteUno.setTelefono(recogerDatos.nextLine());

        System.out.print("Ingrese la dirección: ");
        clienteUno.setDireccion(recogerDatos.nextLine());

        System.out.print("Ingrese el método de pago: ");
        clienteUno.setMetodoPago(recogerDatos.nextLine());

        System.out.print("Ingrese las preferencias de productos: ");
        clienteUno.setPrefernciasProductos(recogerDatos.nextLine());

        System.out.print("Ingrese la edad: ");
        clienteUno.setEdad(recogerDatos.nextInt());
        recogerDatos.nextLine();

        System.out.print("Ingrese el género: ");
        clienteUno.setGenero(recogerDatos.nextLine());

        System.out.print("Ingrese la fecha de la última compra (YYYY-MM-DD): ");
        String fechaInput = recogerDatos.nextLine();
        clienteUno.setUltimaCompra(LocalDate.parse(fechaInput));


        System.out.println("Pedir datos por consola para Flor");

        System.out.print("Ingrese ID: ");
        florUno.setId(recogerDatos.nextLong());
        recogerDatos.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre común: ");
        florUno.setNombreComun(recogerDatos.nextLine());

        System.out.print("Ingrese el nombre científico: ");
        florUno.setNombreCientifico(recogerDatos.nextLine());

        System.out.print("Ingrese el color: ");
        florUno.setColor(recogerDatos.nextLine());

        System.out.print("Ingrese la fragancia: ");
        florUno.setFragancia(recogerDatos.nextLine());

        System.out.print("Ingrese el hábitat: ");
        florUno.setHabitat(recogerDatos.nextLine());

        System.out.print("Ingrese el tiempo de crecimiento: ");
        florUno.setTiempoCrecimiento(recogerDatos.nextLine());

        System.out.print("Ingrese el precio: ");
        florUno.setPrecio(recogerDatos.nextDouble());
        recogerDatos.nextLine();

        System.out.print("Ingrese el tamaño: ");
        florUno.setTamano(recogerDatos.nextInt());
        recogerDatos.nextLine();

        System.out.print("Ingrese el número de pétalos: ");
        florUno.setNumeroPetalos(recogerDatos.nextInt());
        recogerDatos.nextLine();


        System.out.println("Pedir datos por consola para Repartidor");
        System.out.print("Ingrese ID: ");
        repartidor1.setId(recogerDatos.nextLong());
        recogerDatos.nextLine();

        System.out.print("Ingrese el nombre: ");
        repartidor1.setNombre(recogerDatos.nextLine());

        System.out.print("Ingrese el apellido: ");
        repartidor1.setApellido(recogerDatos.nextLine());

        System.out.print("Ingrese la placa de la moto: ");
        repartidor1.setPlacaMoto(recogerDatos.nextLong());
        recogerDatos.nextLine();

        System.out.print("Ingrese el color de la moto: ");
        repartidor1.setColorMoto(recogerDatos.nextLine());

        System.out.print("Ingrese la marca de la moto: ");
        repartidor1.setMarcaMoto(recogerDatos.nextLine());

        System.out.print("Ingrese las propinas: ");
        repartidor1.setPropinas(recogerDatos.nextDouble());
        recogerDatos.nextLine();

        System.out.print("Ingrese el número de entregas: ");
        repartidor1.setNumeroEntregas(recogerDatos.nextInt());
        recogerDatos.nextLine();

        System.out.print("Ingrese la fecha de contratación (YYYY-MM-DD): ");
        String fechaContratacionInput = recogerDatos.nextLine();
        repartidor1.setFechaContratacion(LocalDate.parse(fechaContratacionInput)); // Formato de fecha

        System.out.print("Ingrese la fecha y hora de entrega (YYYY-MM-DDTHH:MM): ");
        String fechaHoraEntregaInput = recogerDatos.nextLine();
        repartidor1.setFechayhoraEntrega(LocalDateTime.parse(fechaHoraEntregaInput));

        System.out.println("Pedir datos por consola para Proveedor");

        System.out.print("Ingrese ID: ");
        proveedor1.setId(recogerDatos.nextLong());
        recogerDatos.nextLine();

        System.out.print("Ingrese el nombre del proveedor: ");
        proveedor1.setNombreProveedor(recogerDatos.nextLine());

        System.out.print("Ingrese el teléfono de contacto: ");
        proveedor1.setTelefonoContacto(recogerDatos.nextLine());

        System.out.print("Ingrese el correo electrónico: ");
        proveedor1.setCorreoElectronico(recogerDatos.nextLine());

        System.out.print("Ingrese la dirección: ");
        proveedor1.setDireccion(recogerDatos.nextLine());

        System.out.print("Ingrese la ciudad: ");
        proveedor1.setCiudad(recogerDatos.nextLine());

        System.out.print("Ingrese el país: ");
        proveedor1.setPais(recogerDatos.nextLine());

        System.out.print("Ingrese la calidad del proveedor: ");
        proveedor1.setCalidadProveedor(recogerDatos.nextLine());

        System.out.print("Ingrese el tipo de flores suministradas: ");
        proveedor1.setTipoFloresSuministradas(recogerDatos.nextLine());

        System.out.print("Ingrese la cantidad mínima de pedido: ");
        proveedor1.setCantidadMinimaPedido(recogerDatos.nextInt());
        recogerDatos.nextLine();


















    }




}