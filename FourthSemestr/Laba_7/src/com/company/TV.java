package com.company;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class TV extends Devices {
    private int programs;

    public TV() {
        super();
        programs = 0;
    }

    public TV(boolean sock,int rad,int cap,String name,int diagonal,int programs) {
        super(sock,rad,cap,name,diagonal);
        this.programs = programs;
    }

    public int getPrograms() {
        return programs;
    }

    public void setPrograms(int programs) {
        this.programs = programs;
    }


    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%12d", programs);

        return str;
    }
}
