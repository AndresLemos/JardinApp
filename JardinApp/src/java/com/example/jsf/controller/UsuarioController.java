package com.example.jsf.controller;


import com.example.jpa.entities.Ciudad;
import com.example.jpa.entities.Departamentos;
import com.example.jpa.entities.Roles;
import com.example.jpa.entities.TipoDocumento;
import com.example.jpa.entities.Usuario;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.example.jpa.sessions.UsuarioSession;
import java.io.Serializable;
import java.util.StringTokenizer;

@ManagedBean
@ViewScoped
public class UsuarioController implements Serializable {
    
    @EJB
    private UsuarioSession usuarioSession;
    
    //Crear variables para las claves foraneas temporalmente
    private int idCiudad;
    private int idDepartamento;
    private int idRol;
    private Usuario selectedUsuario;
    private int idTipoDocumento;
    private List<Usuario>itemsUsuario = null;
    
    public UsuarioController(){
        
    }

    public String getIdCiudad() {
        return idCiudad + "," + idDepartamento;
    }

    public void setIdCiudad(String ciudad) {
        StringTokenizer tokens = new StringTokenizer(ciudad,",");
        idCiudad = Integer.parseInt(tokens.nextToken());
        idDepartamento=Integer.parseInt(tokens.nextToken());
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

  

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
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
            // ***************
            //selectedUsuario.setCiudad(new Ciudad(idCiudad, new Departamento(idDepartamento)));
            //selectedUsuario.setRol(new Rol(idRol));
            //getUsuarioSession().create(selectedUsuario);
            //***************
            System.out.println("Mensaje");
            
            selectedUsuario.setIdCiudad(new Ciudad(idCiudad,new Departamentos(idDepartamento)));
            selectedUsuario.setIdRoles(new Roles(idRol));
            selectedUsuario.setTipoDocumento(new TipoDocumento(idTipoDocumento));
            
            getUsuarioSession().create(selectedUsuario);
        }
        catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}