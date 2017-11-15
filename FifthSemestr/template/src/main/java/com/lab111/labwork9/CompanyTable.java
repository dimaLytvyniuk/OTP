package com.lab111.labwork9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/**
 * Table of companies
 */
public class CompanyTable {
    private Company[] companies;

    /**
     * Size of companies array
     */
    private int size;

    /**
     * Count of companies in array
     */
    private int count;

    public  CompanyTable() {
        count = 0;
        size = 10;
        companies = new Company[size];
    }

    /**
     * Add company to table
     * @param company
     */
    public void addCompany(Company company) {
        if (count == size) {
            size *= 2;
            companies = Arrays.copyOf(companies, size);
        }

        companies[count] = company;
        count++;
    }

    /**
     * Get Company by id
     * @param id
     * @return
     */
    public Company getCompany(int id) {
        for (int i = 0; i < count; i++) {
            if (companies[i].getId() == id)
                return companies[i];
        }

        return null;
    }

    /**
     * Remove company by id
     * @param id
     * @return
     */
    public Company removeCompany(int id) {
        for (int i = 0; i < count; i++) {
            if (companies[i].getId() == id) {
                Company company = companies[i];
                for (int j = i; j < count - 1; j++)
                    companies[j] = companies[j + 1];
                count--;
                return company;
            }
        }

        return null;
    }

    /**
     * Get all companies
     * @return all companies
     */
    public Company[] getAll() {
        return companies;
    }

    /**
     * Get count of companies in array
     * @return
     */
    public int getCount() {
        return count;
    }

    public Company getByIndex(int index) {
        if (index > - 1 && index < count)
            return companies[index];

        return null;
    }

    @Override
    public String toString() {
        String str = new String();
        for (int i = 0; i < count; i++)
            str += companies[i] + "\n";

        return str;
    }
}
