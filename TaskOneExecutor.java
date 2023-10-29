package com.xworkz.taskone;

import com.xworkz.taskone.arrayinput.ArrayInput;

import java.util.Scanner;

public class TaskOneExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the size of integer array :");
        int intSize = scanner.nextInt();
        ArrayInput arrayInput = new ArrayInput();
        arrayInput.takeSize(intSize);
        System.out.println("Enter integer values:");
        for (int index = 0; index <intSize ; index++) {
            arrayInput.addIntegerValues(scanner.nextInt());
        }
        arrayInput.getValues();
        System.out.println("Enter the number you want to find the frequency: ");
        arrayInput.getFrequency(scanner.nextInt());
    }
}
