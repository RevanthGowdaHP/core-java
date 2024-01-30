package com.xworkz.conditioner.runner;

import com.xworkz.conditioner.entity.ConditionerEntity;
import com.xworkz.conditioner.repository.ConditionerRepository;
import com.xworkz.conditioner.repository.ConditionerRepositoryImpl;

import java.util.Arrays;
import java.util.List;

public class ConditionerRunner {
    public static void main(String[] args) {
        ConditionerEntity conditioner = new ConditionerEntity("SilkySmooth", "TRESemme", "Frizzy", 2, "Fresh", 300, "Frizz Management");
        ConditionerRepository conditionerRepository = new ConditionerRepositoryImpl();
        conditionerRepository.save(conditioner);

        List<ConditionerEntity> list = Arrays.asList(new ConditionerEntity("Shampoo", "HeadAndShoulder", "Dry", 1, "New", 120, "Dandruff Management"),
                new ConditionerEntity("VerySmooth", "Dove", "HairFall", 8, "Fresh", 500, "Frizz Management"),
                new ConditionerEntity("HairGel", "TRESemme", "Frizzy", 3, "Fresh", 250, "Hair Damage Management"),
                new ConditionerEntity("Sashe", "TRESemme", "Frizzy", 35, "Fresh", 5, "Packet Management"));
        conditionerRepository.saveList(list);

        conditionerRepository.updateNetQuantityByBrand("Dove", 67);

        conditionerRepository.updateRecommendedForByBrand("dove", "Thick hair");

        conditionerRepository.findAllByBrand("TRESemme");

        conditionerRepository.findAllByHairType("Frizzy");

        conditionerRepository.findScentById(4);

        conditionerRepository.getAllBrand();

        conditionerRepository.getAllSize();
    }
}
