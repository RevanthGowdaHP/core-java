package com.xworkz.policeapp.policestation;

import com.xworkz.policeapp.officer.Officer;

import java.util.Arrays;

public class PoliceStation {
    Officer officers[] ;

    public PoliceStation(int size){
        officers = new Officer[size];
    }
    int index;
    int idInc=1;

    public boolean addOfficers(Officer officer){
        boolean isAdded =false;
        if(officer != null){
            this.officers[index]= officer;
            this.officers[index].setOfficerId(idInc++);
            index++;
            isAdded =true;
        }
        return isAdded;
    }

    public void getOfficersInformation() {
        System.out.println("The officers Information is given below:");
        for (int get = 0; get <officers.length ; get++) {
            System.out.println(" Officer ID: "+officers[get].getOfficerId()+"\n Officer Name: "+
                    officers[get].getOfficerName()+"\n Post Name: "+
                    officers[get].getPostName()+"\n Officer Age: "+
                    officers[get].getAge()+"\n Officer Gender: "+
                    officers[get].getGender()+"\n Officer Blood Group: "+
                    officers[get].getBloodGroup());
            System.out.println("................................................................................................................................");

        }
    }
    public void getOfficerIdByOfficerName(String naam){
        System.out.println(" Match Found for name:"+naam);
        for (int name = 0; name <officers.length ; name++) {
            if (officers[name].getOfficerName().equals(naam)){
                System.out.println("'"+officers[name].getOfficerName()+"'s Officer ID: "+officers[name].getOfficerId());
                System.out.println("**************************************************************************");
            }

        }

    }

    public String getOfficerPostNameByOfficerId( int id){
        String name=null;
        System.out.println(" Match found for id:"+id);
        for (int psot = 0; psot < officers.length; psot++) {
            if (officers[psot].getOfficerId()== id){
                System.out.println(" Officer Post Name: "+officers[psot].getPostName());
                System.out.println("**************************************************************************");
            }

        }
        return name;
    }

    // namebypostname
    //infobyid agebyid

    public void getOfficerNameByPostName(String postNAme){
        System.out.println("Match found for Post Name: "+postNAme);
        for (int post = 0; post < officers.length ; post++) {
           if(officers[post].getPostName().equals(postNAme)){
               System.out.println(" Officer Name is :"+officers[post].getOfficerName());
               System.out.println("**************************************************************************");
           }
        }
    }

    public void getOficerInfoById(int id){
        System.out.println(" Match found for Id :"+id);
        for (int iD = 0; iD < officers.length ; iD++) {
            if (officers[iD].getOfficerId()==id){
                System.out.println(" Officer ID: "+officers[iD].getOfficerId()+"\n Officer Name: "+
                        officers[iD].getOfficerName()+"\n Post Name: "+
                        officers[iD].getPostName()+"\n Officer Age: "+
                        officers[iD].getAge()+"\n Officer Gender: "+
                        officers[iD].getGender()+"\n Officer Blood Group: "+
                        officers[iD].getBloodGroup());
                System.out.println("**************************************************************************");
            }

        }
    }
    public void getAgeByID(int id){
        System.out.println(" Match found for Id :"+id);
        for (int age = 0; age < officers.length ; age++) {
            if (officers[age].getOfficerId()==id){
                System.out.println("Officers Age is :"+ officers[age].getAge());
                System.out.println("**************************************************************************");
            }
        }
    }
    // update
    public boolean updatePostNameByOfficerName( String name , String newPost){
        boolean isUpdated=false;
        System.out.println("Match found for Officer Name:"+name);
        for (int update = 0; update < officers.length ; update++) {
            if (officers[update].getOfficerName().equals(name)){
                officers[update].setPostName(newPost);
                isUpdated=true;

            }

        }
        return isUpdated;
    }
    //delete
    public void  suspendOfficersByID(int id){

        int index;
        int newIndex=0;
        System.out.println(" Officer getting Suspended id is : "+id);
        for (index = 0;  index<this.officers.length ; index++) {
            if(officers[index].getOfficerId()!= id){
                officers[newIndex++]=officers[index];

            }
        }
        officers =Arrays.copyOf(officers,newIndex);
        getPresentOfficerInfo(officers);

    }

    public void getPresentOfficerInfo(Officer[] officer){
        System.out.println(" Present Officers information: ");
        for (int del = 0; del <officer.length ; del++) {
            System.out.println(" Officer ID: "+officer[del].getOfficerId()+"\n Officer Name: "+
                    officer[del].getOfficerName()+"\n Post Name: "+
                    officer[del].getPostName()+"\n Officer Age: "+
                    officer[del].getAge()+"\n Officer Gender: "+
                    officer[del].getGender()+"\n Officer Blood Group: "+
                    officer[del].getBloodGroup());
            System.out.println("................................................................................................................................");


        }
    }
    public void getAddressByID(int id){
        System.out.println("The address of Officer with ID number :"+id);
        for (int add = 0; add <officers.length ; add++) {
            if (officers[add].getOfficerId()==id){
                System.out.println("Officer address is: "+officers[add].getAddress());
            }
        }
    }


}
