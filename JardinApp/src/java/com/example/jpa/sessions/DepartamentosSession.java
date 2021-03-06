/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.sessions;

import com.example.jpa.entities.Departamentos;
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
public class DepartamentosSession {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
     private EntityManager entityManager;
    
    public void create(Departamentos departamentos){
        entityManager.persist(departamentos);
        
    }
    public List<Departamentos> findAll(){
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Departamentos.class));
        return entityManager.createQuery(cq).getResultList();
    }
    
    public void Edit(Departamentos departamentos){
        entityManager.merge(departamentos);
    }
    public void remove(Departamentos departamentos){
        entityManager.remove(departamentos);
    }

   
}
