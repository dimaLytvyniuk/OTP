package com.company;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Tablets extends Devices {
    private Os os;

    public Tablets() {
        super();
        os = null;
    }

    public Tablets(boolean sock,int rad,int cap,String name,int diagonal,Os os) {
        super(sock,rad,cap,name,diagonal);
        this.os = os;
    }

    public String getOs() {
        return os.toString();
    }

    public void setOs(Os os) {
        this.os = os;
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%12s",os.toString());

        return str;

    }
}

enum Os
{
    Android,
    IOS,
    Windows,
    Linux
}