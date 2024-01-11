package com.xworkz.applications.dto;

public class ApplicationMembers {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String name;
    private int size;
    private String company_name;
    private String type;

    public ApplicationMembers(){

    }
    @Override
    public String toString() {
        return "ApplicationMembers{" +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", company_name='" + company_name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public ApplicationMembers( String name, int size,String company_name, String type){

        this.name= name;
        this.size = size;
        this.company_name = company_name;
        this.type = type;
    }
}
