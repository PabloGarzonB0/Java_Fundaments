package com.proyectoFrases.Screenmatch_frases.controller;

import com.proyectoFrases.Screenmatch_frases.dto.FraseDTO;
import com.proyectoFrases.Screenmatch_frases.servicios.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFrases(){
        return service.obtenerFraseAleatoria();
    }
}
