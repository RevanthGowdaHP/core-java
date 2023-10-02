package com.xworkz.chapathi;

public class ReverseWords {

        public static void main(String[] args) {
            String input = "Hello Good morning";
            String output = reverseMiddleWord(input);
            System.out.println(output);
        }

        public static String reverseMiddleWord(String input) {
            // Split the input sentence into words
            String[] words = input.split(" ");

            // Check if there are at least three words in the sentence
            if (words.length < 3) {
                return input; // Cannot reverse the middle word
            }

            // Find the index of the middle word
            int middleIndex = words.length / 2;

            // Reverse the characters of the middle word
            String middleWord = words[middleIndex];
            StringBuilder ulta = new StringBuilder(middleWord).reverse();

            // Replace the middle word with the reversed one
            words[middleIndex] = ulta.toString();

            // Join the words back together with spaces
            String output = String.join(" ", words);

            return output;
        }
    }


