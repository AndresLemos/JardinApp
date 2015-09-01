/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controller;

import com.example.jpa.entities.Pais;
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


public class PaisController implements Serializable {

    /**
     * Creates a new instance of PaisController
     */
    @EJB // Enterface Java Beans
    private PaisSession paisSession;
    
    private Pais selectedPais;
    private List<Pais> itemsPais=null;
    
    public PaisController() {
        
    }

    public Pais getSelectedPais() {
        if(selectedPais==null){
            selectedPais=new Pais();
        }
        return selectedPais;
    }

    public void setSelectedPais(Pais selectedPais) {
        this.selectedPais = selectedPais;
    }

    public PaisSession getPaisSession() {
        return paisSession;
    }

    public List<Pais> getItemsPais() {
        if(itemsPais==null){
            try{
                itemsPais=getPaisSession().findAll();
            }catch(Exception ex){
                System.err.println(ex.getMessage());
                }
        }
        return itemsPais;
    }
    
    public void create(){
        try{
            getPaisSession().create(selectedPais);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
