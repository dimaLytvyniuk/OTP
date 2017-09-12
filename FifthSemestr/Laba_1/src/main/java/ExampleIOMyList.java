import models.*;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dima2_000 on 11.09.2017.
 */
public class ExampleIOMyList {
    public static String fileName = "exampleList";
    public static String fileNameObjects = "exampleObjects";
    public static String fileNameTXT = "exampleTXT.txt";

    public static void ExampleWriting() {
        MyList<Electro> myList = new MyList<Electro>();

        myList.add(new Oven(true,15,380,"Arriston Grill",16,true));
        myList.add(new Refrigerator(true,43,400,"Samsung Cold",40,-20,20));
        myList.add(new Tablets(false,1,12,"Apple IPad",7,Os.IOS));
        myList.add(new TV(true,50,120,"Phillips TV",50,120));
        myList.add(new Oven(false,23,230, "Чайка Спека",12,false));
        myList.add(new Oven(true,21,250,"Samsung Hot",10,true));
        myList.add(new Refrigerator(false,120,320,"Харьков Холод",32,-10,5));
        myList.add(new Refrigerator(true,140,350,"Kenwood Freeze",28,-20,15));
        myList.add(new Tablets(false,2,18,"Samsung Tab",10,Os.Android));
        myList.add(new Tablets(false,3,20,"Microsoft Surface",11,Os.Windows));
        myList.add(new TV(false,67,200,"LG G3",82,500));
        myList.add(new TV(false,60,180,"Samsung SmartTV",32,250));

        System.out.println("Before writing in file collection:");
        myList.print();
        try {
            IOMyList.writeMyList(myList, fileName);
        }
        catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        }
        catch (IOException e) {
            System.out.println("Error writing: " + e);
        }
    }

    public static void exampleReadMyList() {
        try {
            MyList<Electro> myList = IOMyList.readMyList(fileName);
            System.out.println("\nAfter reading file:");
            myList.print();
        }
        catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        }
        catch (IOException e) {
            System.out.println("Error writing: " + e);
        }
        catch (ClassNotFoundException classNotFound) {
            System.out.println(classNotFound);
        }
    }

    public static void exampleWriteObjects() {
        MyList<Electro> myList = new MyList<Electro>();

        myList.add(new Oven(true,15,380,"Arriston Grill",16,true));
        myList.add(new Refrigerator(true,43,400,"Samsung Cold",40,-20,20));
        myList.add(new Tablets(false,1,12,"Apple IPad",7,Os.IOS));
        myList.add(new TV(true,50,120,"Phillips TV",50,120));
        myList.add(new Oven(false,23,230, "Чайка Спека",12,false));
        myList.add(new Oven(true,21,250,"Samsung Hot",10,true));
        myList.add(new Refrigerator(false,120,320,"Харьков Холод",32,-10,5));
        myList.add(new Refrigerator(true,140,350,"Kenwood Freeze",28,-20,15));
        myList.add(new Tablets(false,2,18,"Samsung Tab",10,Os.Android));
        myList.add(new Tablets(false,3,20,"Microsoft Surface",11,Os.Windows));
        myList.add(new TV(false,67,200,"LG G3",82,500));
        myList.add(new TV(false,60,180,"Samsung SmartTV",32,250));

        System.out.println("\nBefore writing in file objects from collection:");
        myList.print();
        try {
            IOMyList.writeObjectsFromList(myList, fileNameObjects);
        }
        catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        }
        catch (IOException e) {
            System.out.println("Error writing: " + e);
        }
    }

    public static void exampleReadObjectsFromFile() {
        try {
            MyList<Electro> myList = IOMyList.readObjectsFromFile(fileNameObjects);
            System.out.println("\nAfter reading file with objects:");
            myList.print();
        }
        catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        }
        catch (IOException e) {
            System.out.println("Error writing: " + e);
        }
        catch (ClassNotFoundException classNotFound) {
            System.out.println(classNotFound);
        }
    }

    public static void  exampleWriteObjectToTXT() {
        MyList<Electro> myList = new MyList<Electro>();

        myList.add(new Oven(true,15,380,"Arriston Grill",16,true));
        myList.add(new Refrigerator(true,43,400,"Samsung Cold",40,-20,20));
        myList.add(new Tablets(false,1,12,"Apple IPad",7,Os.IOS));
        myList.add(new TV(true,50,120,"Phillips TV",50,120));
        myList.add(new Oven(false,23,230, "Чайка Спека",12,false));
        myList.add(new Oven(true,21,250,"Samsung Hot",10,true));
        myList.add(new Refrigerator(false,120,320,"Харьков Холод",32,-10,5));
        myList.add(new Refrigerator(true,140,350,"Kenwood Freeze",28,-20,15));
        myList.add(new Tablets(false,2,18,"Samsung Tab",10,Os.Android));
        myList.add(new Tablets(false,3,20,"Microsoft Surface",11,Os.Windows));
        myList.add(new TV(false,67,200,"LG G3",82,500));
        myList.add(new TV(false,60,180,"Samsung SmartTV",32,250));

        System.out.println("\nBefore writing in file.txt objects from collection:");
        myList.print();
        try {
            IOMyList.writeTXTCollection(myList, fileNameTXT);
        }
        catch (IOException e) {
            System.out.println("Error writing: " + e);
        }
    }

    public static void exampleReadObjectsFromTXT() {
        try {
            MyList<Electro> myList = IOMyList.readTXTCollection(fileNameTXT);
            System.out.println("\nAfter reading file.txt with objects to collection:");
            myList.print();
        }
        catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        }
        catch (IOException e) {
            System.out.println("Error writing: " + e);
        }
    }
}
