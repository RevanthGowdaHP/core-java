package com.xworkz.playstore.software.hub;

import com.xworkz.playstore.details.Details;

public interface SoftwareHub {
    public boolean addApplication(Details applications);
    public Details getApplicationByName(String appName);
    public int getApplicationById(int idName);
    public String getApplicationByAppType(String appType);
    public String getApplicationNameByType(String applicationType);
    public String getApplicationTypeByName(String applicationName);
    public String getApplicationSizeByName(String applicationName);
    public String getApplicationCompanyByName(String applicationName);
    public boolean updateVersionByAppName(String name,String newVersion);
    public boolean updateCompanyNameAndSizeByAppName(String appName,String newcompanyName,Double newAppSize);
    public void deleteApplicationByName(String appName);
    public void newApplication(Details[] application);

}
