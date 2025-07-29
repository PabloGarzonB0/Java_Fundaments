package Java_Oracle.GestionEmpleados;

public class Principal {
    public static void main(String[] args){
        Gerente gerenteGeneral = new Gerente("Rodolfo", "Ortiz","52.324.413",
                "Avenila Fayete", 2500, 324213, 2500.00);

        gerenteGeneral.aumentarRemuneracion(15); // Porcentaje de remuneracion
        gerenteGeneral.setPresupuesto(150000.00);
        System.out.println(gerenteGeneral);
    }
}
