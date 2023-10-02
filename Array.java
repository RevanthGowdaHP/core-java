package com.xworkz.mobile;

public class Array {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9};
        int count=0;
        int count1=0;
        for(int so=0;so<num.length; so++) System.out.println(num[so]);
        System.out.println("Reverse of the number array");
        for(int yo= num.length-1;yo>=0 ; yo--){
            System.out.println(num[yo]);
        }

        for(int no=0;no<num.length; no++)
            if (num[no] % 2 != 0) {
                System.out.println("Odd numbers:" + num[no]);
                count1++;
            } else {
                System.out.println("Even numbers:" + num[no]);
                count++;
            }
        System.out.println("number of even numbers: "+count);
        System.out.println("number of Odd numbers: "+count1);
    }
}
