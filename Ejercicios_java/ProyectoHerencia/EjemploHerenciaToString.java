package Java_Oracle.Herencia;

public class EjemploHerenciaToString {
    public static void main(String[] args){
        System.out.println("=== Creacion de la instancia de la clase Alumno ===");
        Alumno alumno = new Alumno("Pablo","Garzon",25,"Universidad del Cauca");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("=== Creacion de la instancia de la clase Alumno Internacional ===");
        AlumnoInternacional alumnoI = new AlumnoInternacional("Stiward", "FrankFour", "Venezuela");
        alumnoI.setEdad(33);
        alumnoI.setInstitucion("Institucion Normalistica");
        alumnoI.setNotaIdiomas(6.8);
        alumnoI.setNotaCastellano(6.2);
        alumnoI.setNotaHistoria(5.8);
        alumnoI.setNotaMatematica(6.5);

        System.out.println(" === Creacion de la instancia de la clase profesor === ");
        Profesor profesor = new Profesor("Oscar","Emiro", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("Profesor.Pa@colegio.com");

        imprimir(alumno);
        imprimir(alumnoI);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println(" =============================================== ");
        System.out.println(persona);
    }



}
