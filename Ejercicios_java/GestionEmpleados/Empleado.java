package Java_Oracle.GestionEmpleados;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal,
                    String direccion, double remuneracion, int empleadoId){
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }
    public double getRemuneracion() {
        return remuneracion;
    }

    protected void aumentarRemuneracion(int porcentaje){
        this.remuneracion = this.remuneracion * (1 + ((double) porcentaje /100));
        System.out.println("Aumento de salario incrementado: " + remuneracion);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEmpleadoId= " + empleadoId +
                ", remuneracion= " + (int)remuneracion;
    }

}
