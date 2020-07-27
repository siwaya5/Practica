/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.service.impl;

import com.app.practica.model.Persona;
import com.app.practica.repository.PersonaRepository;
import com.app.practica.service.PersonaService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class PersonaServicioImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona findById(Long id) {
        Optional<Persona> persona = personaRepository.findById(id);
        if (persona.isPresent()) {
            return persona.get();
        }
        return new Persona();
    }

    @Override
    public Persona findByDocumento(String nombre) {
        return personaRepository.findByDocumento(nombre);
    }

}
