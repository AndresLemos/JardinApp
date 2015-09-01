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
        if(selectedUsuario==null){
            selectedUsuario=new Usuario();
        }
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
                itemsUsuario = getUsuarioSession().finAll();
            }catch (Exception ex){
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