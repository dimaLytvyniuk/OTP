package com.company;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Refrigerator extends CitchenDev {
    private int minTemp,
                maxTemp;

    public Refrigerator() {
        super();
        maxTemp = 0;
        minTemp = 0;
    }

    public Refrigerator(boolean sock,int rad,int cap,String name,int V,int minTemp,int maxTemp) {
        super(sock,rad,cap,name,V);
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return  minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp=minTemp;
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%15d%15d",minTemp,maxTemp);

        return str;

    }
}
