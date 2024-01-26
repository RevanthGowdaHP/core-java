package com.xworkz.temple.runner;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.repository.TempleRepository;
import com.xworkz.temple.repository.TempleRepositoryImpl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TempleRun {

    public static void main(String[] args) {
        TempleEntity entity = new TempleEntity("Ram Mandir","Ayoudhya",1000.0d,true, LocalDate.of(2024,1,22),"Sri Ram",10000.0d);
        TempleRepository templeRepository = new TempleRepositoryImpl();
        templeRepository.save(entity);
        //*******************************************************************
        TempleEntity entity1 = new TempleEntity("Shiv Mandir","Kaashi",3000.0d,false, LocalDate.of(1022,2,8),"Shiva",4000.0d);
        TempleEntity entity2 = new TempleEntity("Vishnu Mandir","Thiruvanantapuram",1200.0d,false, LocalDate.of(1000,6,3),"Vishnu",2000.0d);
        TempleEntity entity3 = new TempleEntity("Ganesh Mandir","Idugunji",1400.0d,false, LocalDate.of(1918,3,27),"Ganapthi",500.0d);
        List<TempleEntity> entities = Arrays.asList(entity1,entity2,entity3);
//        templeRepository.saveAll(entities);
        //*******************************************************************

//        templeRepository.findAllByLocation("Kaashi");
        //*******************************************************************

//        List<TempleEntity> list =templeRepository.findAllByEntryFeeGreaterThan(100.00d);
//        list.forEach(temple-> System.out.println(temple));
           //*******************************************************************

//    List<TempleEntity> list =templeRepository.findAllByInauguratedDateGreaterThan(LocalDate.of(2022,2,8));
//        list.forEach(temple-> System.out.println(temple));
//        *******************************************************************

//        TempleEntity entity4=templeRepository.findById(1);
//        System.out.println(entity4);
        //*******************************************************************
//
//       Long total= templeRepository.findTotal();
//        System.out.println(total);
        //*******************************************************************

//        TempleEntity temple=templeRepository.findTempleByMaxEntryFee();
//        System.out.println(temple);
        //*******************************************************************

//        List<TempleEntity> entities1=templeRepository.findAllByEntryFeeBetween(2000.00d,3000.00d);
//        entities1.forEach(enity-> System.out.println(enity));
        //*******************************************************************

//        List<TempleEntity> entities1=templeRepository.findAllyByMainGodAndLocation("Shiva","Kaashi");
//        entities1.forEach(entiti1-> System.out.println(entiti1));
        //*******************************************************************

//       TempleEntity entity4= templeRepository.findByIdAndMainGod(3,"Vishnu");
//        System.out.println(entity4);

//        templeRepository.updateLocationByName("Murudeshwara","shiv mandir");

//        templeRepository.updateEntryFeeByName(4921.00d,"ram mandir");

//        templeRepository.updateLocationAndDimensionByID("Gokarna",1298,8);
//        templeRepository.deleteByName("Shiv Mandir");

        System.out.println("updated..");
        System.out.println("Saved..");
    }
}
