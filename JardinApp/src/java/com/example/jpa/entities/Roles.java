package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Paola
 */
@Entity
@Table(name = "Roles")
public class Roles implements Serializable {
    @Id
    @Column(name = "id_rol")
    private int idRol;
    
    @Column(name="nombre_rol")
    private String nombreRol;
    
    @ManyToMany(mappedBy="listRoles")
    private List<Usuario> listUsuario;

    public Roles() {
    }

    public Roles(int idRol) {
        this.idRol = idRol;
    }
    
    
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    public List<Usuario> getListUsuariosHasRoleses() {
        return listUsuario;
    }
    
    public void setListUsuariosHasRoles(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;        
    }
}