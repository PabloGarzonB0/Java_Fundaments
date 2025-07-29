package Java_Oracle.Herencia;

public final class AlumnoInternacional extends Alumno{
    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("Alumno Internacional: Inicializando constructor...");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }
    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais(){
        return pais;
    }
    public double getNotaIdiomas(){
        return notaIdiomas;
    }
    public void setPais(String pais){
        this.pais = pais;
    }
    public void setNotaIdiomas(double notaIdiomas){
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar(){
        return super.saludar() + " SOY ALUMNO EXTRANJERO" +
                " PROVENGO DEL PAIS " + getPais();
    }

    @Override
    public double calcularPromedio() {
        System.out.println("Calcular promedio " + AlumnoInternacional.class.getCanonicalName());
        return ((super.calcularPromedio()*3) + this.notaIdiomas)/4;   // Sobrecarga sobre clase hija
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n notaIdiomas=" + notaIdiomas +
                ", pais='" + pais ;
    }
}
