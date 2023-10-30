package com.xworkz.taskone;

import com.xworkz.taskone.arrayinput.ArrayInput;
import com.xworkz.taskone.targetinteger.TargetInteger;

import java.util.Scanner;

public class TaskThreeExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the size of integer array :");
        int intSizes = scanner.nextInt();
       TargetInteger arrayI = new TargetInteger();
        arrayI.takeSizes(intSizes);
        System.out.println("Enter integer values:");
        for (int index = 0; index <intSizes ; index++) {
            arrayI.addIntegerValues(scanner.nextInt());
        }
        arrayI.getValues();
        System.out.println("Enter the target value:");
        arrayI.target(scanner.nextInt());
    }


}
