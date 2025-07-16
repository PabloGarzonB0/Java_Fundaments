package Java_Oracle.Arreglos;

import java.util.Arrays;
import java.util.Collections;

public class ArregloInversoMutable {

    public static void arregloInverso(String[] arreglo){

        // MANERA 1: Arreglo inverso
        /*int total2 = arreglo.length;
        int total = total2;
        // Modifica el orden del vector de elementos
        for(int j=0; j < total2; j++){
            String ultimo = arreglo[total-1-j];
            String actual = arreglo[j];
            arreglo[j] = ultimo;
            arreglo[total-1-j] = actual;
            total2--; // Variable de control. Punto de inflexion o  de quiebre
        }*/
        // MANERA 2: Arreglo optimizado
        int n = arreglo.length;
        for (int i = 0; i < n/2 ; i++) {
            String temp = arreglo[i];
            arreglo[i] = arreglo[n - 1 - i]; // Primer elemento
            arreglo[n - 1 - i] = temp;       // Ultimo elemento
        }
    }

    public static void main(String[] args) {

        String[] productos =  {"Kingston Pendrive", "Samsung Galaxy", "Disco duro SSD Samsung Externo",
                "Asus Notebook", "Mack book Air", "Chronecast 4ta generacion", "Bicicleta Oxford"};
        int total = productos.length;

        // Ordenacion de arreglo
        Arrays.sort(productos);
        //arregloInverso(productos);
        Collections.reverse(Arrays.asList(productos));  // Coleccions requiere una arreglo de tipo List
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

/*        System.out.println("=== Usando for inverso ===");
        for(int i = 0 ; i < total; i++){
            String ultimo = productos[total-1-i];
            productos[i] = ultimo;  // Unico elemento de modificacion de operaciones a su paso
            System.out.println(productos[i]);
        }
*/

    }
}
