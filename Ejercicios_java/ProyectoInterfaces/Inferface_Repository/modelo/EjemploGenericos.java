package Java_Oracle.Interfaces.generics;

import Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo.Cliente;
import Java_Oracle.Interfaces.Ejemplo3I_Repository.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args){
        List<Cliente> clientes = new ArrayList<>(); //Operador Diamante
        clientes.add(new Cliente("Andres", "Guzman"));

        Cliente andres =  clientes.iterator().next();
        Cliente[] clientesArreglo = {new Cliente("Lucas", "Bush"),
        new Cliente("Stward", "Cansinski")};

        Integer[] enterosArreglo = {1, 2, 3};
        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);

        // Impresion de resultados de lista
        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe",
        "Lui", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);
    }

    List<Cliente> clientesPremiumList = fromArrayToList(new ClientePremium[]
            {new ClientePremium("Paco","Fernandez")});


    // METODOS ESTATICOS IMPLEMENTADOS
    public static <T> List<T> fromArrayToList(T[] c){ // Limita los genericos a tipo numero
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static List<Cliente> fromArrayToList(Cliente[] c){
        return Arrays.asList(c);
    }

    /*public static <T extends  Cliente> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }*/


    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for(G elemento: g){
            System.out.println("Elemento:" + elemento);
        }
        return Arrays.asList(c);
    }

}
