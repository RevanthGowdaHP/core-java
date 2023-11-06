package com.xworkz.playstore;

import com.xworkz.playstore.details.Details;
import com.xworkz.playstore.software.hub.SoftwareHub;
import com.xworkz.playstore.software.hub.impl.PlayStore;


import java.util.Scanner;

public class ApplicationExecutor {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of games to be added: ");
        int size=sc.nextInt();
        System.out.println("---------------------------------------");
        PlayStore play= new PlayStore(size);



        for (int num=0;num<size;num++){
            Details application=new Details();

//            System.out.println("Enter the game id: ");
//            application.setAppId(sc.nextInt());

            System.out.println("Enter name of the game:");
            application.setAppName(sc.next());

            System.out.println("Enter size of the game:");
            application.setAppSizeInmb(sc.nextDouble());

            System.out.println("Enter type of the game..:");
            application.setAppType(sc.next());

            System.out.println("Enter version of the game:");
            application.setAppVersion(sc.next());

            System.out.println("Enter the company name developed this game..:");
            application.setCompanyName(sc.next());

            System.out.println("Enter the release date of this game:");
            application.setReleaseDate(sc.next());
            play.addApplication(application);
        }
        String input=null;

        do {
            System.out.println("press 1 to get application by name");
            System.out.println("press 2 to get application by id");
            System.out.println("press 3 to get application by apptype");
            System.out.println("press 4 to get application name by type");
            System.out.println("press 5 to get application type by name");
            System.out.println("press 6 to get application size by name");
            System.out.println("press 7 to get application company name by application name");
            System.out.println("press 8 to get application version update by name");
            int option= sc.nextInt();
            switch (option){

                case 1:System.out.println("Enter the game name to get its details:");
                    play.getApplicationByName(sc.next());
                    break;
                case 2:  System.out.println("Enter game id :");
                    play.getApplicationById(sc.nextInt());
                    break;

                case 3:System.out.println("Enter application type :");
                    play.getApplicationByAppType(sc.next());
                    break;

                case 4:System.out.println("Enter type :");
                    play.getApplicationNameByType(sc.next());
                    break;

                case 5:System.out.println("Enter application name:");
                    play.getApplicationTypeByName(sc.next());
                    break;

                case 6:
                    System.out.println("Enter application name:");
                    play.getApplicationSizeByName(sc.next());
                    break;

                case 7:
                    System.out.println("Enter application name:");
                    play.getApplicationCompanyByName(sc.next());
                    break;


                case 8:
                    System.out.println("Enter application name and app version:");
                    play.updateVersionByAppName(sc.next(), sc.next());
                    break;

                default:
                    System.out.println("Please select correct option given above:");
            }
            System.out.println("if you want to continue press:Y or else:N");
            input=sc.next();
        }while (input.equals("Y"));
        System.out.println("Thank you! visit again:");


}



}
