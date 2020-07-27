/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.service;

import com.app.practica.model.Carro;
import java.util.List;

/**
 *
 * @author Simon
 */
public interface CarroService {

    Carro guardarCarro(Carro carro);

    List<Carro> findByIdPersona(Long id);

}
