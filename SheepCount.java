package com.xworkz.mobile;

import java.util.Scanner;

public class SheepCount {
    public static void main(String arg[]){
     Boolean[] sheepS= {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true};
     SheepCount sheepCount = new SheepCount();
     sheepCount.sheepCount(sheepS);

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
}
