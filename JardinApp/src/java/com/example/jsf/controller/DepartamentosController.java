/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controller;

import com.example.jpa.entities.Departamentos;
import com.example.jpa.entities.Pais;
import com.example.jpa.sessions.DepartamentosSession;
import com.example.jpa.sessions.PaisSession;
import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;


/**
 *
 * @author adsi2
 */
@ManagedBean
@ViewScoped


public class DepartamentosController implements Serializable {

    /**
     * Creates a new instance of PaisController
     */
    @EJB // Enterface Java Beans
    private DepartamentosSession departamentoSession;
    
    private Departamentos selectedDepartamento;
    private List<Departamentos> itemsDepartamento=null;
    
    public DepartamentosController() {
        
    }

    public Departamentos getSelectedDepartamento() {
        if(selectedDepartamento==null){
            selectedDepartamento=new Departamentos();
        }
        return selectedDepartamento;
    }

    public void setSelectedDepartamento(Departamentos selectedDepartamentos) {
        this.selectedDepartamento = selectedDepartamentos;
    }

    public DepartamentosSession getDepartamentoSession() {
        return departamentoSession;
    }

    public List<Departamentos> getItemsDepartamentos() {
        if(itemsDepartamento==null){
            
        
            try{
                itemsDepartamento=getDepartamentoSession().findAll();
            }catch(Exception ex){
                System.err.println(ex.getMessage());
                }
        }
        return itemsDepartamento;
    }
    
    public void create(){
        try{
            getDepartamentoSession().create(selectedDepartamento);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
