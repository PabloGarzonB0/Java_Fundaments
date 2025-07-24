package OrientadoObjetos.PracticaOrdenCompra;

import java.util.Date;
import java.util.Scanner;
public class EjemploOrdenes {
    public static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args){
        //Creacion de 3 ordenes
/*
        OrdenCompra orden1 = new OrdenCompra("Orden de mecanido, productos de mecanica");
        orden1.setCliente(new Cliente("Emiro jacinto", "Aldemir ocoro"));
        orden1.setFecha(new Date());

        OrdenCompra orden2 = new OrdenCompra("Orden de verduras, producto para el mercado");
        orden2.setCliente(new Cliente("Efrain zuluago", "martin soso"));
        orden2.setFecha(new Date());

        OrdenCompra orden3 = new OrdenCompra("Orden de dulces, productos de dulceria");
        orden3.setCliente(new Cliente("Carmen suleidi", "amaranta galindez"));
        orden3.setFecha(new Date());
*/

            // METODO 1: PRESENTACION INFORMACION
/*        for(int f = 0; f < ordenes.length; f++) {
            // Agregar ordenes a producto
            System.out.println("Ingresando datos de la orden ("+ (f+1)+")");
            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese el nombre producto [" + (i + 1) + "] : ");
                String nombreProducto = lectura.next();
                System.out.print("Ingrese el fabricante [" + (i + 1) + "] : ");
                String fabricante = lectura.next();
                System.out.print("Ingrese el precio producto [" + (i + 1) + "] : ");
                double precio = lectura.nextDouble();
                System.out.println();
                ordenes[f].addProducto(new Producto(nombreProducto, precio, fabricante));
            }
            System.out.println("Registro de productos completados");
        }
        */

        OrdenCompra orden1 = new OrdenCompra("Compras componentes pc");
        orden1.setCliente(new Cliente("Andres", "Guzman"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Western Digital", "Unidad SSD 480GB", 54890));
        orden1.addProducto(new Producto("MSI", "Monitor Optix G271", 363940));
        orden1.addProducto(new Producto("AMD", "Procesador AMD Ryzen 9 5900X", 599990));
        orden1.addProducto(new Producto("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1849990));

        OrdenCompra orden2 = new OrdenCompra("Compras Electrodomésticos");
        orden2.setCliente(new Cliente("John", "Doe"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Fensa", "Cocina", 239990));
        orden2.addProducto(new Producto("Samsung", "Refrigerador", 429990));
        orden2.addProducto(new Producto("Midea", "Lavadora", 149990));
        orden2.addProducto(new Producto("Aspiradora", "IRobot", 199990));

        OrdenCompra orden3 = new OrdenCompra("Compras materiales de construcción");
        orden3.setCliente(new Cliente("Pepa", "Roe"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Melon", "Cemento 25kg", 4870));
        orden3.addProducto(new Producto("Grau", "Hormigon", 6040));
        orden3.addProducto(new Producto("Ceramicas Santiago", "Ladrillo", 790));
        orden3.addProducto(new Producto("Redline", "Escala articulada aluminio", 48990));
        OrdenCompra[] ordenes = {orden1, orden2, orden3};
        // METODO 2: PRESENTACION INFORMACION
        for(OrdenCompra orden : ordenes){
            System.out.println("Folio: " + orden.getIdentificacdor());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.totalCompra());

            int i = 1;
            for(Producto producto : orden.getProducto()){
                System.out.println("Producto " + i + ": " +
                        producto.getNombreProducto() + " " +
                        producto.getFabricante()+ " precio $" + producto.getPrecio() );
                i++;
            }
            System.out.println("--------------[Siguiente producto]---------------");
        }
        // Imprimir los valores de los metodos getter de los productos
        System.out.println("Info \n" + orden1.detallesCompra());


    }
}
