/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.sessions;

import com.example.jpa.entities.TipoDocumento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author adsi2
 */
@Stateless
public class TipoDocumentoSession {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
     private EntityManager entityManager;
    
    public void create(TipoDocumento tipoDocumento){
        entityManager.persist(tipoDocumento);
        
    }
    public List<TipoDocumento> findAll(){
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(TipoDocumento.class));
        return entityManager.createQuery(cq).getResultList();
        //return entityManager.createNamedQuery("Pais.findAll").getResultList();
    }
    
    public void Edit(TipoDocumento tipoDocumento){
        entityManager.merge(tipoDocumento);
    }
    public void remove(TipoDocumento tipoDocumento){
        entityManager.remove(tipoDocumento);
    }
}
