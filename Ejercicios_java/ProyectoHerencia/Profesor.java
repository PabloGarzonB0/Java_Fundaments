package Java_Oracle.Herencia;

public class Profesor extends Persona{
    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Inicializando constructor por defecto...");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura(){
        return asignatura;
    }
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

    @Override
    public String saludar(){
        return "HOLA A TODOS, SOY PROFESOR Y MI NOMBRE ES: " + getNombre() +
                " Y MI ASIGNATURA ES " + getAsignatura();
    }

    @Override
    public String toString(){
        return super.toString() + "\nasignatura= " + asignatura;
    }


}
