package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by dima2_000 on 21.04.2017.
 */
public class DataLaba {
    int c;

    public DataLaba(int c) {
        this.c = c;
    }

    public void doTask() {
        try {
            System.out.println("Input n= ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            System.out.println("Input m= ");
            int m = scan.nextInt();

            if (n < 65536 && m < 65536 && n >= 0 && m >= 0) {
                double res = myFunc(n, m);
                System.out.println("\nsum= " + res);
            }

        } catch(InputMismatchException e) {
            System.out.println("ERROR");
            doTask();
        }
    }

    private double myFunc(int n, int m) {
        double  res=0;

        for(char i = 0; i < n; i++)
            for(char j = 0; j < m; j++)
                if((double)i + c != 0)
                    res += (double)(i + j) / ((double)i + c);

        return res;
    }
}
