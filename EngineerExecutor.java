package com.xworkz.engineerbro;

import com.xworkz.engineerbro.engineer.Engineer;
import com.xworkz.engineerbro.engineer.branch.EEEengineer;

public class EngineerExecutor {
    public static void main(String[] args) {
//        Engineer eng = new Engineer();
        Engineer engineer= new EEEengineer();  // up-casting
        engineer.problemSolving();

        EEEengineer eeeEngineer =(EEEengineer) engineer;// down-casting
        eeeEngineer.current();

        

    }
}
