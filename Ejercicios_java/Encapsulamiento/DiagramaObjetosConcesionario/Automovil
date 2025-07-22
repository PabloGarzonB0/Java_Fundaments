package OrientadoObjetos.Concesionario;

public class Automovil {
    private int id;
    // Datos generales que apareceran en todos los objetos
    private String fabricante = "Hernesto Bejarano";
    private String modelo = "23pfa";        // variable de la clase
    private Color color = Color.GRIS; // Se llama a la clase enum
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private double cilindrada = 600.12;
    private int capacidadEstanque = 40;

    private TipoAutomovil tipo;
    // Atributos estaticos
    private static Color colorPatente = Color.NARANJA;
    private static int capacidadEstanqueEstatico = 30; // Estatico, no constante
    private static int ultimoId;


    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;


    // Si no se utilizan enums para definir valores constantes
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_VERDE = "Verde";
    public static final String COLOR_GRIS = "Gris";
    public static final String COLOR_BLANCO = "Blanco";


    public Automovil(){
        this.id = ++ultimoId; // incremento con constructor
    }
    // Constructores de Automovil
    public Automovil(String fabricante, Color color) {
        this();
        this.fabricante = fabricante;
        this.color = color;
    }
    public Automovil(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante,color); //Llama al constructor anterior
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor){
        this(fabricante, modelo, color);
        this.motor = motor;
    }
    public Automovil(String fabricante, String modelo, Color color, Motor motor,Estanque estanque){
        this(fabricante, modelo, color);
        this.motor = motor;
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque,
                     Persona conductor, Rueda[] ruedas){
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;

    }


    // Getters and Setters _________________________________________________________________________________
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
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public double getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public static Color getColorPatenteEstatico(){return Automovil.colorPatente;}
    public static void setColorPatenteEstatico(Color colorPatente){ Automovil.colorPatente = colorPatente;}

    public static int getCapacidadEstanqueEstatico(){return Automovil.capacidadEstanqueEstatico;}
    public static void setCapacidadEstanqueEstatico(int capacidadEstanque){Automovil.capacidadEstanqueEstatico = capacidadEstanque;}

    public TipoAutomovil getTipo(){
        return tipo;
    }
    public void setTipo(TipoAutomovil tipo){
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public Rueda[] getRuedas() {
        return ruedas;
    }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    public Persona getConductor() {
        return conductor;
    }
    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }
    public Estanque getEstanque() {
        return estanque;
    }
    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    // Methods__________________________________________________________________
    public String detalle() {
//        StringBuilder modelo = new StringBuilder();  // Variable local del metodo
//        modelo.append("auto.fabricante = " + this.fabricante);
//        modelo.append("\nauto.modelo = " + this.modelo);
//        modelo.append("\nauto.color = " + this.color);
//        modelo.append("\nauto.cilindrada = " + this.cilindrada);
//        return modelo.toString();
        return  "auto.id = " + this.id +
                "\nauto.fabricante = " + this.getFabricante() +  //debido a encapsulamiento se trae cada elemento
                "\nauto.modelo = " + this.getModelo() +
                "\nauto.tipo = " + this.getTipo().getDescripcion() +
                "\nauto.color = " + this.color.getColor() +
                "\nauto.patenteColor = " + Automovil.colorPatente +
                "\nauto.cilidrada = " + (this.motor.getCilindrada());
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }
    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando!";
    }
    public static Color getColorPatente(){
        return colorPatente;            // Retorna el valor estatico solicitado
    }
    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }
    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
    // Solicitud realizada en decimal
    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (porcentajeBencina * this.estanque.getCapacidad());
    }
    // SobreCarga de metodo, Diferentes elementos internos
    // Solicitud realizada en entero
    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (porcentajeBencina * (this.estanque.getCapacidad()) / 100f);
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
