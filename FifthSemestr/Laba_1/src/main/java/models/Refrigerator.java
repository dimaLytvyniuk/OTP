package models;

import java.io.Serializable;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class Refrigerator extends CitchenDev implements Serializable {
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
        this.maxTemp= maxTemp;
    }

    public static Electro readFromFile(String[] object) {
        if (object.length != 9)
            return null;

        Refrigerator refrigerator = new Refrigerator();
        try {
            refrigerator.setName(object[2].replace('_',' '));
            refrigerator.setSocket(Boolean.valueOf(object[3]));
            refrigerator.setRadiation(Integer.parseInt(object[4]));
            refrigerator.setCapacity(Integer.parseInt(object[5]));
            refrigerator.setVolume(Integer.parseInt(object[6]));
            refrigerator.setMinTemp(Integer.parseInt(object[7]));
            refrigerator.setMaxTemp(Integer.parseInt(object[8]));
        }
        catch (Exception e) {
            return null;
        }

        return refrigerator;
    }

    @Override
    public String writeToFile() {
        return super.writeToFile() + String.format("%d %d", minTemp, maxTemp);
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%15d%15d",minTemp,maxTemp);

        return str;
    }

    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            Refrigerator refrigerator = (Refrigerator) other;
            if (this.getMaxTemp() == refrigerator.getMaxTemp() && this.getMinTemp() == refrigerator.getMinTemp()) {
                return true;
            }
        }

        return false;
    }
}
