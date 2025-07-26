package com.factusLog;

import com.factusLog.appfactus.*;
import java.util.Scanner;

public class EjemploFactura{
    public static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args){
        //Creacion de clientes
        Cliente cl1 = new Cliente("Jesus Armando saliner", "445-12");
        System.out.print("Ingrese la descripcion de la factura: ");
        String desc = lectura.nextLine();
        Factura factura = new Factura(cl1, desc);  // Creacion de factura

        Producto producto;
        String nombre;
        float precio;
        int cantidad;
        System.out.println();

        for(int i = 0 ; i < 5; i++){
            producto = new Producto();
            System.out.println("Ingrese nombre del producto n " + producto.getCodigo() + ": ")
            nombre = lectura.nextLine();
            producto.setNombre(nombre);

            System.out.print("Ingreseel precio: ");
            precio = lectura.nextFloat();
            producto.setPrecio(precio)

            System.out.print("Ingrese la cantidad: ");
            cantidad = lectura.nextInt();

            ItemFactura item = new ItemFactura(producto, cantidad);
            factura.addItemFactura(item);
            System.out.println();
            lectura.nextLine();
        }

        System.out.println(factura.generarDetalle())
    }
}