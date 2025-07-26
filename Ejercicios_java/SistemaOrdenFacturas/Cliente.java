package com.factusLog.appfactus;

public class Cliente {
    private String nombreCliente;
    private String nif;

    Cliente(String nombreCliente, String nif){
        this.nombreCliente = nombreCliente;
        this.nif = nif;
    }

    // Getters and Setters
    public String getNif() {
        return nif; }
    public void setNif(String nif) {
        this.nif = nif; }
    public String getNombreCliente() {
        return nombreCliente; }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente; }

}
