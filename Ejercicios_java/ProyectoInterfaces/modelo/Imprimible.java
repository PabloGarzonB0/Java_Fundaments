package ProyectoInterfaces.modelo;

public interface Imprimible {
    // Todos los metodos de la interfaz se deben imprimir pero se pueden
    // establecer metodos que no sean obligatorios imprimir
    default String imprimir(){
        return "Imprimiendo un valor por defecto";
    }

}