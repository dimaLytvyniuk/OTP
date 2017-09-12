package com.company;

public class Main {

    public static void main(String[] args) {
        int c2 = 5408 % 2,
            c3 = 5408 % 3;

        System.out.println("c2 = " + c2 + "\nc3 = " + c3);

        DataLaba dataLaba = new DataLaba();
        dataLaba.doTask();
    }
}
