package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima2_000 on 11.05.2017.
 */
public class DataLaba {
    Oven oven1 = new Oven(true,15,380,
            "Arriston Grill",16,true);
    Oven oven2 = new Oven(false,23,230,
            "Чайка Спека",12,false);
    Oven oven3 = new Oven(true,21,250,
            "Samsung Hot",10,true);
    Oven oven4 = new Oven(false,27,210,
            "Bosh Kit",14,false);

    Refrigerator refrigerator1 = new Refrigerator(true,43,400,
            "Samsung Cold",40,-20,20);
    Refrigerator refrigerator2 = new Refrigerator(false,120,320,
            "Харьков Холод",32,-10,5);
    Refrigerator refrigerator3 = new Refrigerator(true,140,350,
            "Kenwood Freeze",28,-20,15);
    Refrigerator refrigerator4 = new Refrigerator(false,100,300,
            "LG Flash",32,-25,7);

    Tablets tablet1 = new Tablets(false,1,12,
            "Apple IPad",7,Os.IOS);
    Tablets tablet2 = new Tablets(false,2,18,
            "Samsung Tab",10,Os.Android);
    Tablets tablet3 = new Tablets(false,3,20,
            "Microsoft Surface",11,Os.Windows);
    Tablets tablet4 = new Tablets(false,2,11,
            "Asus IdeaPad",8,Os.Linux);

    TV tv1 = new TV(true,50,120,
            "Phillips TV",50,120);
    TV tv2 = new TV(false,67,200,
            "LG G3",82,500);
    TV tv3 = new TV(false,60,180,
            "Samsung SmartTV",32,250);
    TV tv4 = new TV(false,55,160,
            "Sharp C",20,100);

    MyList<Electro> myList;

    public DataLaba() {
        myList = new MyList<Electro>();
        myList.add(refrigerator1);
        myList.add(refrigerator2);
        myList.add(refrigerator3);
        myList.add(oven1);
        myList.add(oven2);
        myList.add(oven3);
        myList.add(tablet1);
        myList.add(tablet2);
        myList.add(tablet3);
    }
}


