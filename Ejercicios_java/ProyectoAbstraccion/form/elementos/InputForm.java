package Java_Oracle.claseAbstracta.form.elementos;

public class InputForm extends  ElementoForm {
    private String tipo = "text";


    // Implementacion de construtores
    public InputForm(String nombre) {
        super(nombre);
    }
    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }


    // Implementacion de getters and setters
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }




    @Override
    public String dibujarHTML(){
        return "<input type=\" " + this.tipo
            + "\" name=\"" + this.nombre
            + "\" value=\"" + this.valor + "\">";
    }
}
