package Java_Oracle.Interfaces.generics;

public class Generico<J>{

    private final  J tipoObjeto;
    // Constructor de clase
    public Generico(J tipoObjeto){
        this.tipoObjeto = tipoObjeto;
    }

    public void mostrar(){
        System.out.println("Clase generica: " + tipoObjeto.getClass().getName());
    }
    
    public <T> void mostrar(T tipoObjeto){
        System.out.println("Clase del objeto generica: " + tipoObjeto.getClass().getName());
    }

}
