package Java_Oracle.Herencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("============== CREACION DE LA INSTANCIA DE ALUMNO ============");
        Alumno alumno = new Alumno();
        alumno.setNombre("Pablo");  // Debido al modificador de visibilidad se puede acceder directamente
        alumno.setApellido("Cesar");
        alumno.setInstitucion("Institucion Goticas del saber"); // Casteo de objetos
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);


        System.out.println("============== CREACION DE LA INSTANCIA DE ALUMNO INTERNACIONAL ============");
        AlumnoInternacional alumnoI = new AlumnoInternacional();
        alumnoI.setNombre("Peter");
        alumnoI.setApellido("Gosling");
        alumnoI.setPais("Australia");
        alumnoI.setEdad(15);
        alumnoI.setInstitucion("Instituto Nacional");
        alumnoI.setNotaIdiomas(6.8);
        alumnoI.setNotaCastellano(6.2);
        alumnoI.setNotaMatematica(6.5);


        System.out.println("=============CREACION DE LA INSTANCIA DE PROFESOR==================");
        Profesor profesor = new Profesor();
        profesor.setNombre("Oscar");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Programacion");
        System.out.println("______________________");

        System.out.println(alumno.getNombre()
            + " " + alumno.getApellido()
            + " " +  alumno.getInstitucion()
            );

        System.out.println(alumnoI.getNombre()
            + " " + alumnoI.getApellido()
            + " " + alumnoI.getInstitucion()
            + " " + alumnoI.getPais());

        System.out.println("Profesor de " + profesor.getAsignatura()
            + " " + profesor.getNombre()
            + " " + profesor.getApellido());

        Class clase = alumnoI.getClass();   // Representa toda la metadata del objeto que se le envia
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass(); // Avanza al siguiente nivel de jerarquia de clases
        }
    }
}
