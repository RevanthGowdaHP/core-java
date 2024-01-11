package com.xworkz.waterfalls.repository;

import com.xworkz.waterfalls.dto.WaterFalls;

import java.util.List;

public interface WaterFallsRepository {
    public void waterFalls(WaterFalls waterFalls);

    public void waterFalls(List<WaterFalls> waterFalls);
    public void  updateRiverName(String waterFallName , String riverName);

    public void updatePlaceName(List<WaterFalls> waterFalls);

    public boolean deleteStateName(String stateName);

    public WaterFalls getWaterFallByName(String name);

    public List<WaterFalls> getWaterFallDetailsByName(String name);
    public List<WaterFalls> getAllDetails();
}
