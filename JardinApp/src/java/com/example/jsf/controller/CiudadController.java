/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controller;

import com.example.jpa.entities.Ciudad;
import com.example.jpa.sessions.CiudadSession;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC 4
 */

@ManagedBean
@ViewScoped
public class CiudadController implements Serializable {
    private CiudadSession departamentoSession;
    
    private Ciudad selectedCiudad;
    private List<Ciudad> itemsCiudad=null;
    
    public CiudadController() {
        
    }

    public Ciudad getSelectedCiudad() {
        if(selectedCiudad==null){
            selectedCiudad=new Ciudad();
        }
        return selectedCiudad;
    }

    public void setSelectedCiudad(Ciudad selectedCiudad) {
        this.selectedCiudad = selectedCiudad;
    }

    public CiudadSession getCiudadSession() {
        return departamentoSession;
    }

    public List<Ciudad> getItemsCiudad() {
        if(itemsCiudad==null){
            
        
            try{
                itemsCiudad=getCiudadSession().findAll();
            }catch(Exception ex){
                System.err.println(ex.getMessage());
                }
        }
        return itemsCiudad;
    }
    
    public void create(){
        try{
            getCiudadSession().create(selectedCiudad);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
