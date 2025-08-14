package Java_Oracle.claseAbstracta.form.elementos;
// Importaciones de librerias y carpetas
import Java_Oracle.claseAbstracta.validador.LargoValidador;
import Java_Oracle.claseAbstracta.validador.Validador;
import Java_Oracle.claseAbstracta.validador.mensaje.IMensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    protected String nombre;
    protected String valor;
    private List<Validador> validadores;
    private List<String> errores;

    // Constructores de la clase
    public ElementoForm(){
        // Inicializador de las listas
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }
    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }
    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }
    public ElementoForm(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public List<String> getErrores(){
        return errores;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador v: validadores){
            if(!v.esValido(this.valor)){
                if (v instanceof IMensajeFormateable){
                    this.errores.add(((LargoValidador) v).getMensajeFormateado(nombre));
                }else{
                this.errores.add(String.format(v.getMensaje(),nombre));
            }
            }
        }
        return this.errores.isEmpty();
    }
    // Metodos implementados
    abstract public String dibujarHTML();
}
