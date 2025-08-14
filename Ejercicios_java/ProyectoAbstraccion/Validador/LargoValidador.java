package Java_Oracle.claseAbstracta.validador;

import Java_Oracle.claseAbstracta.validador.mensaje.IMensajeFormateable;

public class LargoValidador extends Validador implements IMensajeFormateable {
    protected String mensaje = "El campo %s debe tener un minimo %d caracteres y maximo %d caracteres";
    private int minimo;
    private int maximo = Integer.MAX_VALUE;

    public LargoValidador(){

    }

    public LargoValidador(int min, int max){
        this.minimo = min;
        this.maximo = max;
    }

    public void setMin(int min){
        this.minimo = min;
    }

    public void setMaximo(int max){
        this.maximo = max;
    }


    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //this.mensaje = String.format(this.mensaje, this.minimo, this.maximo); // Valores asignados
        if (valor == null){
            return true;
        }
        int largo = valor.length();
        return ( largo >= minimo && largo <= maximo );
    }

    @Override // Implementacion de interfaz
    public String getMensajeFormateado(String campo) {
        return "";
    }

//    public String getMensajeFormateado(String campo){
//        return String.format(this.mensaje, campo,this.minimo, this.maximo);
//    }


}
