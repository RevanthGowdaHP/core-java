package com.xworkz.policeapp.officer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Officer {
    private int officerId;
    private String officerName;
    private String postName;
    private int age;
    private String gender;
    private String  bloodGroup;
    private String address;

    public Officer(){

    }

}
