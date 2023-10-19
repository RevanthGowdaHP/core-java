package com.xworkz.policeapp;

import com.xworkz.policeapp.officer.Officer;
import com.xworkz.policeapp.policestation.PoliceStation;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of officers to add:");
        int size = scanner.nextInt();
        PoliceStation policeStation = new PoliceStation(size);
        for (int poli = 0; poli <size ; poli++) {

            Officer officer = new Officer();

            System.out.println("Officer Name:");
            officer.setOfficerName(scanner.next());
            System.out.println("Officer age:");
            officer.setAge(scanner.nextInt());
            System.out.println("Officer gender:");
            officer.setGender(scanner.next());
            System.out.println("Officer blood Group:");
            officer.setBloodGroup(scanner.next());
            System.out.println("Officer Post name:");
            officer.setPostName(scanner.next());
            System.out.println("Officer Address:");
            officer.setAddress(scanner.next());

            policeStation.addOfficers(officer);

        }
        String condition = null;

        do {
            System.out.println(" Press 1 : To get Officers Information");
            System.out.println(" Press 2 : To get Officer Name by Post Name");
            System.out.println(" Press 3 : To get Officer information by Officer ID");
            System.out.println(" Press 4 : To get Officer Age by Officer ID");
            System.out.println(" Press 5 : To get Officer Id by Officer name");
            System.out.println(" Press 6 : To get Officer Post name by Officer ID");
            System.out.println(" Press 7 : To Update Officer Post name by Officer name");
            System.out.println(" Press 8 : To Suspend Officer by Post name ");
            System.out.println(" Press 9 : To get Officer address by ID");

            int press = scanner.nextInt();

            switch (press){
                case 1 :  System.out.println("Getting officers Information:");
                    policeStation.getOfficersInformation();
                    break;
                case 2 :   System.out.println("Enter officer Post name to get Officer name:");
                    policeStation.getOfficerNameByPostName(scanner.next());
                    break;

                case  3 :  System.out.println("Enter officer id to get the information:");
                    policeStation.getOficerInfoById(scanner.nextInt());
                    break;

                case 4:  System.out.println("Enter officer id to get officer age:");
                    policeStation.getAgeByID(scanner.nextInt());
                    break;

                case 5 :  System.out.println("Enter officer name to get officer id: ");
                    policeStation.getOfficerIdByOfficerName(scanner.next());
                    break;

                case 6:  System.out.println("Enter Officer ID to get Officer PostName:");
                    policeStation.getOfficerPostNameByOfficerId(scanner.nextInt());
                    break;

                case 7 : System.out.println("Enter the Officer name to give Officer promotion:");
                    policeStation.updatePostNameByOfficerName(scanner.next(),scanner.next());
                    break;

                case 8 : System.out.println("Enter Officer ID to suspend:");
                    policeStation.suspendOfficersByID(scanner.nextInt());
                    break;

                case 9:
                    System.out.println("Enter officer id to get Address:");
                    policeStation.getAddressByID(scanner.nextInt());

                default:
                    System.out.println(" Please Enter the Correct options ");
                    break;

            }
            System.out.println(" To continue Press : Y else Press : N");
             condition = scanner.next();


        }while(condition.equals("Y"));
        System.out.println(" Thanks for using this application .");

    }
}
