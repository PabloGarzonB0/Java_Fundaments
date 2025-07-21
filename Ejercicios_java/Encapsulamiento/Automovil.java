package OrientadoObjetos;

public class Automovil {
    // Datos generales que apareceran en todos los objetos
    private String fabricante = "Hernesto Bejarano";
    private String modelo = "23pfa";        // variable de la clase
    private String color = "Azul platinado";
    private double cilindrada = 600.12;
    private int capacidadEstanque = 40;
public Automovil(){} //Constructor por defecto
    // Definicion del encapsulamiento del codigo
    public String getFabricante(){
        return fabricante; //Retorna el atributo de la clase
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
    public String detalle(){
//        StringBuilder modelo = new StringBuilder();  // Variable local del metodo
//        modelo.append("auto.fabricante = " + this.fabricante);
//        modelo.append("\nauto.modelo = " + this.modelo);
//        modelo.append("\nauto.color = " + this.color);
//        modelo.append("\nauto.cilindrada = " + this.cilindrada);
//        return modelo.toString();
        return "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.cilidrada = " + this.cilindrada;
    }
    public String acelerar(int rpm){
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }
    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n"  + frenar;
    }
    // Solicitud realizada en decimal
    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(porcentajeBencina * capacidadEstanque );
    }
    // SobreCarga de metodo, Diferentes elementos internos
    // Solicitud realizada en entero
    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(porcentajeBencina * (capacidadEstanque)/100f);
    }
}
