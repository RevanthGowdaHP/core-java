package com.xworkz.waterfalls.dto;

public class WaterFalls {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getRiver() {
        return river;
    }

    public void setRiver(String river) {
        this.river = river;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String place;
    private String river;
    private String state;

    @Override
    public String toString() {
        return "WaterFalls{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", river='" + river + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public WaterFalls(){

    }
    public WaterFalls(int id,String name,String place,String river,String state){
        this.id = id;
        this.name= name;
        this.place = place;
        this.river = river;
        this.state = state;
    }
}
