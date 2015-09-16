/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.entities;

import com.example.jsf.controllers.util.JsfUtil;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable{
    
    @Id
    @Column(name="id_documento")
    private String idDocumento;
    
    @Column(name="primer_nombre")
    private String primerNombre;
    
    @Column(name="segundo_nombre")
    private String segundoNombre;
    
    @Column(name="primer_apellido")
    private String primerApellido;
    
    @Column(name="segundo_apellido")
    private String segundoApellido;
    
    private String contrasenia;
    
    private String direccion;
    
    private String telefono;
    
    private String celular;
    
    private String correo;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tipos_documentos", referencedColumnName = "id_tipos_documentos")
    private TipoDocumento idTipoDocumento;
    
    @Column(name="titulo_profesional")
    private String tituloProfesional;
    
    @ManyToOne(optional = false)
    @JoinColumns(
            {
                @JoinColumn(name = "id_ciudad", referencedColumnName = "id_ciudad"),
                @JoinColumn(name="id_departamento", referencedColumnName = "id_departamento")
            }
    )
    private Ciudad idCiudad;
    
    @ManyToOne
    @JoinColumn(name = "id_rol",referencedColumnName="id_rol")       
    private Roles idRoles;

    public Roles getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(Roles idRoles) {
        this.idRoles = idRoles;
    }
    

    public Usuario() {
    }

    public Usuario(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(String idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
  //Esta en emtity de leo  
    public void setContrasenia(String password) {
        try {
            this.contrasenia = JsfUtil.generateDigest(password);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public String getContrasenia() {
        return contrasenia;
    }

   
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public TipoDocumento getTipoDocumento() {
        return idTipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getTituloProfesional() {
        return tituloProfesional;
    }

    public void setTituloProfesional(String tituloProfesional) {
        this.tituloProfesional = tituloProfesional;
    }
    
     public Ciudad getIdCiudad() {
        return idCiudad;
    }
     
    public void setIdCiudad(Ciudad idCiudad) {
        this.idCiudad = idCiudad;
    }
    
   
    
}