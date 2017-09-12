package com.company;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class CitchenDev extends Electro {
    private int volume;

    public CitchenDev() {
        super();
        volume = 0;
    }

    public CitchenDev(boolean sock,int rad,int cap,String name,int volume) {
        super(sock,rad,cap,name);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        String str="";
        str += super.toString();

        str += String.format("%7d", volume);

        return str;

    }
}
