package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;
    private String clientFirstName;
    private String clientLastName;
    private String clientEmail;
    private String clientAddress;

    @ManyToOne
    @JoinColumn(name = "advisor_id", referencedColumnName = "advisorId")
    private Advisor advisor;
    public Client()
    {

    }
    public Client(long clientId ,String clientFirstName,String clientLastName,String clientEmail,String clientAddress)
    {
        this.clientId = clientId;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientAddress = clientAddress;
        this.clientEmail = clientEmail;

    }

    public long getClientId() {
        return clientId;
    }
    public void setClientId(long updateClientId)
    {
        this.clientId = updateClientId;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }
    public void setClientFirstName(String clientLastName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
