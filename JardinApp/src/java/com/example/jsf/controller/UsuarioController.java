/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controller;
import com.example.jpa.entities.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.example.jpa.sessions.UsuarioSession;

@ManagedBean
@ViewScoped
public class UsuarioController {
    
    @EJB
    private UsuarioSession usuarioSession;
    
    private Usuario selectedUsuario;
    
    private List<Usuario>itemsUsuario = null;
    
    public UsuarioController(){
        
    }
    
    public Usuario getSelectedUsuario(){
        return selectedUsuario;
    }
    
    public void setSelectedUsuario(Usuario selectedUsuario){
        this.selectedUsuario = selectedUsuario;
    }
    
    public UsuarioSession getUsuarioSession(){
        return usuarioSession;
    }
    
    public List<Usuario> getItemsUsuario(){
        if(itemsUsuario == null){
            try{
                itemsUsuario = getItemsUsuario();
            }
            catch (Exception ex){
                System.err.println(ex.getMessage());
        }
        
    }
        return itemsUsuario;   
    }
    public void create(){
        try{
            getUsuarioSession().create(selectedUsuario);
        }
        catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }

}