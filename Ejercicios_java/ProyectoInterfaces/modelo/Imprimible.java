package ProyectoInterfaces.modelo;

public interface Imprimible {
    // Todos los metodos de la interfaz se deben imprimir pero se pueden
    // establecer metodos que no sean obligatorios imprimir
    final static String TEXTO_DEFECTO = "Imprimiento un valor por defecto"; //Scope Global

    default String imprimir(){
        return TEXTO_DEFECTO;
    }

    static void imprimible(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
