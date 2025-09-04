package Java_Oracle.Exceptions.PooException;

public class Calculadora {

    public double dividir(int numerador, int divisor) throws DivisionPorZeroException {
        if(divisor == 0){
            throw  new DivisionPorZeroException("No es realizable la division por cero!");
        }
        return numerador/ (double) divisor;
    }
    // sobrecarga de metodos// Carcar a un mismoo metodo con diferentes funcionalidades
    public double dividir(String numberador, String divisor)
            throws DivisionPorZeroException, FormatoNumeroException{
        // Se requiere arrojar los metodos de excepcion del metodo sobreescrito y la nueva excepcion de formato
        try {
            int num = Integer.parseInt(numberador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        }catch(NumberFormatException e){
            throw  new FormatoNumeroException("Debe Ingresar un nuemero en el numerador y divisor");
        }

    }






}
