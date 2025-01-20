package com.proyectoFrases.Screenmatch_frases.servicios;

import com.proyectoFrases.Screenmatch_frases.dto.FraseDTO;
import com.proyectoFrases.Screenmatch_frases.model.Frase;
import com.proyectoFrases.Screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;
    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }
}