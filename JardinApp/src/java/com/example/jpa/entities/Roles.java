package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private Integer idRol;
    
    @Column(name="nombre_rol")
    private String nombreRol;
    /*
    @OneToMany(mappedBy = "idUsuarioHasRoles")
    private List<UsuariosHasRoles> listUsuarioHasRoles ;
    */
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

}