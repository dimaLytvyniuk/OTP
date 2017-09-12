package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by dima2_000 on 08.05.2017.
 */
public class DataLaba {
    public void doTask() {
        String input;
        Text text;
        ArrayList<Word> firstSentences;
        ArrayList<Word> anotherWords;
        ArrayList<Sentences> sentences;
        Word result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");

        try {
            input = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("ERROR");
            doTask();
            return;
        }

        text = createText(input);

        sentences = text.getSentences();
        firstSentences = sentences.get(0).getWords();
        anotherWords = new ArrayList<Word>();

        for (int i = 1, leni = sentences.size(); i < leni; i++)
            anotherWords.addAll(sentences.get(i).getWords());

        result = makeSense(anotherWords, firstSentences);

        if (result == null)
            System.out.println("\nСлово, яке зустрічається тільки в першому реченні: такого немає");
        else
            System.out.println("\nСлово, яке зустрічається тільки в першому реченні: " + result);


    }

    public Text createText(String input) {
        Text text = new Text();

        char arr[] = input.toCharArray();

        Word word = new Word();
        Characters character = new Characters();
        Alpha alpha = new Alpha();
        Sentences sentences = new Sentences();

        for (int i = 0, len = arr.length; i < len; i++) {
            if (Character.isLetterOrDigit(arr[i])) {
                word.addValue(new Alpha(arr[i]));
            } else if (arr[i] == '.' || arr[i] == '!' || arr[i] == '?') {
                sentences.addPart(word);
                sentences.addPart(new Characters(new Alpha(arr[i])));
                text.addSentences(sentences);

                sentences = new Sentences();
                word = new Word();
            } else  if (arr[i] == ' ' && i > 0) {
                if (arr[i - 1] != ' ') {
                    sentences.addPart(word);
                    sentences.addPart(new Characters(new Alpha(arr[i])));

                    character = new Characters();
                    word = new Word();
                }
            } else if ((!Character.isLetterOrDigit(arr[i])) && (arr[i] != '.') && (arr[i] != '!') && (arr[i] != '?')) {
                sentences.addPart(word);
                sentences.addPart(new Characters(new Alpha(arr[i])));

                character = new Characters();
                word = new Word();
            }
        }

        return text;
    }

    private Word makeSense(ArrayList<Word> words, ArrayList<Word> firstSentence) {
        boolean[] fl = new boolean[firstSentence.size()];

        for (int i = 0, len = fl.length; i < len; i++)
            fl[i] = true;


        for (int j = 0, lenj = firstSentence.size(); j < lenj; j++)
            if (fl[j] == true)
                for (int l = 0, lenl = words.size(); l < lenl; l++)
                    if (firstSentence.get(j).equals(words.get(l)))
                        fl[j] = false;

        for(int i=0,len = firstSentence.size(); i < len; i++)
            if(fl[i] == true)
                return firstSentence.get(i);

        return null;
    }
}
