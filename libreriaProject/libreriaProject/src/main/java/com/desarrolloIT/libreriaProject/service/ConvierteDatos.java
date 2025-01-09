package com.desarrolloIT.libreriaProject.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatos implements IConvierteDatos{
    private ObjectMapper objectMapper = new ObjectMapper(); //Lee los datos que vienen de la api
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) { //Podria retornar una excepcion
        try{
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
