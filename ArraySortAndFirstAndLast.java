package com.xworkz.taskone;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortAndFirstAndLast {
    static int[] numbers = new int[10];
    static int index = 0;
    static int temp;
    public void addNumber(int num){
        if (num!=0){
            numbers[index++]=num;
        }
    }
    public void fetch(){
        for (int i = 0; i <numbers.length ; i++) {
            System.out.print(numbers[i]+"  ");
        }
    }
    public void arrange(){
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {

                if(numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]= numbers[j];
                    numbers[j]= temp;
                }
            }
        }
        fetch();
        int lastIndex = numbers.length-1;
        System.out.println("\n First value:"+numbers[0]+" \n Ending value: "+ numbers[lastIndex]);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArraySortAndFirstAndLast arraySortAndFirstAndLast = new ArraySortAndFirstAndLast();
        System.out.println("Enter the numbers:");
        for (int i = 0; i <10 ; i++) {
            arraySortAndFirstAndLast.addNumber(scanner.nextInt());
        }

        arraySortAndFirstAndLast.fetch();
        System.out.println(" ");
        System.out.println("Ascending order is: "); arraySortAndFirstAndLast.arrange();




        }



        }



