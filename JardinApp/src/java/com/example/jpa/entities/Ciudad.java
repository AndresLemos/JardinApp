/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC 4
 */

@Entity
@Table(name="Ciudad")
@IdClass(value = CiudadPK.class)
public class Ciudad implements Serializable {
    @Id
    @Column(name="id_ciudad")
    private Integer idCiudad;
    
    @Column(name="nombre_ciudad")
    private String nombreCiudad;
    
    @Id
    @ManyToOne(optional=false)
    @JoinColumn(name="id_departamento")
    private Departamentos idDepartamento;
    
    @OneToMany(cascade =CascadeType.ALL,mappedBy = "idCiudad")
    private List<Usuario> listUsuario ;

    public Ciudad() {
    }

    public Ciudad(Integer idCiudad, Departamentos idDepartamento) {
        this.idCiudad = idCiudad;
        this.idDepartamento = idDepartamento;
    }

    

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
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
    
    public List<Usuario> getListCiudad() {
        return listUsuario;
    }
    
    public void setListCiudad(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;        
    }
    
}

