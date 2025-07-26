
package com.factusLog.appfactus;

import java.util.Date;

public class Factura {
    private Cliente cliente;
    private int folio;
    private String descripcion;
    private Date fecha;
    private ItemFactura[] items;
    private int indiceItems;

    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;
    
    public Factura(Cliente cliente, String descripcion, Date fecha, int folio, ItemFactura[] items) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.fecha = new Date();
        this.folio = ++ultimoFolio;
        this.items = new ItemFactura[MAX_ITEMS];
    }

    // Getters and Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public ItemFactura[] getItemFacturas() {
        return items;
    }

    public void addItemFactura(ItemFactura item) {
        // Validacion de no desbordar el vector
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal() {
        float total = 0.0f;
        for (ItemFactura item : this.items) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder("Factura N : ");
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombreCliente())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        // Agregacion de fechas a factura
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emision: ")
            .append(df.format(this.fecha))
            .append("\n");

        for(ItemFactura item : this.items){
            if(item == null){
                continue;
            }

            sb.append(item.getProducto().getCodigo())
                .append("\t")
                .append(item.getProducto().getNombre())
                .append("\t")
                .append(item.getProducto().getPrecio())
                .append("\t")
                .append(item.getCantidad())
                .append("\t")
                .append(item.calcularImporte())
                .append("\n")
        }   
        sb.append("\n Gran total: ")
            .append(calcularTotal());
            
        return sb.toString();
    }





}





