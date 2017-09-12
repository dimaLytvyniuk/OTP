import models.*;

import java.io.*;

/**
 * Created by dima2_000 on 11.09.2017.
 */
public class IOMyList {
    public static void writeMyList(MyList<Electro> myList, String fileName)
            throws IOException {

        try {
            ObjectOutputStream objStream = new ObjectOutputStream(new FileOutputStream(fileName));
            objStream.writeObject(myList);
            objStream.close();
        }
        catch (FileNotFoundException fileException) {
            throw new FileNotFoundException(fileException.getMessage());
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static MyList<Electro> readMyList(String fileName)
            throws ClassNotFoundException, IOException {

        MyList<Electro> myList = null;
        try {
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(fileName));
            myList = (MyList<Electro>)objStream.readObject();
            objStream.close();
        }
        catch (FileNotFoundException fileException) {
            System.out.println(fileException);
        }
        catch (ClassNotFoundException classNotFound) {
            throw new ClassNotFoundException(classNotFound.getMessage());
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        return myList;
    }

    public static void writeObjectsFromList(MyList<Electro> myList, String fileName) throws IOException {
        try {
            ObjectOutputStream objStream = new ObjectOutputStream(new FileOutputStream(fileName));
            for (int i = 0; i < myList.size(); i++)
                objStream.writeObject(myList.get(i));
            objStream.writeObject(null);
            objStream.close();
        }
        catch (FileNotFoundException fileException) {
            throw new FileNotFoundException(fileException.getMessage());
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }

    }

    public static MyList<Electro> readObjectsFromFile(String fileName)
        throws ClassNotFoundException, IOException {

        MyList<Electro> myList = new MyList<Electro>();
        try {
            ObjectInputStream objStream = new ObjectInputStream(new FileInputStream(fileName));
            Object object = objStream.readObject();

            while(object != null) {
                myList.add((Electro) object);
                object = objStream.readObject();
            }

            objStream.close();
        }
        catch (FileNotFoundException fileException) {
            throw new FileNotFoundException(fileException.getMessage());
        }
        catch (ClassNotFoundException classNotFound) {
            throw new ClassNotFoundException(classNotFound.getMessage());
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        return myList;
    }

    public static void writeTXTCollection(MyList<Electro> myList, String fileName) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < myList.size(); i++) {
                writer.write(myList.get(i).writeToFile());
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static MyList<Electro> readTXTCollection(String fileName) throws IOException {
        MyList<Electro> myList = new MyList<Electro>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String str = reader.readLine();
            while (str != null) {
                Electro electro = null;
                String[] mass = str.split(" ");
                if (mass[1].equals("models.Oven")) {
                    electro = Oven.readFromFile(mass);
                } else if (mass[1].equals("models.Refrigerator")) {
                    electro = Refrigerator.readFromFile(mass);
                } else if (mass[1].equals("models.Tablets")) {
                    electro = Tablets.readFromFile(mass);
                } else if (mass[1].equals("models.TV")) {
                    electro = TV.readFromFile(mass);
                }
                if (electro != null)
                    myList.add(electro);

                str = reader.readLine();
            }

            reader.close();
        }
        catch (FileNotFoundException fileException) {
            throw new FileNotFoundException(fileException.getMessage());
        }
        catch (IOException e) {
            throw new IOException(e.getMessage());
        }
        return myList;
    }


}
