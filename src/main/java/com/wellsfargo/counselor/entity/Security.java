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
    private LocalDate  purchaseDate = LocalDate.now();
    private long purchasePrice;
    private long quantity;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    private Portfolio portfolio;

    public long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(long securityId) {
        this.securityId = securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
}
