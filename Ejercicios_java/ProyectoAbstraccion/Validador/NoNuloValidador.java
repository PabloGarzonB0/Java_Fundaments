package Java_Oracle.claseAbstracta.validador;

public class NoNuloValidador extends Validador{

    protected String mensaje = "El campo  %s no puede ser nulo";

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return "";
    }
}
