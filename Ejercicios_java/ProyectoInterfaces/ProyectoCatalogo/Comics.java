package Java_Oracle.Interfaces.Ejemplo2I.Modelo;

import java.util.Date;

public class Comics extends Libro{
    private String personaje;

    public Comics(int precio, String autor, String titulo, String editorial,
    String personaje) {
        super(precio, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje(){
        return personaje;
    }
}
