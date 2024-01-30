package com.xworkz.conditioner.repository;

import com.xworkz.conditioner.entity.ConditionerEntity;

import java.util.List;

public interface ConditionerRepository {
    void save(ConditionerEntity entity);
    void saveList(List<ConditionerEntity> list);
    void updateNetQuantityByBrand(String brand,int quantity);
    void updateRecommendedForByBrand(String brand,String rc);
    List<ConditionerEntity> findAllByBrand(String brand);
    List<ConditionerEntity> findAllByHairType(String type);
     String findScentById(int id);
    List<Integer> getAllSize();
    List<String> getAllBrand();


}
