package com.lab111.labwork9;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Table of ProductsSellers
 */
public class ProductSellersTable {
    private ProductSellers[] productSellers;

    /**
     * Size of ProductSellers array
     */
    int size;

    /**
     * Count of ProductSellers in array
     */
    int count;

    public  ProductSellersTable() {
        count = 0;
        size = 10;
        productSellers = new ProductSellers[size];
    }

    /**
     * Add ProductSellers to table
     * @param productSeller
     */
    public void addProductSellers(ProductSellers productSeller) {
        if (count == size) {
            size *= 2;
            productSellers = Arrays.copyOf(productSellers, size);
        }

        productSellers[count] = productSeller;
        count++;
    }

    /**
     * Get all ProductSellers with productId
     * @param productId
     * @return
     */
    public ProductSellers[] getProductSellers(int productId) {
        int productSize = 0;
        ProductSellers[] products = new ProductSellers[productSize];

        for (int i = 0; i < count; i++) {
            if (productSellers[i].getProductId() == productId) {
                products = Arrays.copyOf(products, productSize + 1);
                products[productSize] = productSellers[i];
                productSize++;
            }
        }

        return products;
    }

    /**
     * Remove all ProductSellers by productId
     * @param productId
     */
    public void removeProductSellers(int productId) {
        for (int i = 0; i < count; i++) {
            if (productSellers[i].getProductId() == productId) {
                for (int j = i; j < count - 1; j++)
                    productSellers[j] = productSellers[j + 1];
                count--;
                i--;
            }
        }
    }

    /**
     * Get all ProductSellers
     * @return
     */
    public ProductSellers[] getAll() {
        return productSellers;
    }

    /**
     * Get ProductSellers by index
     * @param index
     * @return
     */
    public ProductSellers getByIndex(int index) {
        if (index > - 1 && index < count)
            return productSellers[index];

        return null;
    }

    /**
     * Get count of companies in array
     * @return
     */
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < count; i++)
            str += productSellers[i] + "\n";

        return str;
    }
}
