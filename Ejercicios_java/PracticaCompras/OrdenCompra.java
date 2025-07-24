package OrientadoObjetos.PracticaOrdenCompra;

import java.util.Date;

public class OrdenCompra {
    private int identificacdor;
    private String descripcion;
    private Date fecha;
    private Producto[] producto;
    private Cliente cliente;
    private int indiceProducto; // Variable intermedia

    // VARIABLES ESTATICAS
    private static int ultimoId;

    // CONSTRUCTORES
    public OrdenCompra(){
        this.identificacdor = ++ultimoId;
        this.producto = new Producto[4];
    }
    public OrdenCompra(String descripcion){
        this();
        this.descripcion = descripcion;
    }
    // GETTERS
    public int getIdentificacdor(){
        return this.identificacdor;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public Date getFecha(){
        return this.fecha;
    }
    public Producto[] getProducto() {
        return this.producto;
    }
    public Cliente getCliente(){
        return this.cliente;
    }

    // SETTERS
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    // METODO DE AGREGACION DE PRODUCTOS
    public void addProducto(Producto producto){
        if(indiceProducto < this.producto.length){
            this.producto[indiceProducto++] = producto;
        }
    }

    public double totalCompra(){
        double totalSuma = 0;
        for(int i = 0; i < producto.length; i++){
            if(producto[i].getPrecio() > 0) {
                totalSuma += producto[i].getPrecio();
            }
        }
        System.out.println("Sumatoria de productos: " + totalSuma);
        return totalSuma;
    }

    public String detallesCompra(){
        String detalle = "Identificador Producto = " + this.identificacdor+
                "\ndescripcion orden = " + this.descripcion +
                "\nfecha de compra = "+ this.fecha;

        if(this.getProducto() != null){
            detalle += "\n Productos Orden: ";
            for(Producto p: this.getProducto()){
                if(p == null){
                    break;
                }
                detalle += "\n" + p.getNombreProducto() + ", precio: " + p.getPrecio() + ", fabricante: " + p.getFabricante();
            }
            detalle += "\nprecio total por compras = "+ this.totalCompra();
        }
        return detalle;
    }

}
