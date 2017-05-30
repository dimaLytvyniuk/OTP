package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class DataLaba {
    public void doTask() {
        Oven oven1 = new Oven(true,15,380,
                            "Arriston Grill",16,true);
        Oven oven2 = new Oven(false,23,230,
                            "Чайка Спека",12,false);
        Oven oven3 = new Oven(true,21,250,
                            "Samsung Hot",10,true);
        Oven oven4 = new Oven(false,27,210,
                            "Bosh Kit",14,false);
        Oven oven5 = new Oven(true,35,280,
                            "Bora Kat",11,true);

        Refrigerator refrigerator1 = new Refrigerator(true,43,400,
                                                    "Samsung Cold",40,-20,20);
        Refrigerator refrigerator2 = new Refrigerator(false,120,320,
                                                    "Харьков Холод",32,-10,5);
        Refrigerator refrigerator3 = new Refrigerator(true,140,350,
                                                    "Kenwood Freeze",28,-20,15);
        Refrigerator refrigerator4 = new Refrigerator(false,100,300,
                                                    "LG Flash",32,-25,7);
        Refrigerator refrigerator5 = new Refrigerator(true,120,250,
                                                    "Bora Hangscore",34,-22,10);

        Tablets tablet1 = new Tablets(false,1,12,
                                    "Apple IPad",7,Os.IOS);
        Tablets tablet2 = new Tablets(false,2,18,
                                    "Samsung Tab",10,Os.Android);
        Tablets tablet3 = new Tablets(false,3,20,
                                    "Microsoft Surface",11,Os.Windows);
        Tablets tablet4 = new Tablets(false,2,11,
                                    "Asus IdeaPad",8,Os.Linux);
        Tablets tablet5 = new Tablets(false,2,11,
                                    "Acer Aspire",8,Os.Windows);

        TV tv1 = new TV(true,50,120,
                        "Phillips TV",50,120);
        TV tv2 = new TV(false,67,200,
                        "LG G3",82,500);
        TV tv3 = new TV(false,60,180,
                        "Samsung SmartTV",32,250);
        TV tv4 = new TV(false,55,160,
                        "Sharp C",20,100);
        TV tv5 = new TV(false,50,140,
                        "Panasonic Tele",100,400);

        MyList<Electro> dev;
        ArrayList<Electro> tvs = new ArrayList<Electro>();

        tvs.add(tv1);
        tvs.add(tv2);
        tvs.add(tv3);

        System.out.println("ArrayList: ");
        for (int i = 0, len = tvs.size(); i < len; i++)
            System.out.println(tvs.get(i));

        dev = new MyList<>(tvs);

        System.out.println("ArrayList скопійований в  MyList:\n");
        dev.print();

        dev.add(refrigerator1);
        dev.add(refrigerator2);
        dev.add(refrigerator3);
        dev.add(oven1);
        dev.add(oven2);
        dev.add(oven3);
        dev.add(tablet1);
        dev.add(tablet2);
        dev.add(tablet3);

        System.out.println("\nMyList після додавання елементів:\n");
        dev.print();

        System.out.println("\nremove(Microsoft Surface) = " + dev.remove(tablet3) + "\nremove(Чайка Холод) = " + dev.remove(oven2) + "\n");
        dev.print();

        System.out.println("\nSize = " + dev.size());
        System.out.println("isEmpty = " + dev.isEmpty());
        System.out.println("contains Arriston Grill = " + dev.contains(oven1));

        Object[] electroMass =  dev.toArray();
        System.out.println("\ntoArray:\n");
        for (int i = 0, len = electroMass.length; i < len; i++)
            System.out.println((Electro) electroMass[i]);

        System.out.println("\nadd(Bosh Kit) = " + dev.add(oven4));

        System.out.println("get(100) = " + dev.get(100));
        System.out.println("get(3) = " + dev.get(3));
        System.out.println("set(3,Asus IdeaPad) = " + dev.set(3,tablet4));
        System.out.println("add(4,Sharp C)\n");
        dev.add(tv4);
        dev.print();

        System.out.println("\nremove(3) = " + dev.remove(3));
        System.out.println("IndexOf(Sharp C) = " + dev.indexOf(tv4));
        System.out.println("add(Sharp C)\n");
        dev.add(tv4);
        dev.print();
        System.out.println("\nlastIndexOf(Sharp C) = " + dev.lastIndexOf(tv4));
        System.out.println("\nsubList(1,5):\n");
        List<Electro> list = dev.subList(1,5);

        for (int i = 0,len = list.size(); i < len; i++)
           System.out.println(list.get(i));
    }
}


