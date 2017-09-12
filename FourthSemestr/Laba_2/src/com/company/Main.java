package com.company;



public class Main {

    public static void main(String[] args) {
        int     c11=(5408 % 11),
                c5=(5408 % 5),
                c7=(5408 % 7),
                n =0,
                m = 0;

        System.out.println("c11 = " + c11 + "\nc5 = " + c5 + "\nc7 = " + c7);

        DataLaba dataLaba = new DataLaba();
        dataLaba.doTask();

    }
}
