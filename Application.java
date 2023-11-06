package com.xworkz.playstore.details;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class Details {
    private int appId;
    private String appName;
    private String appVersion;
    private  double appSizeInmb;
    private String appType;
    private String releaseDate;
    private String companyName;



    public Details(){


    }

}












