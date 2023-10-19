package com.xworkz.octseventask;

public class Playstore {
    String appNames[]= new String[5];
    int index;


    //create
    public void addAppNames(String appName){
        if(index<appNames.length){
            if(appName!=null){
                boolean isExist = duplicate(appName);
                if(isExist==false){
                appNames[index++]=appName;
                System.out.println("'"+appName+"' added to PlayStore");
            }
            }
            else {
                System.out.println(" NOTE: 'App name can not be null'");
            }
        }else {
            System.out.println("     No space available in PlayStore to add '"+appName+"'");
        }
    }

    //read
    public void readAppName(){
        System.out.println(" ");
        System.out.println("These are the Apps in PlayStore:");
        for (int read=0; read<appNames.length; read++){
            if(appNames[read]!=null){

                System.out.println("                            '"+appNames[read]+"'");

            }
        }
    }
    //update
    public  boolean updateAppName(String oldAppName, String newAppName){
        boolean isUpdate=false;
        for (int upd=0;upd<appNames.length; upd++){
            if(appNames[upd]==oldAppName){
                appNames[upd]= newAppName;
                isUpdate = true;

            }
        }
        if (isUpdate){
            System.out.println("'"+oldAppName+"' is replaced by '"+newAppName+"' in PlayStore");
        }else {
            System.out.println("'"+oldAppName+"' not found in PlayStore");
        }
        return isUpdate;
    }

    //delete
    public void deleteAppName(String delName){
        String afterDeletedAppName[]= new String[appNames.length-1];
        int index=0;
        for(int del=0; del< appNames.length;del++){
            if(appNames[del]!=delName){
                afterDeletedAppName[index++]=appNames[del];
            }

        }
        System.out.println(" ");
        System.out.println("  '"+delName+"' is the deleted App from PlayStore");
        System.out.println("These are the Apps in PlayStore after deletion");
        for (int after=0;after<afterDeletedAppName.length;after++){
            System.out.println("                                              '"+afterDeletedAppName[after]+"'");
        }
    }

    public boolean duplicate(String dulpiName){
        boolean isdup=false;
        for (int dup =0; dup<appNames.length; dup++){
            if(appNames[dup]==dulpiName){
                isdup=true;
                System.out.println("'"+dulpiName+"' exist already in PlayStore");
            }

        }
        return isdup;
    }
}
