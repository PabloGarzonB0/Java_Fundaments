package Java_Oracle.Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenArregloAAct1 {
    public static Scanner lectura = new Scanner(System.in);

    public static void sortBurbujaSuperior(int[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for(int i = 0; i < total-1; i++){
            for(int j = 0; j < (total-1-i); j++){
                if(((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
                contador++;
            }
            }
        System.out.println("contador = " + contador);
    }
    public static void main(String[] args) {
        int[] vectorA = new int[10];
        int[] vectorB = new int[vectorA.length];
        int size = vectorA.length-1;
        // Ingreso de num,eros en vector
        for(int i = 0; i < vectorA.length; i ++){
            System.out.print("Ingrese elemento ["+(i+1)+"]: ");
            vectorA[i] = lectura.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(vectorA));
        // Ordenar elementos
        sortBurbujaSuperior(vectorA);
        System.out.println(Arrays.toString(vectorA));

        int aux = 0;
        int incremento = 0;
        for (int i = size; i > size/2; i--){
            // Importante: la organizacion interna del vector se hace con varible axiliar
            vectorB[aux++] = vectorA[i];
            vectorB[aux++] = vectorA[incremento++];
        }
        System.out.println(Arrays.toString(vectorB));
    }
}
