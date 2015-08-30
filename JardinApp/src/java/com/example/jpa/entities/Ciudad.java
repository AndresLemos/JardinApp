/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author PC 4
 */
@Entity
@Table(name="Ciudad")
public class Ciudad implements Serializable {
    @Id
    @Column(name="id_ciudad")
    private int idCiudad;
    
    @Column(name="nombre_ciudad")
    private String nombreCiudad;
    
    @JoinColumn(name="id_departamento",referencedColumnName="id_departamento")
    @ManyToOne(optional=false)
    private Departamentos idDepartamento;

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Departamentos getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamentos idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    
    
    
}

