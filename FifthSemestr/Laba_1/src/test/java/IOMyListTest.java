import models.*;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by dima2_000 on 12.09.2017.
 */
public class IOMyListTest {
    @Test
    public void writeMyList() throws Exception {
        MyList<Electro> myList = new MyList<Electro>();
        myList.add(new Oven(false,27,210,"Bosh Kit",14,false));
        myList.add(new Refrigerator(true,120,250,"Bora Hangscore",34,-22,10));
        myList.add(new Tablets(false,2,11,"Asus IdeaPad",8,Os.Linux));
        myList.add(new TV(false,50,140,"Panasonic Tele",100,400));

        IOMyList.writeMyList(myList, "burger");
    }

    @Test
    public void readMyList() throws Exception {
        MyList<Electro> myList = new MyList<Electro>();
        myList.add(new Oven(false,27,210,"Bosh Kit",14,false));
        myList.add(new Refrigerator(true,120,250,"Bora Hangscore",34,-22,10));
        myList.add(new Tablets(false,2,11,"Asus IdeaPad",8,Os.Linux));
        myList.add(new TV(false,50,140,"Panasonic Tele",100,400));

        MyList<Electro> myListIn = IOMyList.readMyList("burger");

        assertThat(myListIn, containsInAnyOrder(equalTo(myList.get(0)),
                                                equalTo(myList.get(1)),
                                                equalTo(myList.get(2)),
                                                equalTo(myList.get(3))));
    }

    @Test
    public void readMyListFileNotFound() throws Exception {
        MyList<Electro> myList = new MyList<Electro>();
        myList.add(new Oven(false, 27, 210, "Bosh Kit", 14, false));
        myList.add(new Refrigerator(true, 120, 250, "Bora Hangscore", 34, -22, 10));
        myList.add(new Tablets(false, 2, 11, "Asus IdeaPad", 8, Os.Linux));
        myList.add(new TV(false, 50, 140, "Panasonic Tele", 100, 400));

        MyList<Electro> myListIn = IOMyList.readMyList("nofile");
    }

    @Test
    public void writeObjectsFromList() throws Exception {
        MyList<Electro> myList = new MyList<Electro>();
        myList.add(new Oven(false,27,210,"Bosh Kit",14,false));
        myList.add(new Refrigerator(true,120,250,"Bora Hangscore",34,-22,10));
        myList.add(new Tablets(false,2,11,"Asus IdeaPad",8,Os.Linux));
        myList.add(new TV(false,50,140,"Panasonic Tele",100,400));

        IOMyList.writeObjectsFromList(myList, "bigMc");
    }

    @Test
    public void readObjectsFromFile() throws Exception {
        MyList<Electro> myList = new MyList<Electro>();
        myList.add(new Oven(false,27,210,"Bosh Kit",14,false));
        myList.add(new Refrigerator(true,120,250,"Bora Hangscore",34,-22,10));
        myList.add(new Tablets(false,2,11,"Asus IdeaPad",8,Os.Linux));
        myList.add(new TV(false,50,140,"Panasonic Tele",100,400));

        MyList<Electro> myListIn = IOMyList.readObjectsFromFile("bigMc");

        assertThat(myListIn, containsInAnyOrder(equalTo(myList.get(0)),
                equalTo(myList.get(1)),
                equalTo(myList.get(2)),
                equalTo(myList.get(3))));
    }

    @Test
    public void writeTXTCollection() throws Exception {
        MyList<Electro> myList = new MyList<Electro>();
        myList.add(new Oven(false,27,210,"Bosh Kit",14,false));
        myList.add(new Refrigerator(true,120,250,"Bora Hangscore",34,-22,10));
        myList.add(new Tablets(false,2,11,"Asus IdeaPad",8,Os.Linux));
        myList.add(new TV(false,50,140,"Panasonic Tele",100,400));

        IOMyList.writeTXTCollection(myList, "cheesburger.txt");
    }

    @Test
    public void readTXTCollection() throws Exception {
        MyList<Electro> myList = new MyList<Electro>();
        myList.add(new Oven(false,27,210,"Bosh Kit",14,false));
        myList.add(new Refrigerator(true,120,250,"Bora Hangscore",34,-22,10));
        myList.add(new Tablets(false,2,11,"Asus IdeaPad",8,Os.Linux));
        myList.add(new TV(false,50,140,"Panasonic Tele",100,400));

        MyList<Electro> myListIn = IOMyList.readTXTCollection("cheesburger.txt");

        assertThat(myListIn, containsInAnyOrder(equalTo(myList.get(0)),
                equalTo(myList.get(1)),
                equalTo(myList.get(2)),
                equalTo(myList.get(3))));
    }

    @Test
    public void readTXTCollectionIncorrect() throws Exception {
        MyList<Electro> myListIn = IOMyList.readTXTCollection("incorrect.txt");

        assertThat(myListIn, hasSize(0));
    }

}