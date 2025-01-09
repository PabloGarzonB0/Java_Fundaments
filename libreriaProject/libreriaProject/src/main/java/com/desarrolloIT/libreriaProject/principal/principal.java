package com.desarrolloIT.libreriaProject.principal;

import com.desarrolloIT.libreriaProject.model.Datos;
import com.desarrolloIT.libreriaProject.model.DatosLibros;
import com.desarrolloIT.libreriaProject.service.ConsumoAPI;
import com.desarrolloIT.libreriaProject.service.ConvierteDatos;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class principal {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);
    
    public void muestraElMenu(){
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        Datos datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

        // Top 10 libros mas descargados
        System.out.println("Los top 10 libros mas descargados");
        datos.resultados().stream()
                .sorted(Comparator.comparing(DatosLibros::numeroDescargas).reversed())
                .limit(10)
                .map(l -> l.titulo().toUpperCase())
                .forEach(System.out::println);

        //Busqueda de libros por nombre
        System.out.println("Ingrese el nombre del libro que desea buscar");
        var tituloLibro = teclado.nextLine();
        json = consumoAPI.obtenerDatos(URL_BASE+"?search="+tituloLibro.replace(" ","+"));
        var datosBusqueda = conversor.obtenerDatos(json, Datos.class);
        Optional<DatosLibros> libroBuscado = datosBusqueda.resultados().stream()
                .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                .findFirst();
        if(libroBuscado.isPresent()){
            System.out.println("Libro encontrado ");
            System.out.println(libroBuscado.get());
        }else{
            System.out.println("Libro no encontrado ");
        }

        //Trabajando con estadisticas
        //Estadisticas generales sobre todos los datos de la api
        DoubleSummaryStatistics est = datos.resultados().stream()
                .filter(d -> d.numeroDescargas()>0)
                .collect(Collectors.summarizingDouble(DatosLibros::numeroDescargas));
        System.out.println("Cantidad media de descargas: "+ est.getAverage());
        System.out.println("Cantidad maxima de descargas: "+ est.getMax());
        System.out.println("Cantidad minima de descargas: "+ est.getMin());
        System.out.println("Cantidad de registros evaluados para calcular estadisticas : "+ est.getCount());
    }
}
