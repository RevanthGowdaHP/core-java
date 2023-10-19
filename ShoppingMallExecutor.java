package com.xworkz.shoppingmallapp;

import com.xworkz.shoppingmallapp.demart.DeMart;
import com.xworkz.shoppingmallapp.product.Products;

import java.util.Scanner;


public class ShoppingMallExecutor {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of products you want :");
        int size=scanner.nextInt();
     DeMart deMart = new DeMart(size);

        for (int mart = 0; mart <size ; mart++) {
            Products products = new Products();
            System.out.println("Enter Product Name:");
            products.setProductName(scanner.next());
            System.out.println("Enter MRP of Product:");
            products.setMrp(scanner.nextDouble());
            System.out.println("Enter Batch no:");
            products.setBatchNo(scanner.nextInt());
            System.out.println("Enter Net Weight:");
            products.setNetWeight(scanner.nextInt());
            System.out.println("Enter Manufactured Date:");
            products.setManufacturedDate(scanner.next());
            System.out.println("Enter Expiry Date:");
            products.setExpiryDate(scanner.next());
            deMart.addProducts(products);
        }
        String yes= null;
        do {
            System.out.println(" Press 1: To get all Products");
            System.out.println(" Press 2: To update ManuDate and ExpDate");
            System.out.println(" Press 3: To delete Product");
            System.out.println(" Press 4: To Get MRP of Product");
            System.out.println(" Press 5: To get ManuDate and ExpDate by Id");
            System.out.println(" Press 6: To get Batch number by Product name");
            System.out.println(" Press 7: To get NetWeight of a product");
            System.out.println(" Press 8: To get Product name by id");
            System.out.println(" Press 9: To get Id by Product name");
            int press = scanner.nextInt();

            switch (press){
                case 1:
                    deMart.getAllProducts();
                    break;

                case 2:
                    System.out.println("Enter Batch number and newManuDate and newExpDate");
                    deMart.updateProductsManDateAndExpDateByBatchNo(scanner.nextInt(),scanner.next(),scanner.next());
                    break;

                case 3:
                    System.out.println("Enter Batch number to delete product");
                    deMart.deleteProductNameByExpiryDate(scanner.nextInt());
                    break;

                case 4:
                    System.out.println("Enter Product name to get MRP");
                    deMart.getMRPByProductName(scanner.next());
                    break;

                case 5:
                    System.out.println("Enter Id to get ManuDate and ExpDate");
                    deMart.getManDateAndExpDateByID(scanner.nextInt());
                    break;

                case 6:
                    System.out.println("Enter product name to get batch no");
                    deMart.getBatchNoByProductName(scanner.next());
                    break;

                case 7:
                    System.out.println("Enter product name to get net weight");
                    deMart.getNetWeightByProductName(scanner.next());
                    break;

                case  8:
                    System.out.println("Enter id to get product name");
                    deMart.getProductNameById(scanner.nextInt());
                    break;

                case 9:
                    System.out.println("Enter Product name to get id");
                    deMart.getIDByProductName(scanner.next());
                    break;

                default:
                    System.out.println("Please enter valid number");
            }

            System.out.println("To continue Press: Y else Press: N ");
            yes=scanner.next();

        }while (yes.equals("Y"));
        System.out.println(" Thanks for visiting");
    }
}
