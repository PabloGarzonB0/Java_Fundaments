package Java_Oracle.GenericsExercises;

public class Fruta extends Producto {
    private double peso;
    private String color;

    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }
}
