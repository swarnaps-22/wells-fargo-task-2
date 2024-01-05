package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;
    @OneToOne
    private Client clientId;
    private String firstName;
    private String lastName;
    public Portfolio()
    {

    }

    public Portfolio(long portfolioId,String firstName,String lastName)
    {
        this.portfolioId = portfolioId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
