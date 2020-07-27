/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.service.impl;

import com.app.practica.model.Carro;
import com.app.practica.repository.CarroRepository;
import com.app.practica.service.CarroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Simon
 */
@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroRepository carroRepository;

    @Override
    public Carro guardarCarro(Carro carro) {
        return carroRepository.save(carro);
    }

    @Override
    public List<Carro> findByIdPersona(Long id) {
        return carroRepository.findByIdPersona(id);
    }

}
