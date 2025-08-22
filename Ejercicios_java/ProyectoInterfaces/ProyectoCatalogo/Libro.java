package Java_Oracle.Interfaces.Ejemplo2I.Modelo;
import java.util.Date;

public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public double getPrecioVenta() {
        return getPrecio()*0.95;
    }
}
