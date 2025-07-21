package OrientadoObjetos;

public class EjemploAutomovil {
    public static void main(String[] args){
        Automovil movilC = new Automovil();
        // Ocultamiento del estado de un objeto mediante setter y getters:
        // modificaciones, alteraciones por defecto
        movilC.setFabricante("Subaru");
        movilC.setModelo("Impresa");
        movilC.setCilindrada(2.0);
        movilC.setColor("Blanco");
        System.out.println("Primer Objeto============================");
        //movilC.detalle();
        Automovil mazda = new Automovil();
        // modificacion, alteracioens por defecto
        mazda.setFabricante("Mazda");
        mazda.setModelo("BBT-50");
        mazda.setCilindrada(3.0);
        mazda.setColor("Rojo");
        System.out.println("Segundo Objeto===========================");
        System.out.println(mazda.detalle());
        System.out.println(mazda.acelerar(3500));
        System.out.println(mazda.frenar());
        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilometraje por litro " + mazda.calcularConsumo(300, 0.75f));
        System.out.println("Kilometraje por litro " + mazda.calcularConsumo(300, 60));
      
    }
}
