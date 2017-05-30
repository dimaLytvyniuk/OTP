package com.company;

/**
 * Created by dima2_000 on 08.05.2017.
 */
public class Alpha {
    protected char value;

    public void setValue(char s) {
        value = s;
    }

    public char getValue() {
        return value;
    }

    public Alpha(char s) {
        value = s;
    }

    public Alpha() {

    }

    @Override
    public String toString()
    {
        String str="" + value;
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Alpha other = (Alpha) obj;

        if (Character.toLowerCase(value) != Character.toLowerCase(other.getValue()))
            return false;

        return true;
    }
}
