package Java_Oracle.Interfaces.Ejemplo3I_Repository.repositorio;

import Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo.Cliente;
import java.util.List;

public interface CrudRepositorio {
    // Creacion de CRUD mediante una interfaz
    List<Cliente> listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void editar(Clinete cliente);
    void eliminar(Integer id);

    List<Cliente> listar(String campo, Diraccion dir);