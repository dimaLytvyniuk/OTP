package models;

import java.io.Serializable;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public abstract class CitchenDev extends Electro implements Serializable {
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
    public String writeToFile() {
        return super.writeToFile() + String.format("%d ", volume);
    }

    @Override
    public String toString() {
        String str="";
        str += super.toString();

        str += String.format("%7d", volume);

        return str;
    }

    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            CitchenDev citchenDev = (CitchenDev) other;
            if (this.getVolume() == citchenDev.getVolume()) {
                return true;
            }
        }

        return false;
    }
}
