package Proyecto_facturacion;

import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el limite de la tarjeta");
        double limite = sc.nextDouble();
        double totalAcumulado = 0;

        //Creacion del objeto de tipo tarjeta
        tarjetaCredito tarjeta = new tarjetaCredito(limite);

        int salir = 1;
        while(salir != 0){
            //Ingreso de atributos del producto
            System.out.println("Ingrese la descripcion del producto");
            String description = sc.next();

            System.out.println("Ingrese el valor del producto");
            double valorProducto = Double.parseDouble(sc.next()); //Transforma la variable string en double
            //Crea el objeto de compra
            Compra miComprita = new Compra(valorProducto, description);
            boolean CheckCompra = tarjeta.LanzarCompra(miComprita); //Validacion - realizacion de compra

            if(CheckCompra){
                System.out.println("Proyecto_facturacion.Compra realizada exitosamente");
                System.out.println("Digite 0 si quiere salir");
                salir = sc.nextInt();
            }else{
                System.out.println("No cuentas con suficientes recursos para comprar");
                salir = 0;
            }
        }
            System.out.println("****************************************************");
            System.out.println("COMPRAS REALIZADAS ");
            Collections.sort(tarjeta.getListaCompra());
             //El for recorre nuevamente totalAcumulado pero debe reiniciarse
        for(Compra compo: tarjeta.getListaCompra()){ //Crea una variable compatible con la clase compra para ingresar a la lista
                System.out.println(compo.getDescripcion() + " - " + compo.getValor());
                totalAcumulado += compo.getValor();
            }
            System.out.println("*****************************************************");
            System.out.println( "Saldo de la cuenta: " + tarjeta.getSaldo());
            System.out.println("Valor total de compra:"+ totalAcumulado);


    }
}