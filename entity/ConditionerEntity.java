package com.xworkz.conditioner.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "conditioner")
@NoArgsConstructor
@NamedQuery(name = "updateNetQuantityByBrand", query = "update ConditionerEntity as ce set ce.netQuantity=:nq where ce.brand=:b")
@NamedQuery(name = "updateRecommendedForByBrand", query = "update ConditionerEntity as ce set ce.recommendedFor=:rf where ce.brand=:b")
@NamedQuery(name = "findAllByBrand", query = "select ce from ConditionerEntity ce where ce.brand=:b")
@NamedQuery(name = "findAllByHairType", query = "select ce from ConditionerEntity ce where ce.hairType=:ht")
@NamedQuery(name = "findScentById", query = "select ce.scent from ConditionerEntity ce where ce.id=:i")
@NamedQuery(name = "getAllSize", query = "select ce.size from ConditionerEntity ce ")
@NamedQuery(name = "getAllBrand", query = "select ce.brand from ConditionerEntity ce")
public class ConditionerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private int id;
    @Column(name = "c_name")
    private String name;
    @Column(name = "c_brand")
    private String brand;
    @Column(name = "c_hairType")
    private String hairType;
    @Column(name = "c_netQuantity")
    private int netQuantity;
    @Column(name = "c_scent")
    private String scent;
    @Column(name = "c_size")
    private int size;
    @Column(name = "c_recommendedFor")
    private String recommendedFor;

    public ConditionerEntity(String name, String brand, String hairType, int netQuantity, String scent, int size, String recommendedFor) {
        this.name = name;
        this.brand = brand;
        this.hairType = hairType;
        this.netQuantity = netQuantity;
        this.scent = scent;
        this.size = size;
        this.recommendedFor = recommendedFor;
    }
}
