package Java_Oracle.Arreglos;

import java.util.Arrays;
import java.util.Scanner;
import static Java_Oracle.Arreglos.agregarElementoOrdenado.OrdenBurble;
// Programa - Ordenamiento, insercion y eliminacion de elemento de vector

public class ArregloDesplazarPosicion3b {
    public static Scanner lectura = new Scanner(System.in);
    public static void main(String[] args) {

        int[] vectorA = {1, 12, 42, 13, 45, 64, 8, 10};
        int numero, posicion, ultimo;
        System.out.println("Ingrese un numero a insertar: ");
        numero = lectura.nextInt();
        // Llamamos a  ordenar el arreglo
        vectorA = OrdenBurble(vectorA);
        ultimo = vectorA[vectorA.length - 1];
        posicion = 0;
        while(posicion < 6 && numero > vectorA[posicion]){
            posicion++;   // Define la posicion para ubicar el nuevo elemento
        }
        System.out.println("Posicion: "+ posicion);
        // Desplazamiento de elementos derecha
        for (int i = vectorA.length - 2; i >= posicion; i--) {
            vectorA[1 + i] = vectorA[i];
        }
        int[] vectorB = new int[vectorA.length + 1];
        System.arraycopy(vectorA,0, vectorB, 0, vectorA.length);

        // Evalua con el ultimo caso posible
        if (numero > ultimo){
            vectorB[vectorB.length-1] = numero;
        }else {
            vectorB[vectorB.length-1] = ultimo;
            vectorB[posicion] = numero;
        }
        System.out.println(Arrays.toString(vectorB));
    }
}
