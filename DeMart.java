package com.xworkz.shoppingmallapp.demart;

import com.xworkz.shoppingmallapp.product.Products;

import java.util.Arrays;

public class DeMart {
    Products products[];
    int index;
    int idIndex = 1;

    public DeMart(int size) {
        products = new Products[size];
    }

    public boolean addProducts(Products product) {
        boolean isAdded = false;
        if (products != null) {
            products[index] = product;
            products[index].setId(idIndex++);
            index++;
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllProducts() {
        System.out.println("These are the details of Products:");
        for (int pro = 0; pro < products.length; pro++) {
            System.out.println(" Product ID :" + products[pro].getId() +
                    "\n Product Name :" + products[pro].getProductName() +
                    "\n Product Batch number :" + products[pro].getBatchNo() +
                    "\n Product MRP :" + products[pro].getMrp() +
                    "\n Manufactured Date :" + products[pro].getManufacturedDate() +
                    "\n Expiry Date :" + products[pro].getExpiryDate());
            System.out.println("............................................................");

        }
    }

    public void updateProductsManDateAndExpDateByBatchNo(int batchNo, String newManuDate, String newExpDate) {
        System.out.println("Update operation:");
        for (int up = 0; up < products.length; up++) {
            if (products[up].getBatchNo() == batchNo) {
                products[up].setManufacturedDate(newManuDate);
                products[up].setExpiryDate(newExpDate);
                System.out.println("New Manufactured date :" + products[up].getManufacturedDate() + " and New Expiry Date :" + products[up].getExpiryDate() + " of '" + products[up].getProductName() + "'");
                System.out.println("****************************************************************************************");
            }
        }
    }

    public void deleteProductNameByExpiryDate(int batchNo) {
        int index, newIndex;
        for (index = 0, newIndex = 0; index < products.length; index++) {
            if (products[index].getBatchNo() != batchNo) {
                products[newIndex++] = products[index];
            }
        }
        products = Arrays.copyOf(products, newIndex);
        getPresentProductsDetails(products);
    }

    public void getPresentProductsDetails(Products products[]) {
        System.out.println("Available products are:");
        for (int pro = 0; pro < products.length; pro++) {
            System.out.println(" Product ID :" + products[pro].getId() +
                    "\n Product Name :" + products[pro].getProductName() +
                    "\n Product Batch number :" + products[pro].getBatchNo() +
                    "\n Product MRP :" + products[pro].getMrp() +
                    "\n Manufactured Date :" + products[pro].getManufacturedDate() +
                    "\n Expiry Date :" + products[pro].getExpiryDate());
            System.out.println("............................................................");
        }
    }

    public String getBatchNoByProductName(String productName) {
        String du = null;
        for (int duct = 0; duct < products.length; duct++) {
            if (products[duct].getProductName().equals(productName)) {
                du = products[duct].getProductName();
                System.out.println(" '" + du + "' Batch Number is :" + products[duct].getBatchNo());
            }
        }
        return du;
    }

    public void getManDateAndExpDateByID(int id) {
        for (int duct = 0; duct < products.length; duct++) {
            if (products[duct].getId() == id) {
                System.out.println(" ID: '" + products[duct].getId() + "' Manufactured Date is :" + products[duct].getManufacturedDate() + " Expiry Date is :" + products[duct].getExpiryDate());
            }
        }
    }

    public double getMRPByProductName(String name) {
        double mrp = 0;
        for (int na = 0; na < products.length; na++) {
            if (products[na].getProductName().equals(name)) {
                mrp = products[na].getMrp();
                System.out.println(" MRP of " + products[na].getProductName() + "' is :Rs." + mrp);
            }
        }
        return mrp;
    }

    public void getNetWeightByProductName(String name) {
        for (int na = 0; na < products.length; na++) {
            if (products[na].getProductName().equals(name)) {

                System.out.println(" Net Weight of " + products[na].getProductName() + "' is :" + products[na].getNetWeight()+"grams");
            }
        }
    }

    public void getProductNameById(int id) {
        for (int duct = 0; duct < products.length; duct++) {
            if (products[duct].getId() == id) {
                System.out.println(" ID: '" + products[duct].getId() + "' of Product name:" + products[duct].getProductName());
            }
        }
    }
    public void getIDByProductName(String name){
        for (int na = 0; na < products.length; na++) {
            if (products[na].getProductName().equals(name)) {

                System.out.println(" ID of " + products[na].getProductName() + "' is :" + products[na].getId());
            }
        }
    }
}

