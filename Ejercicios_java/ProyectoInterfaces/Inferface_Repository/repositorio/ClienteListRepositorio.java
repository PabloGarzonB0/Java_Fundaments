package Java_Oracle.Interfaces.Ejemplo3I_Repository.repositorio;

import Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{
    private List<Cliente> dataSource;
    //Constructor
    public ClienteListRepositorio(){
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }
    @Override
    public Cliente porId(Integer id) {
        // Metodo para buscar a un cliente por ID
        Cliente resultado = null;
        for(Cliente cli: dataSource){
            if (cli.getId().equals(id)){
                resultado = cli; break;
            }
        }
        return resultado;
    }
    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }
    @Override
    public void eliminar(Integer id) {
        Cliente c = this.porId(id);
        this.dataSource.remove(c);
    }

    @Override
    public List<Cliente> Listar(String campo, String dir) {
        return List.of();
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return List.of();
    }

    @Override
    public List<Cliente> Listar(String campo, Direccion dir) {
       dataSource.sort(new Comparator<Cliente>() {
           @Override
           public int compare(Cliente a, Cliente b) {
               int resultado = 0;
               if(dir == Direccion.ASC){
                    switch (campo){
                        case "id" -> resultado = a.getId().compareTo(b.getId());
                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                    }
               }else if(dir == Direccion.DESC){
                   switch (campo){
                       case "id" -> resultado = b.getId().compareTo(a.getId());
                       case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                       case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                   }
               }
               return 0;
           }
       });
        return dataSource;
    }



}
