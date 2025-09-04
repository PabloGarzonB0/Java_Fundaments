package Java_Oracle.Exceptions.PooException;

import java.util.Scanner;

public class EjemploExcepciones {
    static Scanner lectura = new Scanner(System.in);

    public static void main(String[] args){

        Calculadora cal = new Calculadora();
        System.out.print("Ingrese un numero entero numerador: ");
        String numerador = lectura.nextLine();

        System.out.print("Ingrese un  numero entero denominador: ");
        String denominador = lectura.nextLine();
        double division; int divisor;
        try{
            double division2 = cal.dividir(numerador,denominador);
            System.out.println("Division2 = " + division2);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepcion, Ingrese un valor numerico " + nfe.getMessage());
            main(args); // Termina la ejecucion de la operacion
        }catch(FormatoNumeroException e){
            System.out.println("Se detecto una excepcion: Ingrese un numero valido: " + e.getMessage());
            e.printStackTrace(System.out);
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
