package com.lab111.labwork9;

import java.util.Arrays;

/**
 * Table of products
 */
public class ProductTable {
    private Product[] products;

    /**
     * Size of products array
     */
    int size;

    /**
     * Count of products in array
     */
    int count;

    public  ProductTable() {
        count = 0;
        size = 10;
        products = new Product[size];
    }

    /**
     * Add product to table
     * @param product
     */
    public void addProduct(Product product) {
        if (count == size) {
            size *= 2;
            products = Arrays.copyOf(products, size);
        }

        products[count] = product;
        count++;
    }

    /**
     * Get Product by id
     * @param id
     * @return
     */
    public Product getProduct(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id)
                return products[i];
        }

        return null;
    }

    /**
     * Remove product by id
     * @param id
     * @return
     */
    public Product removeProduct(int id) {
        for (int i = 0; i < count; i++) {
            if (products[i].getId() == id) {
                Product Product = products[i];
                for (int j = i; j < count - 1; j++)
                    products[j] = products[j + 1];
                count--;
                return Product;
            }
        }

        return null;
    }

    /**
     * Get all products
     * @return
     */
    public Product[] getAll() {
        return products;
    }

    public Product getByIndex(int index) {
        if (index > - 1 && index < count)
            return products[index];

        return null;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < count; i++)
            str += products[i] + "\n";

        return str;
    }
}
