package Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{
    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremium o){
        return 0;
    }
}
