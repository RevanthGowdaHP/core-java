package com.xworkz.applications.service;

import com.xworkz.applications.dto.ApplicationMembers;
import com.xworkz.applications.repository.ApplicationRepoImpl;
import com.xworkz.applications.repository.ApplicationRepoInterface;

public class ApplicationServiceImpl implements ApplicationServiceInterface{

    ApplicationRepoInterface api = new ApplicationRepoImpl();

    @Override
    public void validateAndUpdate(ApplicationMembers applicationMembers) {
        if (applicationMembers.getName() != null && applicationMembers.getCompany_name()!= null){
            api.saveApp(applicationMembers);
        }
    }

    @Override
    public void getAppDetails(ApplicationMembers applicationMembers) {
        api.getAppDetails(applicationMembers);
    }

    @Override
    public ApplicationMembers validateAndGetDetailsByName(String name) {
        if (name!=null && !name.isEmpty()){
            ApplicationMembers applicationMembers =  api.getAppDetailsByName(name);
            System.out.println("Name :"+ applicationMembers.getName());
            System.out.println("Company name : "+applicationMembers.getCompany_name());
            System.out.println("Type : "+applicationMembers.getType());
            System.out.println("Size : "+applicationMembers.getSize());
            return applicationMembers;
        }else {
            System.out.println("Enter the correct name ......");
        }
        return null;
    }

    @Override
    public int updateSizeByName(int size, String name) {
        if (size !=0 && name!=null){
         int sizes=   api.updateSizeByAppName(size,name);
            System.out.println("Updated successfully..");

            return sizes;

        }else{
            System.out.println("Name did not matched .");
        }
        return size;
    }

    @Override
    public void validateAndDelete(String type) {
        if (type!=null && !type.isEmpty()){
            api.deleteAppDetailsByType(type);
            System.out.println("App deleted successfully..");
        }else{
            System.out.println("Sorry entered type is not matching ...");
        }
    }


}
