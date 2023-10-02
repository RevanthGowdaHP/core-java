package com.xworkz.bottle;

public class ReverseStringUSingStringBuffer {
    public static void main(String[] args) {
        String name="Samobda";
        StringBuffer naam = new StringBuffer(name);
        naam.reverse();
        System.out.println(naam);
    }
}
