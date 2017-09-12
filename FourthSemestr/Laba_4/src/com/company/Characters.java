package com.company;

import java.util.ArrayList;

/**
 * Created by dima2_000 on 08.05.2017.
 */
public class Characters  implements PartSenteces {
    protected Alpha value;

    public Alpha getValue() {
        return value;
    }

    public void addValue(Alpha s) {
        value = s;
    }

    public Characters(Alpha s) {
        value = s;
    }

    public Characters() {

    }

    public boolean getType() {
        return false;
    }

    public ArrayList<Alpha> getPart(){
        return null;
    }

    @Override
    public String toString()
    {
        String str="" + value;
        return str;
    }


}
