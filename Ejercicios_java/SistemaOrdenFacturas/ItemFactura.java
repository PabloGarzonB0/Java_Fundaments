package com.factusLog.appfactus;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public Producto getProducto() {
        return producto;
    }


    public float calcularImporte(){
        return (float)(this.cantidad * this.producto.getPrecio());
    }


}
