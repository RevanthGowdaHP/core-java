package com.xworkz.applications.service;

import com.xworkz.applications.dto.ApplicationMembers;

public interface ApplicationServiceInterface {

    public void validateAndUpdate(ApplicationMembers applicationMembers);
    public void getAppDetails(ApplicationMembers applicationMembers);

    public ApplicationMembers validateAndGetDetailsByName(String name);
    public int updateSizeByName(int size , String name);
    public void validateAndDelete(String type);
}
