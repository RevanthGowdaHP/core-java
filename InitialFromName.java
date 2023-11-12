package com.xworkz.taskone;

import java.util.Scanner;

public class InitialFromName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("'"+name+"' is the name entered");
        String nameSplit[] = name.split(" ");
        for (int i = 0; i <nameSplit.length ; i++) {
            System.out.println(nameSplit[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < nameSplit.length; j++) {
            stringBuilder.append(nameSplit[j].charAt(0));
        }
        System.out.println("Your name initials are: "+stringBuilder.toString().toUpperCase());

    }
}
