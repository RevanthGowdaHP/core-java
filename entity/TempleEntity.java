package com.xworkz.temple.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "temple")
@NoArgsConstructor
@Data
@NamedQuery(name="findAllByLocation",query="select temp from TempleEntity temp where temp.location=:loc")
@NamedQuery(name="findAllByEntryFeeGreaterThan",query = "select temp from TempleEntity temp where temp.entryFee>:ef")
@NamedQuery(name="findAllByEntryFeeBetween",query = "select temp from TempleEntity temp where temp.entryFee between :sfee And :efee")
@NamedQuery(name = "findAllByInauguratedDateGreaterThan",query = "select temp from TempleEntity temp where temp.inauguratedDate>:ind")
@NamedQuery(name = "findAllyByMainGodAndLocation",query = "select temp from TempleEntity temp where temp.mainGOD =:mg and location=:loc" )
@NamedQuery(name = "findById",query = "select t from TempleEntity t where t.id=:i")
@NamedQuery(name = "findByIdAndMainGod",query = "select t from TempleEntity t where t.id=:i and t.mainGOD=:mg")
@NamedQuery(name = "findTotal",query = "select count(t) from TempleEntity t")
@NamedQuery(name = "findTempleByMaxEntryFee",query = "select t from TempleEntity t where entryFee=(select max(entryFee) from TempleEntity)")
@NamedQuery(name="updateLocationByName",query = "update TempleEntity as temp set temp.location=:lo where temp.name=:na")
@NamedQuery(name="updateEntryFeeByName",query = "update TempleEntity set entryFee=:ef where name=:na")
@NamedQuery(name="updateLocationAndDimensionByID",query = "update TempleEntity set location=:loc, dimension=:dim where id=:i")
//@NamedQuery(name="updateAllVipEntry",query = "update TempleEntity set vipEntry")
@NamedQuery(name="deleteByName",query = "delete from TempleEntity as temp where temp.name=:na")

public class TempleEntity {
    @Id
    @Column(name = "t_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "t_name")
    private String name;

    @Column(name = "t_location")
    private String location;

    @Column(name = "t_entryFee")
    private double entryFee;

    @Column(name = "t_vipEntry")
    private Boolean vipEntry;

    @Column(name = "t_inauguratedDate")
    private LocalDate inauguratedDate;

    @Column(name = "t_mainGod")
    private String mainGOD;

    @Column(name = "t_dimension")
    private double dimension;

    public TempleEntity(String name, String location, double entryFee, Boolean vipEntry, LocalDate inauguratedDate, String mainGOD, double dimension) {
        this.name = name;
        this.location = location;
        this.entryFee = entryFee;
        this.vipEntry = vipEntry;
        this.inauguratedDate = inauguratedDate;
        this.mainGOD = mainGOD;
        this.dimension = dimension;
    }
}
