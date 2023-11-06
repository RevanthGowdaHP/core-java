package com.xworkz.playstore.software.hub.impl;

import com.xworkz.playstore.details.Details;
import com.xworkz.playstore.software.hub.SoftwareHub;

import java.util.Arrays;

public class PlayStore implements SoftwareHub {
    public Details []applications;
    int index;
    int idInc=1;
    public PlayStore(int size){
        applications = new Details[size];
    }


    @Override
    public boolean addApplication(Details applications) {
        boolean isAdded=false;
        if(applications!=null){
            this.applications[index]=applications;
            this.applications[index].setAppId(++idInc);
            index++;
        }
        else{
            System.out.println("null cannot be added.");
        }
        return isAdded;
    }

    @Override
    public Details getApplicationByName(String appName) {
        Details app=null;
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        for (int index=0;index<applications.length;index++){

            if (applications[index].getAppName().equals(appName)){
                System.out.println("Application name found...");
                app=applications[index];
                System.out.println("This is the details of ::::"+appName);
                System.out.println("App name: "+applications[index].getAppName()+"\n"
                        +"App id: "+applications[index].getAppId()+"\n"+
                        "App size: "+applications[index].getAppSizeInmb()+"\n"+
                        "App company name: "+applications[index].getCompanyName()+"\n"+
                        "App released date: "+applications[index].getReleaseDate()+"\n"+"app version: "+applications[index].getAppVersion());
            }
        }
        return app;
    }

    @Override
    public int getApplicationById(int idName) {
        System.out.println("------------------------------------------------------");
        int  inValue=0;
        for (int index=0;index<applications.length;index++){
            if (applications[index].getAppId()==idName){
                System.out.println("Application id matched....");
                System.out.println("App name: "+applications[index].getAppName()+"\n"
                        +"App id: "+applications[index].getAppId()+"\n"
                        +"App size: "+applications[index].getAppSizeInmb()+"\n"
                        +"App developed by company: "+applications[index].getCompanyName()+"\n"
                        +"App releasing date: "+applications[index].getReleaseDate());
            }
        }
        return inValue;
    }

    @Override
    public String getApplicationByAppType(String appType) {
        System.out.println("------------------------------------------------");
        for (int index=0;index<applications.length;index++){
            if (applications[index].getAppType().equals(appType)){
                System.out.println("Application type matched....");
                System.out.println("App name: "+applications[index].getAppName()+"\n"
                        +"App id: "+applications[index].getAppId()+"\n"
                        +"App size: "+applications[index].getAppSizeInmb()+"\n"
                        +"App developed by company: "+applications[index].getCompanyName()+"\n"
                        +"App releasing date: "+applications[index].getReleaseDate());
            }
        }
        return  appType;
    }

    @Override
    public String getApplicationNameByType(String applicationType) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        for (int index=0;index<applications.length;index++){
            if (applications[index].getAppType().equals(applicationType)){
                System.out.println("Application type matched....");
                System.out.println("App name: "+applications[index].getAppName());
            }
        }
        return applicationType;
    }

    @Override
    public String getApplicationTypeByName(String applicationName) {
        System.out.println("==================================================");
        for (int index=0;index<applications.length;index++){
            if (applications[index].getAppName().equals(applicationName)){
                System.out.println("Application name matched....");
                System.out.println(applicationName+" type is: "+applications[index].getAppType()+" application");
            }
        }
        return applicationName;
    }

    @Override
    public String getApplicationSizeByName(String applicationName) {
        System.out.println("==================================================");
        for (int index=0;index<applications.length;index++){
            if (applications[index].getAppName().equals(applicationName)){
                System.out.println("Application name matched....");
                System.out.println(applicationName+" size is: "+applications[index].getAppSizeInmb()+"mb");
            }
        }
        return applicationName;
    }

    @Override
    public String getApplicationCompanyByName(String applicationName) {
        System.out.println("==================================================");
        for (int index=0;index<applications.length;index++){
            if (applications[index].getAppName().equals(applicationName)){
                System.out.println("Application name matched....");
                System.out.println(applicationName+" devoloped by company: "+applications[index].getCompanyName());
            }
        }
        return applicationName;
    }

    @Override
    public boolean updateVersionByAppName(String name, String newVersion) {
        boolean isUpdated=false;
        for(int num=0;num<applications.length;num++){
            if (applications[num].getAppName().equals(name))
                applications[num].setAppVersion(newVersion);
            isUpdated=true;
            System.out.println("version updated");
        }
        return isUpdated;
    }

    @Override
    public boolean updateCompanyNameAndSizeByAppName(String appName, String newcompanyName, Double newAppSize) {
        boolean isWorkDone=false;
        for (int num=0;num<applications.length;num++){
            if (applications[num].getAppName().equals(appName)){
                applications[num].setCompanyName(newcompanyName);
                applications[num].setAppSizeInmb(newAppSize);
                System.out.println("all things updated");
            }

        }
        return  isWorkDone;
    }

    @Override
    public void deleteApplicationByName(String appName) {
        System.out.println("invoked delete method");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        int index;
        int newIndex;
        for (index=0,newIndex=0;index<applications.length;index++){
            if (!applications[index].getAppName().equals(appName)){
                applications[newIndex++]=applications[index];
            }
        }
        applications= Arrays.copyOf(applications,newIndex);
        newApplication(applications);
    }

    @Override
    public void newApplication(Details[] application) {
        for (int index=0;index<application.length;index++){
            System.out.println("new applications");
            System.out.println("Application name: "+application[index].getAppName()+"\n"
                    +"application id: "+application[index].getAppId()+"\n"
                    +"app devoloped company: "+application[index].getCompanyName()+"\n"+"app size: "+application[index].getAppSizeInmb()
                    +"\n"+"app relese date: "+application[index].getReleaseDate());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++" +
                    "");
     }
    }
}


