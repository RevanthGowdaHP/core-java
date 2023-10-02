package com.xworkz.brother;

public class StringReverseWithout {
    public static void main(String[] args) {
        String samosa="Chatney swalpa haaki";
        String asomas="";
        for(int chat=samosa.length()-1;chat>=0;chat--){
            asomas=asomas+samosa.charAt(chat);
        }
        System.out.println(asomas);
    }
}
