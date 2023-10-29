package com.xworkz.taskone.arrayrotate;

import java.util.Arrays;

public class ArrayRotate {
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
    public void rotateValues(int rotateBy){
        //      ide = 4 ; 4 >= 2 ;
        for(int ide=0; ide<rotateBy; ide++){
          int last=arrayInput[arrayInput.length-1];

            for (int idex=arrayInput.length-1; idex>0; idex--) {
                arrayInput[idex] = arrayInput[idex-1];
            }
            arrayInput[0]=last;
        }
        System.out.println(" The number after shift ");
        for (int index = 0; index <arrayInput.length ; index++) {
            System.out.println(arrayInput[index]);
        }
    }
}
