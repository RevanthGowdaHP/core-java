package com.xworkz.taskone.arrayinput;

public class ArrayInput {
   int arrayInput[];
int index;
int count;
    public void takeSize(int size){
    arrayInput = new int[size];

    }

    public void addIntegerValues(int num){
        if(num!= 0){
            arrayInput[index++]= num;
        }
    }
    public void getValues(){
        System.out.println(" The number are ");
        for (int index = 0; index <arrayInput.length ; index++) {
            System.out.println(arrayInput[index]);
        }
    }

    public void getFrequency(int number){
        for (int fre = 0; fre <arrayInput.length ; fre++) {
            if (arrayInput[fre]== number){
                count++;
            }
        }
        System.out.println(" The number '"+number+"' frequency is :"+count);
    }
}
