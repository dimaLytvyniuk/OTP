package com.company;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Electro {
    private boolean inSocket;
    private int electroRadiation;
    private int capacity;
    private String name;

    public Electro() {
        inSocket = false;
        electroRadiation = 0;
        capacity = 0;
        name = "";
    }

    public Electro(boolean sock, int rad, int cap, String name) {
        inSocket = sock;
        electroRadiation = rad;
        capacity = cap;
        this.name = name;
    }

    public boolean getSocket() {
        return inSocket;
    }

    public void setSocket(boolean socket) {
        inSocket = socket;
    }

    public int getRadiation() {
        return electroRadiation;
    }

    public void setRadiation(int rad) {
        electroRadiation = rad;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int cap) {
        capacity = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String str = "";
        str += String.format("%18s",name);

        if (inSocket == true)
            str += String.format("%10s",true);
        else
            str += String.format("%10s",false);

        str += String.format("%15d%11d",capacity,electroRadiation);

        return str;

    }
}
