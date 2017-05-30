package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by dima2_000 on 27.04.2017.
 */
public class DataLaba {
    public void doTask() {
        String input, result;
        String[]    firstSentence,
                    words;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");

        try {
            input = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("ERROR");
            doTask();
            return;
        }

        words = input.split("\\.");

        if (words.length < 2) {
            System.out.println("Не коректні вхідні дані");
            doTask();
            return;
        }

        firstSentence = words[0].split(" ");

        if (firstSentence.length < 1)
        {
            System.out.println("Не коректні вхідні дані");
            doTask();
            return;
        }

        result = makeSense(words,firstSentence);

        if (result.isEmpty())
            System.out.println("\nСлово, яке зустрічається тільки в першому реченні: такого немає");
        else
            System.out.println("\nСлово, яке зустрічається тільки в першому реченні: " + result);
    }

    private String makeSense(String[] words, String[] firstSentence) {
        String[] prom;
        boolean[] fl = new boolean[firstSentence.length];

        for (int i = 0, len = fl.length; i < len; i++)
            fl[i] = true;

        for (int i = 1, len = words.length; i < len; i++) {
            prom = words[i].split(" ");

            for (int j = 0, lenj= firstSentence.length; j < lenj; j++)
                if (fl[j] == true)
                    for (int l = 0, lenl = prom.length; l < lenl; l++)
                        if (firstSentence[j].compareToIgnoreCase(prom[l]) == 0)
                            fl[j] = false;

        }

        for(int i=0,len = firstSentence.length; i < len; i++)
            if(fl[i] == true)
                return firstSentence[i];

        return "";
    }
}
