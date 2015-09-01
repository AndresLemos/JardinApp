package com.example.jpa.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andres
 */
public class CiudadPK implements Serializable{
    
    private Integer idCiudad;
    private Integer idDepartamento;
    
        public CiudadPK(){

        }

        public CiudadPK(Integer idCiudad, Integer idDepartamento){
           this.idCiudad=idCiudad;
           this.idDepartamento=idDepartamento;
        }

        public Integer getidCiudad(){
           return idCiudad;

        }

        public void setidCiudad(Integer idCiudad){
           this.idCiudad=idCiudad;
        }

        public Integer getIdDepartamento(){
           return idDepartamento;
        }

        public void setidDepartamento(Integer idDepartamento){
           this.idDepartamento=idDepartamento;
        }

           @Override
           public int hashCode() {
               int hash = 7;
               hash = 37 * hash + Objects.hashCode(this.idCiudad);
               hash = 37 * hash + Objects.hashCode(this.idDepartamento);
               return hash;
           }

           @Override
           public boolean equals(Object obj) {
               if (obj == null) {
                   return false;
               }
               if (getClass() != obj.getClass()) {
                   return false;
               }
               final CiudadPK other = (CiudadPK) obj;
               if (!Objects.equals(this.idCiudad, other.idCiudad)) {
                   return false;
               }
               if (!Objects.equals(this.idDepartamento, other.idDepartamento)) {
                   return false;
               }
               return true;
           }

}
