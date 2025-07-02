package Java_Oracle.buclesControl;

public class sentenciasBucleEtiquetaBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo trigo  en un trigo trigal"; // EL recorrido de la frase es independiente,
        // por la tanto el ultimo recorrido debe acotarse
        String palabra = "trigo";


        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra + 1;
        int cantidad = 0;

        // Continuacion de bucle con iteracion externa
        buscar:
        for (int i = 0; i < maxFrase;) { //Recorre la frase completa
            int k = i; // Variable independiente que controla el avance de la frase
            for (int j = 0; j < maxPalabra; j++) { //Recorre la palabra, si termina el proceso completo es que coinsiden 2 palabras
                // Si los caracteres son iguales continua el for
                if(frase.charAt(k++) != palabra.charAt(j)){ // Desplazamiento interno
                    i++;
                    continue buscar;
                }
            }
            cantidad ++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado: "+ cantidad + " veces la palabra "+ palabra +" en la frase ");
    }
}
