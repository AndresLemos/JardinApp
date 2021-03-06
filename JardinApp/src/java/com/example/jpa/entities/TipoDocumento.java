package com.example.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
@Table(name = "tipos_documentos")
public class TipoDocumento implements Serializable {
    
    @Id
    @Column(name = "id_tipos_documentos")
    private int idTipo;
    
    @Column(name="nombre_tipo_documento")
    private String nombreTipoDocumento;
    
    @OneToMany(cascade =CascadeType.ALL,mappedBy="idTipoDocumento")
    private List<Usuario> listUsuarios;

    public TipoDocumento() {
    }

    public TipoDocumento(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipoDocumento() {
        return nombreTipoDocumento;
    }

    public void setTipoDocumento(String nombreTipoDocumento) {
        this.nombreTipoDocumento = nombreTipoDocumento;
    }
    
     public List<Usuario> getListTipoDocumento(){
        return listUsuarios;
    }
    public void setListDepartamentos(List<Usuario> listUsuarios){
        this.listUsuarios=listUsuarios;
    }
    
}