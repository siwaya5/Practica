/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.practica.dto;

/**
 *
 * @author Simon
 */
public class CarroDTO {

    private Long id;
    private String marca;
    private String modelo;
    private Long idPersona;

    private PersonaDTO persona;

    public CarroDTO() {
    }

    public CarroDTO(Long id, String marca, String modelo, Long idPersona, PersonaDTO persona) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.idPersona = idPersona;
        this.persona = persona;
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

    public PersonaDTO getPersona() {
        return persona;
    }

    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

}
