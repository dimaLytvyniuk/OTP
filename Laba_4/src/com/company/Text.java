package com.company;

import java.util.ArrayList;

/**
 * Created by dima2_000 on 08.05.2017.
 */
public class Text {
    ArrayList<Sentences> value = new ArrayList<Sentences>();

    Text() {
        value = new ArrayList<Sentences>();
    }
    public void addSentences(Sentences s)
    {
        value.add(s);
        s.getWords();
    }

    public ArrayList<Sentences> getSentences() {
        return value;
    }

    @Override
    public String toString()
    {
        String str = "";

        for(int i = 0, len = value.size(); i < len; i++)
            str += value.get(i);

        return str;
    }
}
