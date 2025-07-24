package OrientadoObjetos.PracticaOrdenCompra;

public class Producto {
    private String nombreProducto;
    private double precio;
    private String fabricante;

    public Producto(String nombreProducto, String fabricante, double precio){
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.fabricante = fabricante;
    }
    // GETTER AND SETTER METHODS
    public String getNombreProducto(){
        return this.nombreProducto;
    }
    public double getPrecio(){
        return this.precio;
    }
    public String getFabricante(){
        return this.fabricante;
    }
}
