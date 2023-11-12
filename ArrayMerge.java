package com.xworkz.taskone;

import java.util.Arrays;

public class ArrayMerge {
    int index;
     int array1[]=new int[]{1,2,3,4,5};
    int array2[]=new int[]{6,7,8,9};

 int length= array1.length+array2.length;
 int mergeArray[]=new int[length];

public void arrayAdd(int array[]){
    for (int i = 0; i <array.length ; i++) {
        mergeArray[index++]=array[i];
    }
}
public void fetchArray(){
    for (int i = 0; i <mergeArray.length ; i++) {
        System.out.print(mergeArray[i]+" ");
    }
}

    public static void main(String[] args) {
    ArrayMerge arrayMerge = new ArrayMerge();
        System.out.println("Array 1 :");
        for (int i = 0; i <arrayMerge.array1.length ; i++) {
            System.out.print(arrayMerge.array1[i]+" ");
        }
        arrayMerge.arrayAdd(arrayMerge.array1);
        System.out.println("\nArray 2 :");
        for (int i = 0; i <arrayMerge.array2.length ; i++) {
            System.out.print(arrayMerge.array2[i]+" ");
        }
        arrayMerge.arrayAdd(arrayMerge.array2);
        System.out.println("\nThe merger array is:");
        arrayMerge.fetchArray();
    }
}
