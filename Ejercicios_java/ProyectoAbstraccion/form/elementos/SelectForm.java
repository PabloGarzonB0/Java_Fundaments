package Java_Oracle.claseAbstracta.form.elementos;

import Java_Oracle.claseAbstracta.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{
    private List<Opcion> opciones;  // Los datos seran inmutables // tipo de atributo - interfaz

    //Constructor
    public SelectForm(String nombre){
        super(nombre);
        this.opciones = new ArrayList<Opcion>(); // Cuando se define una clase se le pueden dar valores
    }

    public SelectForm(String nombre, List<Opcion> opciones){
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpciones(Opcion opcion){
        this.opciones.add(opcion); // El tamano del arreglo se puede incrementar automaticamente
        return this;  // Retorna un objeto del mismo tipo de la clase SelectForm
    }
    @Override // Ingreso las multiples opciones dentro del SelectForm
    public String dibujarHTML(){
        StringBuilder sb = new StringBuilder("<select ");
            sb.append("name='");
            sb.append(this.nombre);
            sb.append("'>");

        // Impresion de todos los elementos
        for(Opcion op: opciones){ // Creacion de un elemento html
            sb.append("\n<option value='")
                    .append(op.getValor())
                    .append("'");
            if(op.isSelected()){
                sb.append(" selected");
            }
            sb.append(">").append(op.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }


}
