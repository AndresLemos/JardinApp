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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USUARIO1
 */
@Entity
@Table(name="Departamento")
public class Departamentos implements Serializable{
  @Id
  @Column(name="id_departamento")
  private Integer idDepartamento;
  
 @Column(name="nombre_departamento")
  private String nombreDepartamento;
 
 @JoinColumn(name="id_pais",referencedColumnName="id_pais")
 @ManyToOne(optional=false)
 private Pais idPais;
 
 @OneToMany(cascade =CascadeType.ALL,mappedBy="idDepartamento")
 private List<Ciudad> listCiudad;

 public Departamentos() {
 }

 public Departamentos(Integer idDepartamento) {
    this.idDepartamento = idDepartamento;
 }
    
//getters 
 public Integer getIdDepartamento(){
     return idDepartamento;
 }
 public String getNombreDepartamento(){
     return nombreDepartamento;
 }
public Pais getIdPais(){
    return idPais;
}

//setters
 public void setIdDepartamento(Integer idDepartamento){
     this.idDepartamento=idDepartamento;
 }
 public void setNombreDepartamento(String nombreDepartamento){
     this.nombreDepartamento=nombreDepartamento;
 }
 public void setIdPais(Pais idPais){
     this.idPais=idPais;
 }
 
 public List<Ciudad> getListCiudad(){
        return listCiudad;
    }
 
 public void setListCiudad(List<Ciudad> listCiudad){
        this.listCiudad=listCiudad;
    }
}
