package ProgramacionFuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaExamplo1 {

    static boolean esPar(Integer n){
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        // Metodo para agregar numeros pares a una lista
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // Enconrar los numeros pares y guardalos en un arrayList
        List<Integer> resultados = new ArrayList<Integer>();
        resultados = numeros.stream()
                //.filter(LamdaExamplo1::esPar) // lambda -> funcion anonima
                .filter(n -> n % 2 ==0)         // Permite definir operaciones de forma compacta
                .collect(Collectors.toList());

        /*
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) % 2 == 0){
                resultados.add(numeros.get(i));}}
        */
        System.out.println("Lista elementos: " + resultados);
    }
}
