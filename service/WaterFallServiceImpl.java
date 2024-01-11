package com.xworkz.waterfalls.service;

import com.xworkz.waterfalls.dto.WaterFalls;
import com.xworkz.waterfalls.repository.WaterFallsImpl;
import com.xworkz.waterfalls.repository.WaterFallsRepository;

import java.util.List;

public  class WaterFallServiceImpl implements WaterFallServiceInterface{

    WaterFallsRepository waterFallsRepository = new WaterFallsImpl();

    @Override
    public void validateAndSaveWaterFall(WaterFalls waterFalls) {
        if (waterFalls.getName()!=null && waterFalls.getPlace()!=null){
            waterFallsRepository.waterFalls(waterFalls);
        }
        else {
            System.out.println("Please enter the valid inputs");
        }
    }

    @Override
    public void validateAndSaveWaterFall(List<WaterFalls> waterFall) {
        for (WaterFalls water :waterFall) {
            if (water.getName()!=null && water.getPlace() !=null){
                waterFallsRepository.waterFalls(waterFall);
            }else{
                System.out.println("Please enter the valid data");
            }
        }

    }

    @Override
    public void validateAndUpdate(String riverName, String place) {
        if (riverName != null && place != null){
            waterFallsRepository.updateRiverName(riverName,place);
        }else {
            System.out.println("Please provide the proper inputs");
        }
    }

    @Override
    public void validateAndUpdatePlaceName(List<WaterFalls> waterFalls) {
        for (WaterFalls water :waterFalls) {
            if (water.getPlace()!=null){
                waterFallsRepository.updatePlaceName(waterFalls);
            }
        }
    }

    @Override
    public boolean validateAndDelete(String stateName) {
        if (stateName != null && !stateName.isEmpty()){
            waterFallsRepository.deleteStateName(stateName);
            System.out.println(stateName);
            return true;
        }else{
            System.out.println("Sorry data cannot be deleted....");
        }
        return false;
    }

    @Override
    public WaterFalls validateAndGetWaterfalls(String name) {
        if (name!=null && !name.isEmpty()){
            WaterFalls water =waterFallsRepository.getWaterFallByName(name);
            System.out.println("ID : "+water.getId());
            System.out.println("Name : "+water.getName());
            System.out.println("River name : "+water.getRiver());
            System.out.println("State name : "+water.getState());
            System.out.println("Place name : "+water.getPlace());
            return water;
        }else {
            System.out.println("Please enter the correct name .");
        }
        return null;
    }

    @Override
    public List<WaterFalls> validateAndGetDetails(String name) {
        if (name!=null && !name.isEmpty()){
            List<WaterFalls> list=waterFallsRepository.getWaterFallDetailsByName(name);
            for (WaterFalls details :list) {
                System.out.println("Name : "+details.getName());
                System.out.println("Place : "+details.getPlace());
                System.out.println("River : "+details.getRiver());
                System.out.println("State : "+details.getState());
            }
            return list;
        }else{
            System.out.println("Entered name is incorrect...");
        }
        return null;
    }

    @Override
    public List<WaterFalls> validateAndGetAllDetails() {
        List<WaterFalls> list =waterFallsRepository.getAllDetails();
        for (WaterFalls details :list) {
            System.out.println("Name : "+details.getName());
            System.out.println("Place : "+details.getPlace());
            System.out.println("River : "+details.getRiver());
            System.out.println("State : "+details.getState());
        }
        return list;

    }
}
