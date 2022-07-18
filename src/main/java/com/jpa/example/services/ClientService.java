package com.jpa.example.services;

import java.util.List;

import com.jpa.example.dao.ClientDaoImp;
import com.jpa.example.dao.IClientDao;
import com.jpa.example.models.Client;

public class ClientService {
    private IClientDao iClientDao;

    public ClientService() {
        iClientDao = new ClientDaoImp();
    }

    public boolean saveClient(Client client) {
        return iClientDao.save(client);
    }

    public Client findClientById(Long id) {
        return iClientDao.findById(id);
    }

    public List<Client> findAllClient() {
        return iClientDao.findAll();
    }
}
