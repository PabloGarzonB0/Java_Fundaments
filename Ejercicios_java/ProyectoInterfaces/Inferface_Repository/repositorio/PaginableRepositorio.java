package Java_Oracle.Interfaces.Ejemplo3I_Repository.repositorio;

import Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
