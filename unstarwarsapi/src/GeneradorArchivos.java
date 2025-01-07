import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class GeneradorArchivos {

    public void GuardarJson(Pelicula pelicula) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura = new FileWriter(new File("src/ArchivosJson", pelicula.title()+".json"));
        escritura.write(gson.toJson(pelicula));
        escritura.close(); //Importantisimo cerrar el objeto de consulta

    }
}
