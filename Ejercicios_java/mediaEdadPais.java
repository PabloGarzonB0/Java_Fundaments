package variables;

public class EncuestaPorEdades {
    // Metodos
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

    



}
