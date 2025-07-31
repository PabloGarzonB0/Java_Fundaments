package Java_Oracle.claseAbstracta.form.elementos;

abstract public class ElementoForm {
    protected String nombre;
    protected String valor;

    public ElementoForm(){
        // Inicializador de las listas
    }

    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }



    // Metodos implementados
    abstract public String dibujarHTML();
}
