package models;

import java.io.Serializable;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class TV extends Devices implements Serializable {
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

    public static Electro readFromFile(String[] object) {
        if (object.length != 8)
            return null;

        TV tv = new TV();
        try {
            tv.setName(object[2].replace('_',' '));
            tv.setSocket(Boolean.valueOf(object[3]));
            tv.setRadiation(Integer.parseInt(object[4]));
            tv.setCapacity(Integer.parseInt(object[5]));
            tv.setDiagonal(Integer.parseInt(object[6]));
            tv.setPrograms(Integer.parseInt(object[7]));
        }
        catch (Exception e) {
            return null;
        }

        return tv;
    }

    @Override
    public String writeToFile() {
        return super.writeToFile() + String.format("%d", programs);
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%12d", programs);

        return str;
    }

    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            TV tv = (TV) other;
            if (this.getPrograms() == tv.getPrograms()) {
                return true;
            }
        }
        return false;
    }
}
