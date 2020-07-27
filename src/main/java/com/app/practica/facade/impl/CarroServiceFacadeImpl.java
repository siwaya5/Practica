/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.facade.impl;

import com.app.practica.dto.CarroDTO;
import com.app.practica.dto.PersonaDTO;
import com.app.practica.facade.CarroServiceFacade;
import com.app.practica.model.Carro;
import com.app.practica.model.Persona;
import com.app.practica.service.CarroService;
import com.app.practica.service.PersonaService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class CarroServiceFacadeImpl implements CarroServiceFacade {

    @Autowired
    private CarroService carroService;

    @Autowired
    private PersonaService personaService;

    @Override
    public Carro guardarCarro(Carro carro) {
        return carroService.guardarCarro(carro);
    }

    @Override
    public List<CarroDTO> findByIdPersona(Long id) {
        List<CarroDTO> listCarro = new ArrayList<>();

        Persona persona = personaService.findById(id);
        PersonaDTO personaDTO = new PersonaDTO(persona.getId(), persona.getDocumento(), persona.getNombre(), persona.getApellido(), persona.getCiudad());
        List<Carro> listReturn = carroService.findByIdPersona(id);

        for (Carro car : listReturn) {
            listCarro.add(new CarroDTO(car.getId(), car.getMarca(), car.getModelo(), car.getIdPersona(), personaDTO));
        }

        return listCarro;

    }

}
