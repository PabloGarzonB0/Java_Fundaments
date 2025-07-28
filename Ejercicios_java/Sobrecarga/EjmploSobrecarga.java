package Java_Oracle.Sobrecarga;
import static Java_Oracle.Sobrecarga.Calculadora.*;
public class EjemploSobrecarga {
    public static void main(String[] args) {
        //Calculadora cal = new Calculadora();
        System.out.println("Sumar int: " + Calculadora.sumar(20, 10));
        System.out.println("Sumar float: " + Calculadora.sumar(10.0F, 5F));
        System.out.println("Suma String: " + Calculadora.sumar("30", "30"));
        System.out.println("Suma float int: " + Calculadora.sumar(32F, 20));
        System.out.println("Suma de multiples enteros: " + Calculadora.sumar(12, 43, 54, 2));
        System.out.println("Suma de numeros double: " + Calculadora.sumar(10.0, 5.0, 3.5, 4.5));
    }
}
