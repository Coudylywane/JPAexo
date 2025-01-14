package com.jpa.example.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.example.models.Client;

public class PersistanceDao {
    private static EntityManagerFactory emf;

    private PersistanceDao() {
        emf = Persistence.createEntityManagerFactory("userPU");
    }

    public static EntityManager getEntityManager() {
        if(emf == null) {
            new PersistanceDao();
        }

        return emf.createEntityManager();
    }

    public static void createTable() {
        EntityManager em = getEntityManager();
        em.createQuery("SELECT c FROM Client c", Client.class).getResultList();
    }

    public static void closeEntityManagerFactory() {
        emf.close();
    }

}
