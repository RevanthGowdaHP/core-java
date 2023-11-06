package com.xworkz.taskone.pascals;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        int noOfRows, c=1, row , col , space;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of rows to print:");
        noOfRows = input.nextInt();
        for (row=0;row<noOfRows;row++){
            for (space=0;space<noOfRows-row;space++) {
                System.out.print(" ");
            }

                for (col=0;col<=row;col++){
                    if(col==0 || row==0){
                        c=1;
                    }else{
                        c=c*(row-col+1)/col;
                    }
                    System.out.print(" "+c);
                }
                System.out.print("\n");

        }

    }
}
//    int no_row,c=1,blk,i,j;
//        System.out.print("Input number of rows: ");
//                Scanner in = new Scanner(System.in);
//                no_row = in.nextInt();
//                for(i=0;i<no_row;i++)
//        {
//        for(blk=1;blk<=no_row-i;blk++)
//        System.out.print(" ");
//        for(j=0;j<=i;j++)
//        {
//        if (j==0||i==0)
//        c=1;
//        else
//        c=c*(i-j+1)/j;
//        System.out.print(" "+c);
//        }
//        System.out.print("\n");
//        }