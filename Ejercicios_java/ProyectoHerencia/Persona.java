package Java_Oracle.Herencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona(){
        // Cuando se implementa un constructor con parametros de pierde el constructor por defecto
    }
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }
    public Persona(String nombre){
        System.out.println("Persona: inicializando constructor...");
    }
    // Recomendacion, se espera que los atributos del padre sean los atributos mas escondidos y a los que no se tenga
    // acceso facilmente

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Metodos  para imprimir informacion de clase
    public String saludar(){return "HOLA A TODOS! "; }

    @Override
    public String toString() {
        return
                "Nombre='" + nombre + '\'' +
                "Edad=" + edad +
                "Email='" + email + '\'' +
                "Saludo=" + this.saludar();
    }
}
