package ProyectoInterfaces.modelo;
import java.util.List;

public class Libro implements Imprimible{
    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero){
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();

    }
    public Libro addPagina(Hoja pagina){
        paginas.add(pagina); //agrega cualquier pagina creada
        return this;
        // Retorna el mismo objeto de la clase libro
        // Como una especie de actualizacion de clase
    }
    // Si no se agregan paginas, esta accion no estara disponible
    @Override
    public String imprimir(){
            StringBuilder sb = new StringBuilder("Titulo: ");
            sb.append(this.titulo).append("\n")
                    .append("Autor: ").append(this.autor).append("\n")
                    .append("Genero: ").append(genero).append("\n");
            for(Hoja pag: this.paginas){
                sb.append(pag.imprimir()).append("\n");
            }
            return  sb.toString();
    }

}
