package com.lab111.labwork9;

public class Product {
    private int id;
    private String name;
    private int price;
    private int companyID;

    public Product(int id, String name, int price, int companyID) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.companyID = companyID;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + companyID;
    }
}
