package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by dima2_000 on 11.05.2017.
 */
public class DataLaba {
    public void doTask() {
        Oven oven1 = new Oven(true,15,380,
                              "Arriston Grill",16,true);
        Oven oven2 = new Oven(false,23,230,
                              "Чайка Спека",10,false);

        Refrigerator refrigerator1 = new Refrigerator(true,43,400,
                                                      "Samsung Cold",40,-20,20);
        Refrigerator refrigerator2 = new Refrigerator(false,120,320,
                                                    "Харьков Холод",32,-10,5);

        Tablets tablet1 = new Tablets(false,1,12,
                                      "Apple IPad",7,Os.IOS);
        Tablets tablet2 = new Tablets(false,2,18,
                                      "Samsung Tab",10,Os.Android);

        TV tv1 = new TV(true,50,120,
                        "Phillips TV",50,120);
        TV tv2 = new TV(false,67,200,
                        "LG SmartTV",82,500);

        System.out.println(String.format("%18s%10s%15s%11s%7s%7s","Ім'я","В розетці","випромінювання","потужність","Об'єм","Гриль"));
        System.out.println(oven1);
        System.out.println(oven2 + "\n");
        System.out.println(String.format("%18s%10s%15s%11s%7s%16s%17s","Ім'я","В розетці","випромінювання","потужність","Об'єм","Мін температура","Макс температура"));
        System.out.println(refrigerator1);
        System.out.println(refrigerator2 + "\n");
        System.out.println(String.format("%18s%10s%15s%11s%10s%12s","Ім'я","В розетці","випромінювання","потужність","Діагональ","ОС"));
        System.out.println(tablet1);
        System.out.println(tablet2 + "\n");
        System.out.println(String.format("%18s%10s%15s%11s%10s%12s","Ім'я","В розетці","випромінювання","потужність","Діагональ","Програми"));
        System.out.println(tv1);
        System.out.println(tv2 + "\n");

        Electro[] mass = new Electro[8];
        mass[0] = oven1;
        mass[1] = oven2;
        mass[2] = refrigerator1;
        mass[3] = refrigerator2;
        mass[4] = tablet1;
        mass[5] = tablet2;
        mass[6] = tv1;
        mass[7] = tv2;

        System.out.println("\nПрилади в мережі:\n");

        for (int i = 0, len = mass.length; i < len; i++)
            if (mass[i].getSocket())
                System.out.println(mass[i]);

        System.out.println("\nСпоживана потужність = " + sumCapacity(mass));
        sortElectro(mass);

        System.out.println("\nВідсортовані\n");

        for(int i = 0, len = mass.length; i < len; i++)
            System.out.println(mass[i]);

        searchByRadiation(mass);
    }

    private void sortElectro(Electro[] mass) {
        for (int i = 0, len = mass.length - 1; i < len; i++) {
            boolean fl  = false;

            for (int j = 0; j < len - i; j++) {
                if (mass[j].getCapacity() > mass[j + 1].getCapacity()) {
                    Electro b = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = b;
                    fl = true;
                }
            }

            if (!fl)
                break;
        }
    }

    private void searchByRadiation(Electro[] mass) {
        int     minRadiation,
                maxRadiation;

        Scanner scan=new Scanner(System.in);

        try {
            System.out.println("Input min Radiation:");
            minRadiation = scan.nextInt();
            System.out.println("Input max Radiation: ");
            maxRadiation = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR");
            searchByRadiation(mass);
            return;
        }

        System.out.println("\nYou search\n");
        boolean fl = false;

        for (int i = 0, len = mass.length; i < len; i++) {
            if (mass[i].getRadiation() >= minRadiation && mass[i].getRadiation() <= maxRadiation) {
                System.out.println(mass[i]);
                fl = true;
            }
        }

        if (!fl)
            System.out.println("\nNothing");
    }

    private int sumCapacity(Electro[] mass) {
        int sum = 0;

        for (int i = 0, len = mass.length; i < len; i++)
            if(mass[i].getSocket())
                sum += mass[i].getCapacity();

        return sum;
    }
}
