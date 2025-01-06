package Proyecto_facturacion;

import java.util.ArrayList;
import java.util.List;

public class tarjetaCredito  {
    private double limite;
    private double saldo;
    private List<Compra> listaCompra; //Lista de compras

    public tarjetaCredito(double limite){
        this.limite = limite;
        this.saldo = limite; //Inicializacion con limite por que su valoro va reduciendo
        this.listaCompra = new ArrayList<>();
    }

    public boolean LanzarCompra(Compra compra){ //Validacion de si es posible hacer la compra
        if(this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaCompra.add(compra); //Anade el objeto a la lista
            return true; //Retorna true cuando fue exitoso el retorno
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompra() {
        return listaCompra;
    }

}
