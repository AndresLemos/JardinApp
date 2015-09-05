package com.example.jsf.controller;

import com.example.jpa.entities.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.example.jpa.sessions.UsuarioSession;
import java.util.StringTokenizer;

@ManagedBean
@ViewScoped
public class UsuarioController {
    
    @EJB
    private UsuarioSession usuarioSession;
    
    //Crear variables para las claves foraneas temporalmente
    private int idCiudad;
    private int idDepartamento;
    private String idRol;
    private Usuario selectedUsuario;
    
    private List<Usuario>itemsUsuario = null;
    
    public UsuarioController(){
        
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(String ciudad) {
        StringTokenizer tokens = new StringTokenizer(ciudad,",");
        idCiudad = Integer.parseInt(tokens.nextToken());
        idDepartamento=Integer.parseInt(tokens.nextToken());
    }

  

    public String getIdRol() {
        return idRol;
    }

    public void setIdRol(String idRol) {
        this.idRol = idRol;
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