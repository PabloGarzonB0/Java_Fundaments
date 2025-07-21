package OrientadoObjetos;
import java.util.Date;
public class EjemploAutomovil {
    public static void main(String[] args){
        Automovil movilC = new Automovil("Subaru", "Blanco");
        Date fecha = new Date();
        // Ocultamiento del estado de un objeto mediante setter y getters:
        // modificaciones, alteraciones por defecto
        movilC.setModelo("Impresa");
        movilC.setCilindrada(2.0);
        // Utilizacion de variable constante
        System.out.println("Velocidad Maxima en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad Maxima dentro de ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);
        System.out.println(Automovil.VELOCIDAD_MAX_CIUDAD);  // Constante siempre va acompanada de un metodo estatic
        //movilC.detalle();
        Automovil nissan1 = new Automovil("Nissan", "dsf-323","verdeKaki", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "dsf-323", "verdeKaki", 3.5, 50);
        System.out.println("Son iguales:? " + (nissan1 == nissan2));
        System.out.println("Son iguales:? " + (nissan1.equals(nissan2))); //equals con sobrecarga
        Automovil mazda = new Automovil("Mazda", "Rojo");
        System.out.println("Los elementos son compatibles: " + nissan1.equals(fecha));
        System.out.println(nissan1);            // Llamado implicito (direccion hashcode)
        System.out.println(nissan1.toString()); // Llamado explicito

        System.out.println("------------------");
        System.out.println(movilC.detalle());
        System.out.println("------------------");
        System.out.println(nissan1.detalle());
        System.out.println("------------------");
        System.out.println(nissan2.detalle());


        // Alteraciones sobre la clase estatica
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300, 60));



        // Modificaciones, alteraciones por defecto
        mazda.setFabricante("Mazda");
        mazda.setModelo("BBT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");

        // Prueba de operaciones
//        System.out.println(mazda.detalle());
//        System.out.println(mazda.acelerar(3500));
//        System.out.println(mazda.frenar());
//        System.out.println(mazda.acelerarFrenar(4000));
//        System.out.println("Kilometraje por litro " + mazda.calcularConsumo(300, 0.75f));
//        System.out.println("Kilometraje por litro " + mazda.calcularConsumo(300, 60));
//        System.out.println(mazda.getCilindrada());

    }
}
