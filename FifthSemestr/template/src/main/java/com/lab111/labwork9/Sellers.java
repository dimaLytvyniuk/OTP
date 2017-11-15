package com.lab111.labwork9;

public class Sellers {
    private int id;
    private String name;


    public Sellers(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return id + " " + name;
    }
}
