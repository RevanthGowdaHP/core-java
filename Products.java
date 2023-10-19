package com.xworkz.shoppingmallapp.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Products {
    private int id;
    private String productName;
    private String manufacturedDate;
    private String expiryDate;
    private int netWeight;
    private double mrp;
    private int batchNo;

    public Products(){

    }
}
