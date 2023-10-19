package com.xworkz.playstore;

import com.xworkz.playstore.application.PlayStore;
import com.xworkz.playstore.hub.Application;

import java.util.Scanner;

public class ApplicationExecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the size of Array:");
        int size = scanner.nextInt();
        PlayStore playStore = new PlayStore(size);

        for (int scan = 0 ; scan <size; scan++){
            Application application= new Application();

            System.out.println("Enter app name:");
            application.setAppName(scanner.next());
            System.out.println("Enter app version:");
            application.setAppVersion(scanner.next());
            System.out.println("Enter app size:");
            application.setAppSizeinMB(scanner.nextDouble());
            System.out.println("Enter company name:");
            application.setCompanyName(scanner.next());
            System.out.println("Enter release date");
            application.setReleaseDate(scanner.next());
            System.out.println("Enter app type");
            application.setAppType(scanner.next());
            playStore.addApplication(application);
        }



   String check = null;
      do {
          System.out.println("Press 1 : To get Application by Name:");
          System.out.println("Press 2 : To get Application by ID");
          System.out.println("Press 3 : To get Application by Type");
          System.out.println("Press 4 : To get App name by type");
          System.out.println("Press 5 : To get App type by name");
          System.out.println("Press 6 : To get App size by name");
          System.out.println("Press 7 : To get company name by App name");
          System.out.println("Press 8 : To get App size and name by App type");
          System.out.println("Press 9 : To update App version by app name");
          System.out.println("Press 10 : To update Company name by app ID");
          System.out.println("Press 11 : To delete app name from application");
          System.out.println("Press 12 : To get All details of App");

          int press = scanner.nextInt();
          switch (press){
              case 1:  System.out.println("Enter App Name to get Application");
                  playStore.getApplicationByName(scanner.next());
                  break;
              case 2:  System.out.println("Enter App ID to get Application");
                  playStore.getApplicationByID(scanner.nextInt());
                  break;
              case 3:
                  System.out.println("Enter App type to get Application");
                  playStore.getApplicationByAppType(scanner.next());
                  break;
              case 4:  System.out.println("Enter App type to get App name");
                  playStore.getApplicationNameByType(scanner.next());
                  break;
              case 5: System.out.println("Enter App name to get App type");
                  playStore.getApplicationTypeByName(scanner.next());
                  break;
              case 6:
                  System.out.println("Enter App name to get App size");
                  playStore.getApplicationSizeByName(scanner.next());
                  break;
              case 7: System.out.println("Enter App name to get Company Name");
                  playStore.getApplicationCompanyByName(scanner.next());
                  break;
              case 8: System.out.println("Enter App type to get App size and name");
                  playStore.getApplicationSizeAndNameByType(scanner.next());
                  break;
              case 9:  System.out.println("Enter App name and New version to update the version");
                  playStore.updateAppVersionByAppName(scanner.next(),scanner.next());
                  break;
              case 10:  System.out.println("Enter App id and New company name to update company name");
                  playStore.updateCompanyNameByID(scanner.nextInt(),scanner.next());
                  break;
              case 11:  System.out.println("Enter App name to delete ");
                  playStore.deleteApplicationByAppName(scanner.next());
                  break;
              case 12:
                  System.out.println(" Get All application details ");
                  playStore.getAllApplicationName();
                  break;
              default:
                  System.out.println(" Please Enter valid option");
          }

          System.out.println("To continue Press : Y else Press : N ");
          check = scanner.next();



      }while (check.equals("Y"));
        System.out.println(" Thanks for using PlayStore ");






    }
}
