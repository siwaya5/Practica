/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

/**
 *
 * @author Simon
 */
@Entity
@Table(name = "carro")
public class Carro {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @javax.persistence.Id
    @Column(columnDefinition = "serial")
    private Long id;
    private String marca;
    private String modelo;
    private Long idPersona;

    public Carro() {
    }

    public Carro(Long id, String marca, String modelo, Long idPersona) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.idPersona = idPersona;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

}
