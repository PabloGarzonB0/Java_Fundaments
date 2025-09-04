package Java_Oracle.GenericsExercises;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private List<T> objetos;
    private int indiceProductos;
    private int max = 5;

    // Constructor de metodo
    public BolsaSupermercado(){
        this.objetos = new ArrayList();
    }

    // Metodo de agregacion de objetos
    public void addProducto(T objeto) {
        if (this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("No hay mas espacio");
        }
    }

    // Metodo que devulve la lista de productos
    public List<T> getProductos(){
        return objetos;
    }


    }





