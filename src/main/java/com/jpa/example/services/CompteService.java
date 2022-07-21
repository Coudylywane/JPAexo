package com.jpa.example.services;

import java.util.ArrayList;
import java.util.List;

import com.jpa.example.dao.CompteDaoImp;
import com.jpa.example.dao.ICompteDao;
import com.jpa.example.models.Client;
import com.jpa.example.models.Compte;

public class CompteService {
    private ICompteDao iCompteDao;

    public CompteService(){
        iCompteDao = new CompteDaoImp();
    }
    public List<Compte> findAllCompteByClient(Client client){
        return iCompteDao.findAllByClient(client).orElse(new ArrayList<Compte>());
    }
    public boolean addCompte(Compte compte){
        return iCompteDao.save(compte);
    }
}
