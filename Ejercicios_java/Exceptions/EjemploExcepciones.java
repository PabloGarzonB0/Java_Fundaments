package Java_Oracle.Exceptions.PooException;

import java.util.Scanner;

public class EjemploExcepciones {
    public static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args){

        Calculadora cal = new Calculadora();
        System.out.print("Ingrese el  numero entero divisor: ");
        String valor = lectura.nextLine();
        double division; int divisor;
        try{
            divisor = Integer.parseInt(valor);
            division = cal.dividir(10, divisor);
            System.out.println(division);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepcion, Ingrese un valor numerico " + nfe.getMessage());
            main(args); // Termina la ejecucion de la operacion

        }catch (DivisionPorZeroException dz){
            System.out.println("Captura de la excepcion en tiempo de ejecucion: " + dz.getMessage());
            main(args); // Termina la ejecucion de la operacion
        }
        finally {
            // Independiente si ocurre o no ocurre el error este texto siempre se imprime
            System.out.println("Opcional - Continuacion con el flujo de la aplicacion");
        }


    }
}
