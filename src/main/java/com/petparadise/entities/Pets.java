package com.petparadise.entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Pets")
public class Pets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long petId;

    private String petType;


    private String about;
    private Date dob;
    private double price;

    private int stockQty;

    private String imagePath;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="type_id")
    private Types types;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="cart_id")
//    private PetBucket PetBucket;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="order_id")
    private Orders orders;

    public Pets() {
    }

    public Pets(Long petId, String petType, String about, Date dob, double price, int stockQty, String imagePath, Types types, Orders orders) {
        this.petId = petId;
        this.petType = petType;
        this.about = about;
        this.dob = dob;
        this.price = price;
        this.stockQty = stockQty;
        this.imagePath = imagePath;
        this.types = types;
//        PetBucket = petBucket;
        this.orders = orders;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

//    public com.petparadise.entities.PetBucket getPetBucket() {
//        return PetBucket;
//    }
//
//    public void setPetBucket(com.petparadise.entities.PetBucket petBucket) {
//        PetBucket = petBucket;
//    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "petId=" + petId +
                ", petType='" + petType + '\'' +
                ", about='" + about + '\'' +
                ", dob=" + dob +
                ", price=" + price +
                ", stockQty=" + stockQty +
                ", imagePath='" + imagePath + '\'' +
                ", types=" + types +
//                ", PetBucket=" + PetBucket +
                ", orders=" + orders +
                '}';
    }

}
