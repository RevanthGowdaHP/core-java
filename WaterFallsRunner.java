package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dto.WaterFalls;
import com.xworkz.waterfalls.service.WaterFallServiceImpl;
import com.xworkz.waterfalls.service.WaterFallServiceInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WaterFallsRunner {
    public static void main(String[] args) {
        WaterFallServiceInterface water = new WaterFallServiceImpl();
        water.validateAndSaveWaterFall(new WaterFalls(2,"Gubbi","null","Godavari","Karnataka"));
        water.validateAndSaveWaterFall(new WaterFalls(3,"Dabbi","Sull","Snadasari","Maha"));
//
//
        List<WaterFalls> paani = new ArrayList<>();
        paani.add(new WaterFalls(4,"Dumni","mull","agana","Kerala"));
        paani.add(new WaterFalls(5,"Sondi","gull","magana","Delhi"));
        paani.add(new WaterFalls(5,null,"gull","magana","Delhi"));
        water.validateAndSaveWaterFall(paani);

        water.validateAndUpdate("Narmada","Sull");

        WaterFalls waterFalls = new WaterFalls();
        waterFalls.setName("kerala");
        waterFalls.setPlace("null");
        List<WaterFalls> list = new ArrayList();
        list.add(waterFalls);
        water.validateAndUpdatePlaceName(list);

        water.validateAndDelete("Kerala");

        water.validateAndGetWaterfalls("kerala");
        water.validateAndGetDetails("narmada");
        water.validateAndGetAllDetails();

    }
}
