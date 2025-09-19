package proyectoPrueba;

public class Ejemplo3 {
	public static void main(String[] args) {
		
		// Inicialización de variables y arreglos
		String[] IMPERIAL_UNITS = {"ft", "lb", "F"};
		String[] SI_UNITS = {"s", "m", "kg", "A", "K", "mol", "cd"};
		
		// Variables de conversión
		final double ft2m = 0.3048;
		final double lb2kg = 0.4536;
		
		String[] notes = {"Is it hot?", "Is it cold?", "Is it heavy?", "Is it long?"};
		double[] values = {43.23, 142.7, 12.52, 3.9};
		String [] units = {IMPERIAL_UNITS[2], IMPERIAL_UNITS[1], IMPERIAL_UNITS[0], IMPERIAL_UNITS[2]};
		
		// Evaluación de unidades
		for (int i = 0; i < values.length; i++) {
			String unit = units[i];
			for (String u : IMPERIAL_UNITS) {
				
				// Comparación de unidades de arreglos diferentes
				if(u.equals(unit)) {
					switch(unit) {
					case "ft":
						values[i] = values[i] * ft2m;
						units[i] = SI_UNITS[1];
						break;
					case "lb":
						values[i] = values[i]*lb2kg;
						units[i] = SI_UNITS[2];
						break;
					case "F":
						values[i] = (values[i] - 32) * 5/9 + 273.15;
						units[i] = SI_UNITS[4];
					}
					break;
				}
			}	
		}
		String[] measuremnts = new String[values.length];
		int i = 0;
		while( i < measuremnts.length) {
			measuremnts[i] = notes[i] + '\t' + values[i] + ' ' + units[i];
			i++;
		}
		String measurementReport = "Measurements:";
		for (int j = 0; j < measuremnts.length; j++) {
			measurementReport += "\n\t" + (j + 1) + " " + measuremnts[j];
		}
		System.out.println(measurementReport);
	}
}
