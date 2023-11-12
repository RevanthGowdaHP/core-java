package com.xworkz.taskone;
import java.util.Scanner;

public class PAndQCalculation {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number (n): ");
            int n = scanner.nextInt();
            int sumP = 0;
            int sumQ = 0;

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 || i % 5 == 0) {

                    sumP += i * i;


                    sumQ += i;
                }
            }

            int P = Math.abs(sumP);
            int Q = (int) Math.pow(Math.abs(sumQ),2);

            System.out.println("Sum of squares (P): " + P);
            System.out.println("Squared sum (Q): " + Q);
        }
    }


