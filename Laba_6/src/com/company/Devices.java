package com.company;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Devices extends Electro {
    private int diagonal;

    public Devices(boolean sock,int rad,int cap,String name,int diagonal) {
        super(sock,rad,cap,name);
        this.diagonal = diagonal;
    }

    public Devices() {
        super();
        diagonal = 0;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%10d",diagonal);

        return str;
    }
}
