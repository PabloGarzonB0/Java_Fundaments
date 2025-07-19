package Java_Oracle.Arreglos;


import java.util.Scanner;

public class ImprimirHistograma2 {
    public static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args) {
        /**
         * Como resultado debería imprimir lo siguiente:
         *
         * La mayor ocurrencias es: 3
         * El elemento que mas se repite es: 5
         * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
         */
        // Descripcion:
        /**
         *Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
         *El arreglo debe contener 12 elementos que correesponder a numeros enteros de rango 1 al 6.
         *Representar graficamente el numero de veces que apaece un conjunto de datos, segun su frecuencia para todos los numeros del 1 al 6.
         */
        //Arreglo de prueba de operaciones
        int[] numeros = new int[12];

        System.out.println("Considere que los numeros deben ser ingresados en el intervalo [1 - 6]");
        //Ingreso de datos en el vector
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese el elemento ("+(i+1)+"): ");
            numeros[i] = lectura.nextInt();
        }
        // Generacion de arreglo para almacenar los datos del histograma
        String[] datosHistograma = new String[6];
        for(int i = 0; i < datosHistograma.length; i++) {
            int aux = i + 1;
            datosHistograma[i] = aux + ": ";
        }
        for(int j = 0; j < numeros.length; j++){
                switch(numeros[j]){
                    case 1:
                        datosHistograma[0] += "*";
                        break;
                    case 2:
                        datosHistograma[1] += "*";
                        break;
                    case 3:
                        datosHistograma[2] += "*";
                        break;
                    case 4:
                        datosHistograma[3] += "*";
                        break;
                    case 5:
                        datosHistograma[4] += "*";
                        break;
                    case 6:
                        datosHistograma[5] += "*";
                        break;
                }
        }
        // Visualizacion final de histograma
        for(String componente: datosHistograma){
            System.out.println(componente);
        }
        }
    }
