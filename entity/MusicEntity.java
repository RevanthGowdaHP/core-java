package com.xworkz.music.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "music")
@NoArgsConstructor
@Data
@NamedQuery(name = "deleteByDuration",query = "delete from MusicEntity me  where me.durationOfMusic>:du")
@NamedQuery(name = "updateMusicTypeByName",query = "update MusicEntity me set me.musicType=:mt where me.musicName=:mn")
@NamedQuery(name = "findByMusicName",query = "select me from MusicEntity me where me.musicName=:mn")
@NamedQuery(name = "findAll",query = "select me from MusicEntity me")
@NamedQuery(name = "findAllSinger",query = "select me.singerName from MusicEntity me")
public class MusicEntity {
    @Id
    @Column(name = "m_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "m_name")
    private String musicName;
    @Column(name = "m_type")
    private String musicType;
    @Column(name = "m_duration")
    private int durationOfMusic;
    @Column(name = "m_singerName")
    private String singerName;

    public MusicEntity(String musicName, String musicType, int durationOfMusic, String singerName) {
        this.musicName = musicName;
        this.musicType = musicType;
        this.durationOfMusic = durationOfMusic;
        this.singerName = singerName;
    }
}
