package com.xworkz.taskone.targetinteger;

public class TargetInteger {
    int arrayInput[];
    int index;
    int count;
    public void takeSizes(int size){
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
    public void target(int tarInt){
        int first,second = 0;
        System.out.println("The target number is :"+tarInt);
        for ( first = 0; first <arrayInput.length ; first++) {
            for ( second = 1; second <arrayInput.length ; second++) {
                if (arrayInput[first]+arrayInput[second]==tarInt){
                    System.out.println("Index:"+first+" Next Index:"+second);
                }
            }
        }

    }
}
