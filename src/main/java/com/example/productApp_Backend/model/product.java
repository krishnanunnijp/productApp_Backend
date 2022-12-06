package com.example.productApp_Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class product {
    @Id
    @GeneratedValue()
    private int Id;
    private String productName;
    private String man_date;
    private String exp_date;
    private String brand;
    private double price;
    private String seller_name;
    private String distributer_name;

    public product() {
    }

    public product(int id, String productName, String man_date, String exp_date, String brand, double price, String seller_name, String distributer_name) {
        Id = id;
        this.productName = productName;
        this.man_date = man_date;
        this.exp_date = exp_date;
        this.brand = brand;
        this.price = price;
        this.seller_name = seller_name;
        this.distributer_name = distributer_name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMan_date() {
        return man_date;
    }

    public void setMan_date(String man_date) {
        this.man_date = man_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getDistributer_name() {
        return distributer_name;
    }

    public void setDistributer_name(String distributer_name) {
        this.distributer_name = distributer_name;
    }
}
