package com.jpa.example.dao;

import java.util.List;
import java.util.Optional;

import com.jpa.example.models.Client;
import com.jpa.example.models.Compte;

public interface ICompteDao extends IDao<Compte, Long> {
    Optional <List<Compte> > findAllByClient(Client client);
}
