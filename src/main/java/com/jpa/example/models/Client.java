package com.jpa.example.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomComplet;
    private String telephone;
    private String address;

    @OneToMany(mappedBy = "client")
    private List<Compte> comptes = new ArrayList<>();
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * @return the nomComplet
     */
    public String getNomComplet() {
        return nomComplet;
    }
    /**
     * @param nomComplet the nomComplet to set
     */
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }
    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the comptes
     */
    public List<Compte> getComptes() {
        return comptes;
    }
    /**
     * @param comptes the comptes to set
     */
    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    
}
