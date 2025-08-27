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


        List<Cliente> clientesPremiumList = fromArrayToList(new ClientePremium[]
                {new ClientePremium("Paco","Fernandez")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremiumList);
        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1, 9, 4));
        System.out.println("Maximo de 3.9, 11.6, 7.78 es: " + maximo(3.9, 11.6, 7.78));
        System.out.println("Maximo de zanahori, arandanos, manzana es: " +
                maximo("Zanahoria", "arandano", "manzana"));

    }



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

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
    
    public static <T extends  Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;

    }

}
