package com.xworkz.mobile;

import java.util.Scanner;

public class LikesCount {
        public static void main(String[] args) {
            String[] names1 = {};
            String[] names2 = {"Peter"};
            String[] names3 = {"Jacob", "Alex"};
            String[] names4 = {"Max", "John", "Mark"};
            String[] names5 = {"Alex", "Jacob", "Mark", "Max"};

            whoLikesIt(names1);
            whoLikesIt(names2);
            whoLikesIt(names3);
            whoLikesIt(names4);
            whoLikesIt(names5);
        }

        public static void whoLikesIt(String[] names) {
            int length = names.length;

            if (length == 0) {
                System.out.println("no one likes this");
            } else if (length == 1) {
                System.out.println( names[0] + " likes this");
            } else if (length == 2) {
                System.out.println( names[0] + " and " + names[1] + " like this");
            } else if (length == 3) {
                System.out.println( names[0] + ", " + names[1] + " and " + names[2] + " like this");
            } else {
                System.out.println( names[0] + ", " + names[1] + " and " + (length - 2) + " others like this");
            }
        }
    }

