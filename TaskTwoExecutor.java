package com.xworkz.taskone;

import com.xworkz.taskone.arrayinput.ArrayInput;
import com.xworkz.taskone.arrayrotate.ArrayRotate;

import java.util.Scanner;

public class TaskTwoExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the size of integer array :");
        int intSize = scanner.nextInt();
        ArrayRotate arrayRotate = new ArrayRotate();
        arrayRotate.takeSize(intSize);
        System.out.println("Enter integer values:");
        for (int index = 0; index <intSize ; index++) {
            arrayRotate.addIntegerValues(scanner.nextInt());
        }
        arrayRotate.getValues();
        System.out.println("Enter a number to make right shift by : ") ;
arrayRotate.rotateValues(scanner.nextInt());
    }
}
