
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Escriba el numero de la pelicula que quiere ver");

        try {
            var num = Integer.valueOf(sc.nextLine());
            Pelicula pelicula = consulta.buscarPelicula(num);
            System.out.println(pelicula);
            GeneradorArchivos generador = new GeneradorArchivos();
            generador.GuardarJson(pelicula);


        }catch(NumberFormatException e){
            System.out.println("Numero no encontrado: "+ e.getMessage());
        }catch(RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Aplicaciones Finalizada");
        }
    }
}