package variables;

public class EncuestaPorEdades {
    // Metodos
    public static double calcMediaEdad(int[] edades){
        int sumaEdades = 0;
        for(int edad : edades){
            sumaEdades += edad;
        }
        return (double) sumaEdades / edades.length;
    }

    public static int countElectPais(String[] paises, String paisE){
        int contador = 0;
        for(String pais : paises){
            if(pais.equalsIgnoreCase(paisE)){
                contador++;
            }
        }
        return contador;
    }
    public static double mediaEdadPaisEdad(int[] edades, String[] paises, String paisE){
        int sumaEdades = 0;
        int contador = 0;
        for (int i = 0; i < paises.length; i++){
            if(paises[i].equalsIgnoreCase(paisE) && edades[i] <= 30){
                sumaEdades += edades[i];
                contador++;
            }
        }
        if (contador == 0){
            return 0.0; // No hay encuestados en el grupo
        }
        return (double) sumaEdades / contador;
    }

    public static void main(String[] args){
        // Datos de los encuestados
        int[] edades = {25, 300, 28, 35, 22, 40};
        System.out.print("Arreglo edades\n");

        for(int edad: edades){ System.out.println("\t" + edad); }

        String[] paises = {"Argentina", "Brasil","Chile", "Argentina", "Peru", "Argentina"};
        // 1. Promedio de edad de los encuestados
        double promedioEdades = calcMediaEdad(edades);
        System.out.println("\n1. Promedio de edad de los encuestados: " + promedioEdades);
        // 2. Cuantos encuestados eligieron un pais dado
        String paisBuscado = "Argentina";
        int cantidadElegidos = countElectPais(paises, paisBuscado);
        System.out.println("2. Encuestados que eligieron " + paisBuscado + ": " + cantidadElegidos);
        //3. Promedio de edad de los encuentados conmenos de 30 anios
        double mediaEPE = mediaEdadPaisEdad(edades, paises, paisBuscado);
        System.out.println("3. Promedio de edad de encuestados de hasta 30 anios que eligieron " + paisBuscado + ": " + mediaEPE);
    }
}
