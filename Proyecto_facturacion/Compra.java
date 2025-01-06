package Proyecto_facturacion;

public class Compra implements Comparable<Compra>{
    private double valor;
    private String descripcion;

    public Compra(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Proyecto_facturacion.Compra : valor=" + valor +
                ", descripcion='" + descripcion;
    }


    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));  //Metodo utilizando los compareTo
        // Casteo a la clase wrapper
    }
}
