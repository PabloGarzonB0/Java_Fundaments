package Java_Oracle.OperacionesString;

import java.util.Scanner;

public class FormateNombres {
    public static void main(String[] args) {
        // PROGRAMA PARA REALIZAR EL FORMATEO DE LOS NOMBRES DE FAMILIA
        /*
        * Requerimientos:
        * Recibir los nombres de 3 integrantes de familia o amigos como argumentos de linea de comandos
        * una variable tipo String por cada nombre, tomar el segundo caracter en mayusculas
        * Imprimir como resultado 3 nombres separados por guion bajo
        * */
        Scanner lectura = new Scanner(System.in);
        //metodoSimple();
        // Inicializacion de varables
        String nombre1, nombre2, nombre3;
        String variable, segundoCaracter, ultimosCaracteres, nuevaVariable;
        String resultadoFinal = "";


        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i+1) + " y [Presione Enter]: ");
            variable = lectura.nextLine(); //String son inmutables
            segundoCaracter = String.valueOf(variable.charAt(1)).toUpperCase(); //retorna un char
            ultimosCaracteres = variable.substring(variable.length()-2);
            nuevaVariable = segundoCaracter.concat("." + ultimosCaracteres);
            if (i != 0)  resultadoFinal +=   "_".concat(nuevaVariable);
            else resultadoFinal +=  nuevaVariable;
            }
        System.out.println("resultadoFinal = " + resultadoFinal);
    }
    public static void metodoSimple(){
        //Simple y sin el uso de datas variables ni ciclos
        Scanner nombre = new Scanner(System.in);
        System.out.println("Ingrese el nombre de un integrante de tu familia o amigo");
        String integrante =  nombre.nextLine();

        System.out.println("Ingrese el nombre de otro integrante");
        String integrante2 = nombre.nextLine();

        System.out.println("Ingrese el nombre de otro integrante");
        String integrante3 = nombre.nextLine();

        String resultado = "Resultado = " + integrante.toUpperCase().charAt(1) + "." + integrante.substring(integrante.length()-2);
        resultado += "_" + integrante2.toUpperCase().charAt(1) + "." + integrante2.substring(integrante2.length()-2);
        resultado += "_" + integrante3.toUpperCase().charAt(1) + "." + integrante3.substring(integrante3.length()-2);
        System.out.println("resultado = " + resultado);
    }



}
