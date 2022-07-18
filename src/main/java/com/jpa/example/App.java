package com.jpa.example;

import java.util.List;

import com.jpa.example.dao.PersistanceDao;
import com.jpa.example.models.Client;
import com.jpa.example.services.ClientService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersistanceDao.createTable();


        Client client = new Client();
        client.setAddress("Dieupeul");
        client.setNomComplet("Ecole 221");
        client.setTelephone("330002220");

        ClientService clientService = new ClientService();
        clientService.saveClient(client);

        List<Client> clients = clientService.findAllClient();
        for(Client c : clients) {
          System.out.println("########## ID " + c.getId() + "#################");
          System.out.println("Nom Complet : " + c.getNomComplet());
          System.out.println("Adresse : " + c.getAddress());
          System.out.println("Telephone : " + c.getTelephone());
        }
 
        PersistanceDao.closeEntityManagerFactory();
    }
}
