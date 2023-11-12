package com.xworkz.taskone;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to check Palindrome:");
        String word = scanner.nextLine();
        System.out.println("Entered word :"+word);
        StringBuilder stringBuilder = new StringBuilder(word).reverse();
        String reverseWord = stringBuilder.toString();
        System.out.println("Reversed : "+reverseWord);
       if(reverseWord.equals(word)){
           System.out.println("Entered word is palindrome");
       } else {
           System.out.println("Entered word is not palindrome");
       }
       Palindrome palindrome = new Palindrome();
       palindrome.palindromeCheck("sas");

    }

    public void palindromeCheck(String str){
        String reverse= "";
        System.out.println("Entered word:"+str);
        for (int i = str.length()-1; i >=0 ; i--) {
           reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        if(str.equals(reverse)){
            System.out.println("Entered word is palindrome");
        } else {
            System.out.println("Entered word is not palindrome");
        }
    }
}
