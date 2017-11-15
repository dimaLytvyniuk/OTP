package com.lab111.labwork9;

/**
 * Director of multiplication of CompanyTable and ProductTable
 */
public class MultiplicateTables {
    /**
     * Concrete builder
     */
    private BuilderMultiplicate builder;

    /**
     * Table of companies
     */
    private CompanyTable companyTable;

    /**
     * Table of products
     */
    private ProductTable productTable;

    /**
     * Table of sellers
     */
    private SellersTable sellersTable;

    public MultiplicateTables(BuilderMultiplicate builder, CompanyTable companyTable, ProductTable productTable, SellersTable sellersTable) {
        this.builder = builder;
        this.companyTable = companyTable;
        this.productTable = productTable;
        this.sellersTable = sellersTable;
    }


    /**
     * Build multiplication table
     */
    public void buildTable() {
        int productCount = productTable.getCount();
        int sellerCount = sellersTable.getCount();

        for (int i = 0; i < productCount; i++) {
            for (int j = 0; j < sellerCount; j++) {
                builder.newProductSeller();
                Product product = productTable.getByIndex(i);
                builder.addProduct(product);
                builder.addSellers(sellersTable.getByIndex(j));
                builder.addCompanyName(companyTable.getCompany(product.getCompanyID()).getName());
                builder.addProductSellerToTable();
            }
        }
    }
}
