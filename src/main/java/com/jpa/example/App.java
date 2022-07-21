package com.jpa.example;

import java.util.Date;
import java.util.List;

import com.jpa.example.dao.PersistanceDao;
import com.jpa.example.models.Client;
import com.jpa.example.models.Compte;
import com.jpa.example.services.ClientService;
import com.jpa.example.services.CompteService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersistanceDao.createTable();

        ClientService clientService = new ClientService();
        CompteService compteService = new CompteService();

        Client client = new Client();
        client.setAddress("Dieupeul");
        client.setNomComplet("Ecole 221");
        client.setTelephone("330002220");

        clientService.saveClient(client);

        List<Client> clients = clientService.findAllClient();
        for(Client c : clients) {
          System.out.println("########## ID " + c.getId() + "#################");
          System.out.println("Nom Complet : " + c.getNomComplet());
          System.out.println("Adresse : " + c.getAddress());
          System.out.println("Telephone : " + c.getTelephone());
        }
        Client client2 = clientService.findClientById(1L);
        Compte compte = new Compte(); 
        compte.setNumero("525");
        compte.setCreatedDate(new Date());
        compte.setMontant(105000000);
        compte.setClient(client2);

        compteService.addCompte(compte);  
        
        List<Compte> comptes = compteService.findAllCompteByClient(client2);
        for (Compte compte2 : comptes) {
          System.out.println("id: " + compte2.getId());
          System.out.println("numero: " + compte2.getNumero());
          System.out.println("motant: " + compte2.getMontant());
          System.out.println("client: " + compte2.getClient().getNomComplet());
        }

        PersistanceDao.closeEntityManagerFactory();
    }
}
