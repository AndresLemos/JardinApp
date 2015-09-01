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
    
    private CiudadSession ciudadSession;
    
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
        return ciudadSession;
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
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}
