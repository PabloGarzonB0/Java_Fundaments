package OrientadoObjetos.PracticaOrdenCompra;

public class Cliente {
    private String nombre;
    private String apellido;
    public Cliente(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
