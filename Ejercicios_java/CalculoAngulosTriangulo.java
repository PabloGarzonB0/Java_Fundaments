package modulo1.OperacionesJava;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoAreaTriangulo {
    public static void main(String[] args){
        //Programa para el calculo del area de un triangulo
        
        Scanner lectura = new Scanner(System.in);
        
        // Inicializacion de varialbes 
        double ladoA = 0, ladoB = 0, ladoC = 0, hTriangulo;
        double A = 0,B = 0 ,C = 0, areaTriangulo;
        double s; // Semi-periodo
        String tipoTriangulo = "";
        double anguloTriangulo = 0;
        
        System.out.println("Ingrese los 3 lados del triangulo a evaluar y presiones ENTER:");
        try{
        ladoA = lectura.nextDouble();
        ladoB = lectura.nextDouble();
        ladoC = lectura.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("Error al ingresar valores, introduce un valor valido:  " + e.getMessage());
            System.exit(0);
        }
        
        System.out.print("Ingrese la altura del triangulo: ");
        areaTriangulo = lectura.nextDouble();
        
        if(ladoA == ladoB){
            
            if(ladoB == ladoC){
                tipoTriangulo = "Equilatero";
            
            }else{
                tipoTriangulo = "Isosceles";
            }
        
        }else if(ladoA == ladoC){
            tipoTriangulo = "Isosceles";
        
        }else{
            tipoTriangulo = "Escaleno";
        }
        
        switch(tipoTriangulo){
            
            case "Equilatero":
                anguloTriangulo = (180 / 3);
                A = B = C = anguloTriangulo;
                areaTriangulo = (Math.sqrt(3) / 4) * ladoA * ladoA;
                break;
                
            case "Isosceles":      
            case "Escaleno":
                
                A = Math.acos((Math.pow(ladoB,2) + Math.pow(ladoC,2) - Math.pow(ladoA,2)) / (2 * ladoB * ladoC));
                B = Math.acos((Math.pow(ladoA,2) + Math.pow(ladoC,2) - Math.pow(ladoB,2)) / (2 * ladoA * ladoC));
                C = Math.acos((Math.pow(ladoA,2) + Math.pow(ladoB,2) - Math.pow(ladoC,2)) / (2 * ladoA * ladoB));
                
                // Conversión de medidas a grados
                A = Math.toDegrees(A);
                B = Math.toDegrees(B);
                C = Math.toDegrees(C);
                
                s = (ladoA + ladoB + ladoC) / 2; // Calculo de semi-perimetro
                areaTriangulo = Math.sqrt((s*(s - ladoA)*(s - ladoB)*(s - ladoC)));
                break;
                
            default:
                System.out.println("Tipo de triangulo no reconocible en el sistema");
    }
        System.out.println("El tipo de triangulo es: " + tipoTriangulo);
        System.out.println("Los angulos internos del triangulo son:  AnguloA:" + A + " AnguloB:" + B + " AnguloC:" + C);
        System.out.println("El area del triangulo es : " + areaTriangulo);
    }
}
