package models;

import java.io.Serializable;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public abstract class  Devices extends Electro implements Serializable {
    private int diagonal;

    public Devices(boolean sock,int rad,int cap,String name,int diagonal) {
        super(sock,rad,cap,name);
        this.diagonal = diagonal;
    }

    public Devices() {
        super();
        diagonal = 0;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String writeToFile() {
        return super.writeToFile() + String.format("%d ", diagonal);
    }

    @Override
    public String toString() {
        String str = "";
        str += super.toString();

        str += String.format("%10d",diagonal);

        return str;
    }

    @Override
    public boolean equals(Object other) {
        if (super.equals(other)) {
            Devices devices = (Devices) other;
            if (this.getDiagonal() == devices.getDiagonal()) {
                return true;
            }
        }

        return false;
    }
}
