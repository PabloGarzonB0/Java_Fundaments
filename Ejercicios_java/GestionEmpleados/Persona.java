package Java_Oracle.GestionEmpleados;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String dirrecion){
        System.out.println("Inicializando datos de persona");
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = dirrecion;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    @Override
    public String toString() {
        return  "Nombre= '" + nombre + '\'' +
                " apellido=' " + apellido + '\'' +
                ", numeroFiscal=' " + numeroFiscal + '\'' +
                ", direccion='" + direccion;
    }
}
