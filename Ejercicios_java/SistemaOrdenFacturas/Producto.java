package com.factusLog.appfactus;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private static int ultimoCodigo;

    public Producto() {
        this.codigo = ++ultimoCodigo;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
}
