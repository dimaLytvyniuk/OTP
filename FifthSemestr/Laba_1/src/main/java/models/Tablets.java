package models;

import java.io.Serializable;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Tablets extends Devices implements Serializable {
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

    public static Electro readFromFile(String[] object) {
        if (object.length != 8)
            return null;

        Tablets tablets = new Tablets();
        try {
            tablets.setName(object[2].replace('_',' '));
            tablets.setSocket(Boolean.valueOf(object[3]));
            tablets.setRadiation(Integer.parseInt(object[4]));
            tablets.setCapacity(Integer.parseInt(object[5]));
            tablets.setDiagonal(Integer.parseInt(object[6]));
            tablets.setOs(Os.valueOf(object[7]));
        }
        catch (Exception e) {
            return null;
        }

        return tablets;
    }

    @Override
    public String writeToFile() {
        return super.writeToFile() + String.format("%s", os);
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%12s",os.toString());

        return str;
    }

    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            Tablets tablets = (Tablets) other;
            if (this.getOs().equals(tablets.getOs())) {
                return true;
            }
        }

        return false;
    }
}