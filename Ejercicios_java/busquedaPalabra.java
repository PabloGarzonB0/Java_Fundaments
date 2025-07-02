package Java_Oracle.buclesControl;

public class sentenciasBucleEtiquetaBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabra = palabra.length();

        int cantidad = 0;
        char letra = 'd';

        // Continuacion de bucle con iteracion externa
        buscar:
        for (int i = 0; i < maxFrase; i++) { //Recorre la frase completa
            int k = i;
            for (int j = 0; j < maxPalabra; j++) { //Recorre la palabra
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidad ++;
        }
        System.out.println("Encontrado: "+ cantidad + " veces la palabra "+ palabra +" en la frase ");
    }
}
