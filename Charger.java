package com.xwrokz.charger;

public class Charger {

        public static void main(String[] args) {
            int num = 23419;
            int ultaNumber = reverse(num);
            System.out.println("Original number: " + num);
            System.out.println("Reversed number: " + ultaNumber);
        }
        public static int reverse(int number) {
            int renum = 0;
            while (number != 0) {
                int digit = number % 10;
                renum = renum * 10 + digit;
                number = number / 10;
            }
            return renum;
        }
    }


