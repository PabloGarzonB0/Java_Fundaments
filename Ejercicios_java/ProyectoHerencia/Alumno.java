package Java_Oracle.Herencia;

public class Alumno extends Persona {
    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

// Por defecto se llaman a los constructores de los elementos de forma jerarquica
//    public Alumno(){
//    }
    public Alumno(){
        //super(nombre); // Llama al constructor padre, se declaran cuales elementos son del padre
        System.out.println("Alumno: inicializando constructor...");
    }
    public Alumno(String nombre, String apellido){
        super(nombre, apellido); // Inicializa los datos mediante el constructor de la clase padre
    }
    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }
    public Alumno(String nombre, String apellido, int edad, String institucion){
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }
    public Alumno(String nombre, String apellido, int edad,
                  String institucion, double notaMatematica, double notaCastellano,
                  double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }


    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    public double getNotaCastellano() {
        return notaCastellano;
    }
    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }
    public double getNotaMatematica() {
        return notaMatematica;
    }
    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }
    public double getNotaHistoria() {
        return notaHistoria;
    }
    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        String saludo = super.saludar();
        return saludo + "SOY UN ALUMNO, MI NOMBRE ES: " + getNombre();
    }

    public double calcularPromedio(){
        System.out.println("Calcular promedio " + Alumno.class.getCanonicalName());
        return (this.notaHistoria + this.notaCastellano + this.notaMatematica)/3;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\ninstitucion='" + institucion + '\'' +
                ", notaMatematica=" + notaMatematica +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio= " + this.calcularPromedio();
    }
}
