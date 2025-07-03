/**
* @author Pablo Cesar Garzon Benitez
* Este programa demuestra el uso de la clase HttpClient introducida en Java 11
* para realizar slicitud HTTP GET a una URL (http: //www.google.com)
 * El codigo realiza lo siguiente:
 * - Crea un cliente HTTP utilizando la configuracion por defecto.
 * - Construye una solicitud HTTP a la URL especifica
 * - Envia la solicitud  y obtiene una respuesta del servidor
 * - Imprime el codigo de estado de la respuesta y el metodo HTTP utilizado
 * - Muestra todos los encabezados de la respuesta recibida.
 * - Lee y muestra el cuerpo del mensaje de la respuesta linea a linea
* */

package Java_Oracle;

import java.net.*;
import java.net.http.*;
import java.io.*;
import java.util.*;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        // Obteniendo un cliente que usa la configuracion por defecto
        HttpClient myHC = HttpClient.newHttpClient();

        // Creando una solicitud
        HttpRequest myReq = HttpRequest.newBuilder(
                new URI("http://www.google.com/")).build();

        // Envia la solicitud y obtiene la respuesta
        HttpResponse<InputStream> myResp = myHC.send(myReq,
                HttpResponse.BodyHandlers.ofInputStream());
        // Codido de respuesta y metodo de respuesta
        System.out.println("Codigo de respuesta es " + myResp.statusCode());
        System.out.println("Metodo de respuesta es " + myReq.method());

        // Obtencion de encabezado de respuesta
        HttpHeaders hdrs = myResp.headers();

        // Obtener el mapa el encabezado
        Map<String, List<String>>  hdrMap = hdrs.map();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nEncabezado:");

        // Disply all header keys and values
        for(String k : hdrField){
            System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
        }
        System.out.println("\nCuerpo mensaje:");
        InputStream input = myResp.body();
        int c;
        // Mostrar el cuerpo completo de solicitud HTTP
        while((c = input.read()) != -1){
            System.out.print((char) c);
        }

    }
}
