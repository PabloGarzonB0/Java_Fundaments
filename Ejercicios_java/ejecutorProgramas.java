package Java_Oracle.operacionesSystem;
import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process proceso;  // Creacion de objeto de la clase process, utiliza el objeto rt para ejecutar un programa del sistema, en este caso el blog de notas
        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("Windows")) {
                proceso = rt.exec("notepad");  
            } else {
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        }catch (Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.out.println("Cerrando programa");
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
