package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by dima2_000 on 26.04.2017.
 */
public class DataLaba {
    long[][] A, B, C;

    public void doTask() {
        int n, m;

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input n= ");
            n = scan.nextInt();

            System.out.println("Input m= ");
            m = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR");
            doTask();
            return;
        }

        if (n > 0 && n < 1000 && m > 0 && m < 1000)
        {
            generetaMatrix(n, m);
            createC();
            printAll();
            System.out.println("\nСума найбільших елементів  = " + sumMax());
            System.out.println("\nСума найменших  елементів  = " + sumMin());
        } else {
            System.out.println("ERROR");
            doTask();
            return;
        }
    }

    private void generetaMatrix(int n, int m) {
        Random random = new Random();
        A = new long[n][m];
        B = new long[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                A[i][j] = random.nextInt(100);
                B[i][j] = random.nextInt(100);
            }
    }

    private void createC(){
        C = new long[A.length][A[0].length];

        for (int i = 0, sizei = A.length, sizej = A[0].length; i < sizei; i++)
            for (int j = 0; j < sizej; j++)
                C[i][j] = A[i][j] + B[i][j];
    }

    /*
     сума найбільших елементів в стовпцях матриці з
     непарними номерами
     */
    private long sumMax() {
        long    sum = 0,
                max;

        for(int i = 0, sizei = A.length, sizej = A[0].length; i < sizej; i+=2) {
            max = C[0][i];

            for(int j = 1; j < sizei; j++)
                if (max < C[j][i])
                    max = C[j][i];

            sum += max;
        }

        return sum;
    }

    /*
     сума найменших елементів в стовпцях матриці
     з парними номерами
     */
    private long sumMin()
    {
        long    sum = 0,
                min;

        for(int i = 1, sizei = A.length, sizej = A[0].length; i < sizej; i+=2) {
            min = C[0][i];

            for(int j = 1; j < sizei; j++)
                if (min > C[j][i])
                    min= C[j][i];

            sum+=min;

        }

        return sum;
    }

    private void printMatrix(long[][] E) {
        for (int i = 0, sizei = E.length, sizej = E[0].length; i < sizei; i++) {
            for (int j = 0; j < sizej; j++)
                System.out.format("%4d", E[i][j]);

            System.out.println();
        }
    }

    private void printAll() {
        System.out.println("\nМатриця A:\n");
        printMatrix(A);
        System.out.println("\nМатриця B:\n");
        printMatrix(B);
        System.out.println("\nМатриця C = A + B:\n");
        printMatrix(C);

    }
}
