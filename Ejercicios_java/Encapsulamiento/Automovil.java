package OrientadoObjetos;

public class Automovil {


    private int id;
    // Datos generales que apareceran en todos los objetos
    private String fabricante = "Hernesto Bejarano";
    private String modelo = "23pfa";        // variable de la clase
    private String color = "Azul platinado";
    private double cilindrada = 600.12;
    private int capacidadEstanque = 40;

    // Atributos estaticos
    private static String colorPatente = "Naranja";
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;


    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    
    
    public Automovil(){
        this.id = ++ultimoId; // incremento con constructor
    }
    // Constructores de Automovil
    public Automovil(String fabricante, String color) {
        this();
        this.fabricante = fabricante;
        this.color = color;
    }
    public Automovil(String fabricante, String modelo, String color){
        this(fabricante,color); //Llama al constructor anterior
        this.modelo = modelo;

    }
    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque){
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
        this.capacidadEstanque = capacidadEstanque;
    }

    // Definicion del encapsulamiento del codigo
    public int getId(){
        return this.id;
    }

    public String getFabricante() {
        return fabricante; //Retorna el atributo de la clase
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static String getColorPatenteEstatico(){return Automovil.colorPatente;}
    public static void setColorPatenteEstatico(String colorPatente){ Automovil.colorPatente = colorPatente;}

    public static int getCapacidadEstanqueEstatico(){return Automovil.capacidadEstanqueEstatico;}
    public static void setCapacidadEstanqueEstatico(int capacidadEstanque){Automovil.capacidadEstanqueEstatico = capacidadEstanque;}

    public String detalle() {
//        StringBuilder modelo = new StringBuilder();  // Variable local del metodo
//        modelo.append("auto.fabricante = " + this.fabricante);
//        modelo.append("\nauto.modelo = " + this.modelo);
//        modelo.append("\nauto.color = " + this.color);
//        modelo.append("\nauto.cilindrada = " + this.cilindrada);
//        return modelo.toString();
        return  "auto.id = " + this.id +
                "\nauto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo +
                "\nauto.color = " + this.color +
                "\nauto.patenteColor = " + Automovil.colorPatente +
                "\nauto.cilidrada = " + this.cilindrada;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }
    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }
    public static String getColorPatente(){
        return colorPatente;            // Retorna el valor estatico solicitado
    }
    public static void setColorPatente(String colorPatente){
        Automovil.colorPatente = colorPatente;
    }
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    // Solicitud realizada en decimal
    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (porcentajeBencina * capacidadEstanque);
    }
    // SobreCarga de metodo, Diferentes elementos internos
    // Solicitud realizada en entero
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (porcentajeBencina * (capacidadEstanque) / 100f);
    }
    public static float calcularConsumoEstatico(int km, int porcentajeBencina){
        return km / (porcentajeBencina * (Automovil.capacidadEstanqueEstatico) / 100f);
    }
    @Override
    // Se sobresecribe el metodo equals
    public boolean equals(Object obj){  // Clase original de tipo obj se convierte a Automovil
        // Si coinciden con el mismo objeto
        if(this == obj){
            return true;
        }
        // Si es un objeto de la instancia automovil
        if(!(obj instanceof  Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo())
                && this.fabricante != null && this.modelo != null
        );
    }

    @Override
    public String toString(){       // Organiza la informacion para que pueda ser vista facilmente
        return this.id + ": " + fabricante + " " +  modelo;
    }

}

