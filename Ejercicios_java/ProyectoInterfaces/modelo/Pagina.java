package ProyectoInterfaces.modelo;

public class Pagina extends Hoja{

    public Pagina(String contenido){
        super(contenido);
    }
    @Overide
    public String imprimir(){
        return this.contenido;
    }
}