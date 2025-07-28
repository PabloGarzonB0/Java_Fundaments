package Java_Oracle.Sobrecarga;

public class Calculadora {
    private Calculadora(){}
    public static int sumar(int a, int... argumentos){ // Permite el ingreso de argumentos variables
        // Todos los metodos deben ser del mismo tipo
       int total = a;
       for(int i = 0; i < argumentos.length; i++){
           total += argumentos[i];
       }
       return total;
    }
    public static double sumar(double... varargs){
        double total = 0.0;
        for(double d: varargs){ // suma todos los elementos por extension que se le ponen
            total += d;
        }
        return total;
    }
    public static int sumar(int a, int b){
        return a + b;
    }
    public static float sumar(float x, int y ){
        return x + y;
    }
    public static float sumar(int i, float j){
        return i + j;
    }
    public static float sumar(float i, float j){
        return j + i;
    }
    public static int sumar(String a, String b){
        int resultado;
        try{
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        }catch(NumberFormatException e){
            resultado = 0;
        }
        return resultado;
    }
    public static int sumar(int a, int b, int c){
        return a + b + c;
    }
}
