/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.service;

import com.app.practica.model.Persona;

/**
 *
 * @author Simon
 */
public interface PersonaService {

    Persona guardarPersona(Persona persona);
    
    Persona findById(Long id);
    
    Persona findByDocumento(String nombre);
}
