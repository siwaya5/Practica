/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.controller;

import com.app.practica.dto.CarroDTO;
import com.app.practica.facade.CarroServiceFacade;
import com.app.practica.model.Carro;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/Carro")
public class CarroController {

    @Autowired
    private CarroServiceFacade carroServiceFacade;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Carro guardarCarro(@RequestBody @Valid Carro carro) {
        return carroServiceFacade.guardarCarro(carro);
    }

    @RequestMapping(value = "findByIdPersona/{idPersona}", method = RequestMethod.GET)
    public List<CarroDTO> findByIdPersona(@PathVariable Long idPersona) {
        return carroServiceFacade.findByIdPersona(idPersona);
    }

}
