/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.facade.impl;

import com.app.practica.facade.PersonaServiceFacade;
import com.app.practica.model.Persona;
import com.app.practica.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class PersonaServiceFacadeImpl implements PersonaServiceFacade {

    @Autowired
    private PersonaService personaService;

    @Override
    public Persona guardarPersona(Persona persona) {
        return personaService.guardarPersona(persona);
    }

}
