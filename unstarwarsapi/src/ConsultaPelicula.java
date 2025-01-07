import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    public Pelicula buscarPelicula(int numeroPelicula) {

        URI direccion = URI.create("https://swapi.py4e.com/api/films/"+numeroPelicula+"/");

        HttpClient client = HttpClient.newHttpClient(); //Objeto de solicitud
        HttpRequest request = HttpRequest //Objeto que realiza solicitud
                .newBuilder()
                .uri(direccion)
                .build();
         // objeto que Recibe respuesta solicitud
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Pelicula.class); // Convierte la respuesta a dato
        } catch (Exception e) {  //llamamos a multi-exception IOException | InterruptedException e
            throw new RuntimeException("No se ha encontrado la pelicula seleccionada");
        }


    }
}
