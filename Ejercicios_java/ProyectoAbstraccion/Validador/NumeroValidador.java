package Java_Oracle.claseAbstracta.validador;

public class NumeroValidador extends Validador{
    protected String mensaje;

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
        try{
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
