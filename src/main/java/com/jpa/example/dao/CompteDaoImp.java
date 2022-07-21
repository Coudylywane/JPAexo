package com.jpa.example.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import com.jpa.example.models.Client;
import com.jpa.example.models.Compte;

public class CompteDaoImp implements ICompteDao{

    @Override
    public boolean save(Compte o) {
        EntityManager em = PersistanceDao.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            em.close();
            return true;
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.err.println(e.getMessage());
            em.close();
            return false;
        }
       
    }

    @Override
    public boolean delete(Compte o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean update(Compte o) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Compte findById(Long s) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Compte> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<List<Compte>> findAllByClient(Client client) {
        EntityManager em = PersistanceDao.getEntityManager();
        return Optional.of(em.createNamedQuery("Compte.findAllByClient",Compte.class)
        .setParameter("client", client)
        .getResultList());
    }
    
}
