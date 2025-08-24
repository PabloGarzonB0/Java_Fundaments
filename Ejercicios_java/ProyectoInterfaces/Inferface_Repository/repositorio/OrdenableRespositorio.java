package Java_Oracle.Interfaces.Ejemplo3I_Repository.repositorio;

import Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo.Cliente;
import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dirreccion);

}
