package com.lab111.labwork9;

public class ProductSellers {
    private int productId;
    private String productName;
    private int productPrice;
    private String companyName;
    private int sellerId;
    private String sellerName;

    public ProductSellers() {
    }

    private ProductSellers(int productId, String productName, String companyName, int sellerId, String sellerName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.companyName = companyName;
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return productId + " " + productName + " " + productPrice + " " + companyName + " " + sellerId + " " + sellerName;
    }
}
