package Java_Oracle.Interfaces.Ejemplo3I_Repository.repositorio;

import Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio implements OrdenableMaximum{
    private List<Cliente> dataSource;
    //Constructor
    public ClienteListRepositorio2(){
        this.dataSource = new ArrayList<>();
    }





    // Metodos implementados por interfaz
    @Override
    public List<Cliente> listar() {
        return dataSource;
    }
    @Override
    public Cliente porId(Integer id) {
        // Metodo para buscar a un cliente por ID
        Cliente resultado = null;
        for(Cliente cli: dataSource){
            if (cli.getId() != null && cli.getId().equals(id)){
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
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        // Nueva lista para no alterar los datos iniciales
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(a,b, campo);

            }else if(dir == Direccion.DESC){
                resultado = ordenar(b,a, campo);
            }
            return resultado;
        });
        return listaOrdenada;
    }
    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }
    public static int ordenar(Cliente a, Cliente b, String campo){
        int resultado = 0;
        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public int total(){
        return this.dataSource.size();
    }



}
