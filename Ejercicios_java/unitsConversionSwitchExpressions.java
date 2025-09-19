package proyectoPrueba;

public class Ejercicio4 {
	public static void main(String[] args) {
		String[] IMPERIAL_UNITS = {"ft", "lb", "F"};
		String[] SI_UNITS = {"s", "m", "kg", "A", "K", "mol", "cd"};
		double[] values = new double[]{-43.23, 142.7, 12.52, 3.9};
		String[] units = new String[]{IMPERIAL_UNITS[2],SI_UNITS[4], 
				IMPERIAL_UNITS[1], IMPERIAL_UNITS[0]};
		
		// Variables de conversión
		final double ft2m = 0.3048;
		final double lb2kg = 0.4536;
		
		// Procesos
		for(int i = 0; i < values.length; i++) {
			values[i] = switch(units[i]) {
				case "ft" -> values[i] * ft2m;
				case "lb" -> values[i] * lb2kg;
				case "F"  -> (values[i]-32)*5/9+273.15;
				default -> values[i];
			}; // Switch expression necesitan terminar en ;
		}
	}
}
