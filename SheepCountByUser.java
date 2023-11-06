package com.xworkz.mobile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SheepCountByUser {
    Boolean[] sheepHeard;
    int index;
    public void sheepSize(int size){
        sheepHeard = new Boolean[size];
    }
    public void addSheep(Boolean likee){
        if (likee!=null){
            sheepHeard[index++]=likee;
        }
    }
    public void printD(){
        for (int i = 0; i <sheepHeard.length ; i++) {
            System.out.println(sheepHeard[i]);
        }
    }
    int count = 0;
    public void sheepCount(Boolean[] seep){
        for (int sep = 0; sep <seep.length ; sep++) {
            if (seep[sep]!=null){
                if (seep[sep]==true){
                    count++;
                }
            }
        }
        System.out.println("Number of sheeps present are: "+count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the size :");
        int size = scanner.nextInt();
        SheepCountByUser likesCount = new SheepCountByUser();
        likesCount.sheepSize(size);
        System.out.println("Enter true or false:");
        for (int i = 0; i <size ; i++) {
            try{
                boolean take = scanner.nextBoolean();
                likesCount.addSheep(take);
            }catch (InputMismatchException e){
                System.out.println("Please enter true or false");
            }
        }

        likesCount.printD();
        likesCount.sheepCount(likesCount.sheepHeard);
    }
}
