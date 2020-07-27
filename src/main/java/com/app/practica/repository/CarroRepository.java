/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.repository;

import com.app.practica.model.Carro;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Simon
 */
public interface CarroRepository extends CrudRepository<Carro, Long> {

    List<Carro> findByIdPersona(Long idPersona);

}
