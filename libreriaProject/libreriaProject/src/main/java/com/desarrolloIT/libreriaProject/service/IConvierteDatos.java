package com.desarrolloIT.libreriaProject.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);  //Generalizacion para convertir json a data java
}
