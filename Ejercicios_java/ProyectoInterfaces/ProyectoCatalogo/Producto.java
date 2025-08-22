package Java_Oracle.Interfaces.Ejemplo2I.Modelo;

public abstract class Producto implements IProducto{
    private int precio;

    public Producto(int precio){
        this.precio = precio;
    }
    @Override
    public int getPrecio() {
        return precio;
    }
}
