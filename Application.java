package com.xworkz.playstore.hub;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class Application {
    private int appId;
    private String appName;
    private String appVersion;
    private double appSizeinMB;
    private String appType;
    private String releaseDate;
    private String companyName;


    public Application(){


    }

}
