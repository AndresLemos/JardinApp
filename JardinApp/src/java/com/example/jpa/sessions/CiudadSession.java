/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.sessions;


import com.example.jpa.entities.Ciudad;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author PC 4
 */
@Stateless
public class CiudadSession {
    @PersistenceContext
     private EntityManager entityManager;
    
    public void create(Ciudad ciudad){
        entityManager.persist(ciudad);
        
    }
    public List<Ciudad> findAll(){
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Ciudad.class));
        return entityManager.createQuery(cq).getResultList();
    }
    
    public void Edit(Ciudad ciudad){
        entityManager.merge(ciudad);
    }
    public void remove(Ciudad ciudad){
        entityManager.remove(ciudad);
    }
}


