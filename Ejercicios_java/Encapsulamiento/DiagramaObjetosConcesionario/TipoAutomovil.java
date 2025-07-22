package OrientadoObjetos.Concesionario;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon","Auto_grande", 5),
    HATCHBACK("Hatchback", "Auto Compato", 5),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto pequeno", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 1),
    FURGON("Furgon", "Auto utilitario", 4);

    // Los atributos de un ENUM siembre son constantes
    private final String nombre;
    private final int numeroPuertas;
    private final String descripcion;

    // Constructor
    TipoAutomovil(String nombre, String descripcion, int numeroPuertas){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroPuertas = numeroPuertas;
    }

    // Getters and Setters
    public String getDescripcion() {
        return descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
