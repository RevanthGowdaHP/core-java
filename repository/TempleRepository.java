package com.xworkz.temple.repository;

import com.xworkz.temple.entity.TempleEntity;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public interface TempleRepository {
    Integer save(TempleEntity entity);
    Integer saveAll(List<TempleEntity> entities);
    default List<TempleEntity> findAllByLocation(String name){
        return Collections.emptyList();
    }
    default List<TempleEntity> findAllByEntryFeeGreaterThan(double fee){

        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByEntryFeeBetween(double startFee , double endFee){
        return Collections.emptyList();
    }

    default List<TempleEntity> findAllByInauguratedDateGreaterThan(LocalDate day){
        return Collections.emptyList();
    }
    default List<TempleEntity> findAllyByMainGodAndLocation(String mainGod,String Location){
        return Collections.emptyList();
    }

    default TempleEntity findById(int id){
        return null;
    }

    default TempleEntity findByIdAndMainGod(int id,String mainGod){
        return null;
    }
   public Long findTotal();
   public TempleEntity findTempleByMaxEntryFee();

   void updateLocationByName(String location , String name);
   void updateEntryFeeByName(double entryFee, String name);
   void updateLocationAndDimensionByID(String location,double dimension, int id);
    void updateAllVipEntry(boolean entry,List<Integer> ids);
    void deleteByName(String name);

}
