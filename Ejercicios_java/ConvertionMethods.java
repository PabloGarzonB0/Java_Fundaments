package variables;

public class methods {
    private static final double ft2m = 0.3048;
    private static final double lb2kg = 0.4536;

    private static final String[] IMPERIAL_UNITS = {"ft", "lb", "F"};
    private static final String[] SI_UNITS = {"s", "m", "kg", "A", "K", "mol", "cd"};

    private static double[] values = {142.7, 12.52, 36.9, 23.5};
    private static String[] notes = {"Is it cold","Is it heavy","Is it long?","Is it cold"};
    private static String[] units = {IMPERIAL_UNITS[2], SI_UNITS[4], IMPERIAL_UNITS[1], IMPERIAL_UNITS[0]};

    public static void main(String[] args) {
        methods meth = new methods();
        System.out.println("Measurements Report:");

        for (int i = 0; i < values.length; i++) {
            String report = meth.processMeasurement(
                    notes[i],
                    values[i],
                    units[i]
            );
            System.out.println(report);
        }

        boolean allUnitsSI = true;
        int i = 0;
        while (i < units.length && (allUnitsSI = meth.isSI(units[i]))){
            i++;
        }

        units = new String[] {SI_UNITS[4], SI_UNITS[4], SI_UNITS[2], SI_UNITS[1]};
    }
    // Metodos a implementar
     double convertValue(String unit, double value) {
        double conversion = switch (unit) {
            case "ft" -> value * ft2m;
            case "lb" -> value * lb2kg;
            case "F" -> (value - 32) * 5 / 9 + 273.15;
            default -> value;
        };

        return conversion;
    }
    String convertUnit(String unit){
        // Esta funcion solamente retorna las unidades de un vector
        // No realiza mayores cambios
        String conversionUnit = switch(unit){
            case "ft" -> SI_UNITS[1];
            case "lb" -> SI_UNITS[2];
            case "F"  -> SI_UNITS[4];
            default -> unit;
        };
        return conversionUnit;
    }

    boolean isImperial(String unit){
        for(String u: IMPERIAL_UNITS){
            if(u.equals(unit)){
                return true;
            }
        }
        return false;
    }

    boolean isSI(String unit){
        for(String u : SI_UNITS){
            if(u.equals(unit)){  return true; }
        }
        return false;
    }
    String processMeasurement(String note, double value, String unit) {
        note = (note == null) ? "No notes" : note;
        if (isImperial(unit)) {
            value = convertValue(unit, value);
            unit = convertUnit(unit);
        }
        return note + "\t" + value + " " + unit;
    }
}
