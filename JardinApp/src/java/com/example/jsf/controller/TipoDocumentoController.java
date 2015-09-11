/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controller;

import com.example.jpa.entities.TipoDocumento;

import com.example.jpa.sessions.TipoDocumentoSession;
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


public class TipoDocumentoController implements Serializable {

    /**
     * Creates a new instance of PaisController
     */
    @EJB // Enterface Java Beans
    private TipoDocumentoSession tipoDocumentoSession;
    
    private TipoDocumento selectTipoDocumento;
    private List<TipoDocumento> itemsTipoDocumento=null;
    
    public TipoDocumentoController() {
        
    }

    public TipoDocumento getSelectedTipoDocumento() {
        if(selectTipoDocumento==null){
            selectTipoDocumento=new TipoDocumento();
        }
        return selectTipoDocumento;
    }

    public void setSelectedTipoDocumento(TipoDocumento selectTipoDocumento) {
        this.selectTipoDocumento = selectTipoDocumento;
    }

    public TipoDocumentoSession getTipoDocumentoSession() {
        return tipoDocumentoSession;
    }

    public List<TipoDocumento> getItemsTipoDocumento() {
        if(itemsTipoDocumento==null){
            try{
                itemsTipoDocumento=getTipoDocumentoSession().findAll();
            }catch(Exception ex){
                System.err.println(ex.getMessage());
                }
        }
        return itemsTipoDocumento;
    }
    
    public void create(){
        try{
            getTipoDocumentoSession().create(selectTipoDocumento);
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    
}
