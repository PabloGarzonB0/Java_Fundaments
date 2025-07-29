package Java_Oracle.Herencia;

public class EjemploHerenciaConstructores {
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
        System.out.println("=== Detalles de persona ===");
        System.out.println(" Imprimiendo datos de tipo personal ");
        System.out.println("nombre: " + persona.getNombre()
            + ", apellido: " + persona.getApellido()
            + ", edad: " + persona.getEdad()
            + ", email: " + persona.getEmail());

        if(persona instanceof Alumno){    // Control de tipo 1
            System.out.println(" Imprimiendo datos del tipo alumno ");
            System.out.println("Institucion: " +  ((Alumno) persona).getInstitucion()); // Casteo implicito de objeto alumno
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaCastellano());

            if(persona instanceof AlumnoInternacional){    // Control de tipo 1.2
                System.out.println(" Imprimiendo datos del tipo alumno internacional");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("Calcular promedio alumno: ");
            System.out.println("Promedio : " + ((Alumno) persona).calcularPromedio());

        }
        if(persona instanceof Profesor){  // Control de tipo 2
            System.out.println(" Imprimiendo datos del tipo profesor ");
            System.out.println(" Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("================  Sobre escritura saludar ==================");
        System.out.println(persona.saludar());
        System.out.println("================ ================== ==================");
    }


}
