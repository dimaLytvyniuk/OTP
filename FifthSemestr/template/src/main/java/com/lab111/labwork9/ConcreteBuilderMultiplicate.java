package com.lab111.labwork9;

import java.util.Arrays;

public class ConcreteBuilderMultiplicate extends BuilderMultiplicate{
    /**
     * Table of ProductSellers objects
     */
    private ProductSellersTable productSellers;

    /**
     * Current ProductSellers
     */
    private ProductSellers currentProductSellers;

    public ConcreteBuilderMultiplicate() {
        productSellers = new ProductSellersTable();
    }

    /**
     * Create new ProductSeller empty object
     */
    @Override
    public void newProductSeller() {
        currentProductSellers = new ProductSellers();
    }

    /**
     * Add ProductSeller to table
     */
    @Override
    public void addProductSellerToTable() {
        productSellers.addProductSellers(currentProductSellers);
    }

    /**
     * Add product properties to ProductSeller
     * @param product value to add properties
     */
    @Override
    public void addProduct(Product product) {
        currentProductSellers.setProductId(product.getId());
        currentProductSellers.setProductName(product.getName());
        currentProductSellers.setProductPrice(product.getPrice());
    }

    /**
     * Add sellers properties to ProductSeller
     * @param sellers
     */
    @Override
    public void addSellers(Sellers sellers) {
        currentProductSellers.setSellerId(sellers.getId());
        currentProductSellers.setSellerName(sellers.getName());
    }

    /**
     * Return builded ProductSellersTable
     * @return
     */
    public ProductSellersTable getProductSellers() {
        return productSellers;
    }

    /**
     * Add company name to ProductSellers
     * @param name
     */
    @Override
    public void addCompanyName(String name) {
        currentProductSellers.setCompanyName(name);
    }
}
