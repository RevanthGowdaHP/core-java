package com.xworkz.music.runner;

import com.xworkz.music.entity.MusicEntity;
import com.xworkz.music.repository.MusicRepository;
import com.xworkz.music.repository.MusicRepositoryImpl;

import java.util.List;

public class MusicRunner {
    public static void main(String[] args) {
        MusicEntity entity = new MusicEntity("Star Boy", "Rap", 240, "WeekEnd");
        MusicEntity entity1 = new MusicEntity("MoonLight", "Flat", 120, "Kaali Uchis");
        MusicEntity entity2 = new MusicEntity("Alag Aasman", "Feelings", 300, "Anuv Jain");
        MusicEntity entity3 = new MusicEntity("Jaaniye", "Love", 370, "HarshaVardhan");
        MusicRepository musicRepository = new MusicRepositoryImpl();
        System.out.println("\n Saving the music Details : ");
        musicRepository.save(entity3);

        System.out.println("\nDeleting the music details :\n");
        musicRepository.deleteByDuration(320);

        System.out.println("\nUpdating the Music Type : \n");
        musicRepository.updateMusicTypeByName("remix", "MoonLight");

        System.out.println("\nFinding music name : \n");
        musicRepository.findByMusicName("Alag Aasman");

        List<MusicEntity> entities = musicRepository.findAll();
        System.out.println("\nList of music details are : ");
        entities.forEach(singleEntity -> System.out.println(singleEntity));

        List<String> singers = musicRepository.findAllSinger();
        System.out.println("\nSinger are: ");
        singers.forEach(singer -> System.out.println(singer));

    }
}
