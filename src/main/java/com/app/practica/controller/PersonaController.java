/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.controller;

import com.app.practica.facade.PersonaServiceFacade;
import com.app.practica.model.Persona;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Simon
 */
@RestController
@RequestMapping("/Persona")
public class PersonaController {

    @Autowired
    private PersonaServiceFacade personaServiceFacade;

    @RequestMapping(value = "getSaludo", method = RequestMethod.GET)
    public String getSaludo() throws Exception {
        return "Hola";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Persona guardarPersona(@RequestBody @Valid Persona persona) {
        return personaServiceFacade.guardarPersona(persona);
    }

}
