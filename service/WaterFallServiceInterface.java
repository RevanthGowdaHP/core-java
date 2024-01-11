package com.xworkz.waterfalls.service;

import com.xworkz.waterfalls.dto.WaterFalls;

import java.util.List;

public interface WaterFallServiceInterface {

    public void validateAndSaveWaterFall(WaterFalls waterFalls);

    public void validateAndSaveWaterFall(List<WaterFalls> waterFall);

     public void validateAndUpdate(String riverName, String place);

     public void validateAndUpdatePlaceName(List<WaterFalls> waterFalls);

     public boolean validateAndDelete(String stateName);

     public WaterFalls validateAndGetWaterfalls(String name);
     public List<WaterFalls> validateAndGetDetails(String name);
     public List<WaterFalls> validateAndGetAllDetails();
}
