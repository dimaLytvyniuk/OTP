package com.company;

import java.util.ArrayList;

/**
 * Created by dima2_000 on 08.05.2017.
 */
public class Word implements PartSenteces{
    private ArrayList<Alpha> value;

    Word() {
        value = new ArrayList<Alpha>();
    }

    public void addValue(Alpha s)
    {
        value.add(s);
    }

    public boolean getType() {
        return true;
    }

    public ArrayList<Alpha> getPart() {
        return value;
    }


    @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;

            Word other = (Word) obj;

        ArrayList<Alpha> objList = other.getPart();

        int i = 0,
            len1 = value.size(),
            len2 = objList.size();

        if (len1 != len2)
            return false;

        while (i < len1 && i < len2) {
            if (!value.get(i).equals(objList.get(i)))
                return false;

            i++;
        }

        return true;
    }

    @Override
    public String toString()
    {
        String str = "";

        for (int i = 0, len = value.size(); i < len; i++)
            str += value.get(i);

        return str;
    }
}
