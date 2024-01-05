package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;




import java.time.LocalDate;

@Entity

public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long securityId;
    private String name;
    private String category;
    private final LocalDate  purchaseDate = LocalDate.now();
    private  long purchasePrice;
    private  long quantity;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    private Portfolio portfolio;
    public Security()
    {

    }
    public Security(long securityId,String name,String category,LocalDate  purchaseDate,long purchasePrice,long quantity)
    {
        this.securityId = securityId;
        this.name = name;
        this.category = category;

        this.purchasePrice = purchasePrice;
        this.quantity = quantity;

    }
    public long getSecurityId() {
        return securityId;
    }


    public String getName() {
        return name;
    }



    public String getCategory() {
        return category;
    }



    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }



    public long getPurchasePrice() {
        return purchasePrice;
    }



    public long getQuantity() {
        return quantity;
    }


}
