package com.company;

import java.util.ArrayList;

/**
 * Created by dima2_000 on 08.05.2017.
 */
public class Sentences {
    private ArrayList<PartSenteces> value;

    void addPart(PartSenteces s)
    {
        value.add(s);
    }

    Sentences() {
        value = new ArrayList<PartSenteces>();
    }

    public ArrayList<Word> getWords() {
        ArrayList<Word> output = new ArrayList<Word>();

        for (int i = 0, len = value.size(); i < len; i++) {
            if (value.get(i).getClass() == Word.class)
                output.add((Word) value.get(i));
        }

        return output;
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
