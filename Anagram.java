package com.xworkz.mobile;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String firstWord = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String secWord = scanner.nextLine();

        String first = firstWord.replace(" ","").replace(",","");
        String second = secWord.replace(" ","").replace(",","");

        System.out.println(first);
        System.out.println(second);
        System.out.println("...................");

        if(first.length()==second.length()){
           String firstW = first.toLowerCase();
           String secW = second.toLowerCase();
            System.out.println(firstW);
            System.out.println(secW);
            System.out.println("...................");

           char[] wordOne = firstW.toCharArray();
           char[] wordTwo = secW.toCharArray();


            Arrays.sort(wordOne);
            Arrays.sort(wordTwo);


            boolean output=Arrays.equals(wordOne,wordTwo);
            if (output == true){
                System.out.println(firstWord +" and "+secWord+" are anagram.");
            }
            else{
                System.out.println(firstWord +" and "+secWord+" are not  anagram.");
            }




        }




    }
}
