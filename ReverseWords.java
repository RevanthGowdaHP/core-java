package com.xworkz.chapathi;

public class ReverseWords {

        public static void main(String[] args) {
            String input = "Hello Good morning";
            String output = reverseMiddleWord(input);
            System.out.println(output);
        }

        public static String reverseMiddleWord(String input) {
            String[] words = input.split(" ");
            if (words.length < 3) {
                return input; 
            }
            int middleIndex = words.length / 2;

            String middleWord = words[middleIndex];
            StringBuilder ulta = new StringBuilder(middleWord).reverse();
            words[middleIndex] = ulta.toString();
            String output = String.join(" ", words);

            return output;
        }
    }


