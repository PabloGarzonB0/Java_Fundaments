package ProyectoInterfaces.modelo;
import  ProyectoInterfaces.modelo.*;
import static  ProyectoInterfaces.modelo.Genero.*;

public class mainImprenta {
    public static void main(String[] args){
        Curriculo cv = new Curriculo(new Persona("Pablo Cesar","Garzon"), "Ingeniero de Telecomunicaciones",
                "Resumen laboral ...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador Fullstack")
        .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erick", "Gamma"), "Patrones de disenos: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Fascade"));

        Informe informe = new Informe(new Persona("Jorge", "Crauge"),
                new Persona("Martin", "Fouler"),
                "Estudio sobre microservicios");
        // Imprimir en pantalla la informacion
        Imprimible.imprimible(cv);
        Imprimible.imprimible(cv); // Emplea metodo estatico desde interfaz
        imprimir(informe);  // Implementa metodo estatico desde la propia clase
        System.out.println(Imprimible.TEXTO_DEFECTO);

        // Implementacion de clase anonima
        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto generico de una clase anonima";
            }
        };
        imprimir(new Imprimible() {
            // Imprime texto por defecto interno
        });
    }
    // Metodo estatico de impresion de hoja
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());  // Invoca el metodo de la clase abstracta
    }
}

