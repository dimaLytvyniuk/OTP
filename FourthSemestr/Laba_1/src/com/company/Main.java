package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        int     c2 = (5408 % 2),
                c3 = (5408 % 3),
                c5 = (5408 % 5),
                c7 = (5408 % 7);

        System.out.println("c2= " + c2 + "\nc3= " + c3
                            + "\nc7= " + c7 + "\nс5= " + c5 +"\n");

        DataLaba data = new DataLaba(c3);
        data.doTask();
    }
}

