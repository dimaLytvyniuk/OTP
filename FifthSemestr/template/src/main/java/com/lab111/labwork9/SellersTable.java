package com.lab111.labwork9;

import java.util.Arrays;

public class SellersTable {
    private Sellers[] sellers;
    int size;
    int count;

    public  SellersTable() {
        count = 0;
        size = 10;
        sellers = new Sellers[size];
    }

    public void addSeller(Sellers seller) {
        if (count == size) {
            size *= 2;
            sellers = Arrays.copyOf(sellers, size);
        }

        sellers[count] = seller;
        count++;
    }

    public Sellers getSeller(int id) {
        for (int i = 0; i < count; i++) {
            if (sellers[i].getId() == id)
                return sellers[i];
        }

        return null;
    }

    public Sellers removeSeller(int id) {
        for (int i = 0; i < count; i++) {
            if (sellers[i].getId() == id) {
                Sellers seller = sellers[i];
                for (int j = i; j < count - 1; j++)
                    sellers[j] = sellers[j + 1];
                count--;
                return seller;
            }
        }

        return null;
    }

    public Sellers[] getAll() {
        return sellers;
    }

    public Sellers getByIndex(int index) {
        if (index > - 1 && index < count)
            return sellers[index];

        return null;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < count; i++)
            str += sellers[i] + "\n";

        return str;
    }
}
