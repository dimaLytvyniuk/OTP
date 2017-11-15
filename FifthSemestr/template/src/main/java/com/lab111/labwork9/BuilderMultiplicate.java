package com.lab111.labwork9;

/**
 * Abstract class of builder
 */
public abstract class BuilderMultiplicate {
    /**
     * Create new ProductSeller empty object
     */
    public void newProductSeller() {}

    /**
     * Add ProductSeller to table
     */
    public void addProductSellerToTable() {}

    /**
     * Add product properties to ProductSeller
     * @param product value to add properties
     */
    public void addProduct(Product product) {}

    /**
     * Add sellers properties to ProductSeller
     * @param sellers
     */
    public void addSellers(Sellers sellers) {}

    /**
     * Add company name to ProductSellers
     * @param name
     */
    public void addCompanyName(String name) {}
}
