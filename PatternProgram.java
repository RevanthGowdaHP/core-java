package com.xworkz.laptop;

public class PatternProgram {
    public static void main(String[] args) {
        pattern(3);
    }
        public static void pattern(int value){
        //              1<=3
        for(int row=1; row<=value; row++){
            //              1>=1
            for(int col=1; row>=col;col++){
                           // 2>=2
                if(row==2 && col==2) {
                    System.out.print("%");
                }
                else
                    System.out.print("&");
                }
            System.out.println(" ");
        }

    }
}

