package com.xworkz.music.repository;

import com.xworkz.music.entity.MusicEntity;

import java.util.Collections;
import java.util.List;

public interface MusicRepository {
   public void save(MusicEntity entity);
   public void deleteByDuration(int timeL);
   public void updateMusicTypeByName(String musicType, String musicName);
   default MusicEntity findByMusicName(String musicName){
       return null;
   }
    default List<MusicEntity> findAll(){
       return Collections.emptyList();
    }
    List<String> findAllSinger();
}
