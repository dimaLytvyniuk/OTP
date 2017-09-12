package models;

import java.io.Serializable;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Oven extends CitchenDev implements Serializable {
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

    public static Electro readFromFile(String[] object) {
        if (object.length != 8)
            return null;

        Oven oven = new Oven();
        try {
            oven.setName(object[2].replace('_',' '));
            oven.setSocket(Boolean.valueOf(object[3]));
            oven.setRadiation(Integer.parseInt(object[4]));
            oven.setCapacity(Integer.parseInt(object[5]));
            oven.setVolume(Integer.parseInt(object[6]));
            oven.setGrill(Boolean.getBoolean(object[7]));
        }
        catch (Exception e) {
            return null;
        }

        return oven;
    }

    @Override
    public String writeToFile() {
        return super.writeToFile() + String.format("%b", grill);
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

    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            Oven oven = (Oven) other;
            if (this.getGrill() == oven.getGrill()) {
                return true;
            }
        }

        return false;
    }
}
