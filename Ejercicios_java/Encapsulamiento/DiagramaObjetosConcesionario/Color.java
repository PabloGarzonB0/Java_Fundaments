package OrientadoObjetos.Concesionario;

public enum Color {
    ROJO("Rojo"),           // llamada de un constructor desde la variable
    AMARILLO("Amarillo"),   // Se pasa como argumento aca
    AZUL("Azul"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    NARANJA("Naranja");

    private final String color;     // definimos una constante final

    Color(String color){            // se inicializa en el constructor
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    // Se retorna los colores con el formato del toString
    @Override
    public String toString(){
        return this.color;
    }
}
