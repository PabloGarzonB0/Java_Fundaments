package ProyectoInterfaces.modelo;
import  ProyectoInterfaces.modelo.*;
import static  ProyectoInterfaces.modelo.Genero.*;

public class mainImprenta {
    public static void main(String[] args){
        Curriculo cv = new Curriculo("Pablo Cesar Garzon", "Ingeniero de Telecomunicaciones",
                "Resumen laboral ...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Oracle DBA");
        cv.addExperiencia("Spring Framework");
        cv.addExperiencia("Desarrollador Fullstack");
        cv.addExperiencia("Angular");

        Libro libro = new Libro("Erich Gamma", "Patrones de disenos: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Fascade"));
        
        Informe informe = new Informe("Jorge crauge", "Martin Fownler", "Estudio sobre microservicios");
        // Imprimir en pantalla la informacion
        imprimir(cv);
        imprimir(informe);
    }
    // Metodo estatico de impresion de hoja
    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());  // Invoca el metodo de la clase abstracta
    }




}
