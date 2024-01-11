package com.xworkz.applications.repository;

import com.xworkz.applications.dto.ApplicationMembers;

public interface ApplicationRepoInterface {

    public void saveApp(ApplicationMembers application);
    public void getAppDetails(ApplicationMembers appDetails);
    public ApplicationMembers getAppDetailsByName(String name);
    public int updateSizeByAppName(int size , String name);
    public void deleteAppDetailsByType(String type);
}
