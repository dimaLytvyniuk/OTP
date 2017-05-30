package com.company;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by dima2_000 on 20.05.2017.
 */
public class MyListTest {
    private MyList<Electro> electro;

    @Before
    public void initTest() {
        electro = new MyList<>();
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

        electro.add(oven1);
        electro.add(oven2);
        electro.add(oven3);

        electro.add(refrigerator1);
        electro.add(refrigerator2);
        electro.add(refrigerator3);

        electro.add(tablet1);
        electro.add(tablet2);
        electro.add(tablet3);

        electro.add(tv1);
        electro.add(tv2);
        electro.add(tv3);
    }

    @After
    public void afterTest() {
        electro = null;
    }

    @Test
    public void testSize() throws Exception {
        electro.size();
    }

    @Test
    public void testAdd() throws Exception {
        electro.add(new Oven(false,27,210,
                            "Bosh Kit",14,false));
    }

    @Test(expected = NullPointerException.class)
    public void testAddNull() throws Exception {
        electro.add(null);
    }

    @Test
    public void testIsEmpty() {
        electro.isEmpty();
    }

    @Test
    public void testContains() {
        electro.contains(new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test(expected = NullPointerException.class)
    public void testContainsNull() {
        electro.contains(null);
    }

    @Test
    public void testtoArray() {
        Object[] mass =  electro.toArray();
    }

    @Test
    public void testRemove() {
        electro.remove(new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test(expected = NullPointerException.class)
    public void testRemoveNull() {
        electro.contains(null);
    }

    @Test
    public void testClear() {
        electro.clear();
    }

    @Test
    public void testGet() {
        electro.get(5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetMoreIndex() {
        electro.get(100);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetLessIndex() {
        electro.get(-4);
    }

    @Test
    public void testSet() {
        electro.set(2,new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test(expected = NullPointerException.class)
    public void testSetNull() {
        electro.set(2,null);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetIndex() {
        electro.set(-3,new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test
    public void testAddWithIndex() {
        electro.add(2,new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddWithIndexIncorrect() {
        electro.add(-3,new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test(expected = NullPointerException.class)
    public void testAddWithNull() {
        electro.add(3,null);
    }

    @Test
    public void testRemoveIndex() {
        electro.remove(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveWithIndexIncorrect() {
        electro.remove(-3);
    }

    @Test
    public void testIndexOf() {
        electro.indexOf(new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test(expected = NullPointerException.class)
    public void testIndexOfNull() {
        electro.indexOf(null);
    }

    @Test
    public void testLastIndexOf() {
        electro.lastIndexOf(new Oven(false,27,210,
                "Bosh Kit",14,false));
    }

    @Test(expected = NullPointerException.class)
    public void testLastIndexOfNull() {
        electro.lastIndexOf(null);
    }

    @Test
    public void testSubList() {
        electro.subList(1,4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSubListIndex() {
        electro.subList(1,1000);
    }

    @Test
    public void testPrint() {
        electro.print();
    }
}