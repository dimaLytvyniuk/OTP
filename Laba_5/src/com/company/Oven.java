package com.company;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Oven extends CitchenDev {
    private boolean grill;

    public Oven() {
        super();
        grill = false;
    }

    public Oven(boolean sock,int rad,int cap,String name,int V,boolean grill) {
        super(sock,rad,cap,name,V);
        this.grill = grill;
    }

    public boolean getGrill() {
        return grill;
    }

    public void setGrill(boolean grill) {
        this.grill = grill;
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        if(grill == true)
            str += String.format("%7s",true);
        else
            str += String.format("%7s",false);

        return str;

    }
}
