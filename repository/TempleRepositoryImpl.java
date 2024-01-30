package com.xworkz.temple.repository;

import com.xworkz.temple.entity.TempleEntity;
import com.xworkz.temple.util.EMFUtil;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


public class TempleRepositoryImpl implements TempleRepository{
    private EntityManagerFactory emf = EMFUtil.getEntityManager();

    @Override
    public Integer save(TempleEntity entity) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
            em.persist(entity);
            et.commit();
            System.out.println("Committed successfully..");
            return entity.getId();
        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return null;
    }

    @Override
    public Integer saveAll(List<TempleEntity> entities) {

        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
            entities.forEach(entity -> em.persist(entity));
            et.commit();
            System.out.println("Committed successfully..");

        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return null;
    }

    @Override
    public List<TempleEntity> findAllByLocation(String name) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
           Query query= em.createNamedQuery("findAllByLocation");
           query.setParameter("loc",name);
           List<TempleEntity> list =query.getResultList();
            System.out.println(list);
            et.commit();
            System.out.println("Committed successfully..");
            return list;

        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }

        return TempleRepository.super.findAllByLocation(name);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeGreaterThan(double fee) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
            Query query = em.createNamedQuery("findAllByEntryFeeGreaterThan");
            query.setParameter("ef",fee);
            List<TempleEntity> list=query.getResultList();
            et.commit();
            System.out.println("Committed successfully..");
            return list;

        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return TempleRepository.super.findAllByEntryFeeGreaterThan(fee);
    }

    @Override
    public List<TempleEntity> findAllByEntryFeeBetween(double startFee, double endFee) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
            Query query= em.createNamedQuery("findAllByEntryFeeBetween");
            query.setParameter("sfee",startFee);
            query.setParameter("efee",endFee);
            List<TempleEntity> entities=query.getResultList();
            et.commit();
            System.out.println("Committed successfully..");
return entities;
        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return TempleRepository.super.findAllByEntryFeeBetween(startFee, endFee);
    }

    @Override
    public List<TempleEntity> findAllByInauguratedDateGreaterThan(LocalDate day) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
            Query query=em.createNamedQuery("findAllByInauguratedDateGreaterThan");
            query.setParameter("ind",day);
            List<TempleEntity> list=query.getResultList();
            et.commit();
            System.out.println("Committed successfully..");
            System.out.println(" Inaugurated date : ");
            return list;

        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return TempleRepository.super.findAllByInauguratedDateGreaterThan(day);
    }

    @Override
    public List<TempleEntity> findAllyByMainGodAndLocation(String mainGod, String Location) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
             Query query=em.createNamedQuery("findAllyByMainGodAndLocation");
             query.setParameter("mg",mainGod);
             query.setParameter("loc",Location);
            List<TempleEntity> entities= query.getResultList();
            et.commit();
            System.out.println("Committed successfully..");
return  entities;
        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return TempleRepository.super.findAllyByMainGodAndLocation(mainGod, Location);
    }

    @Override
    public TempleEntity findById(int id) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
           Query query=em.createNamedQuery("findById");
           query.setParameter("i",id);
           Object obj=query.getSingleResult();
            TempleEntity entity=(TempleEntity)obj;
            et.commit();
            System.out.println("Committed successfully..");
            System.out.println("\n Finding By Id: ");
return entity;
        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return TempleRepository.super.findById(id);
    }

    @Override
    public TempleEntity findByIdAndMainGod(int id, String mainGod) {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
          Query query=  em.createNamedQuery("findByIdAndMainGod");
          query.setParameter("i",id);
          query.setParameter("mg",mainGod);
          Object entities=query.getSingleResult();
            TempleEntity entity=(TempleEntity)entities;
            et.commit();
            System.out.println("Committed successfully..");
return  entity;
        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return TempleRepository.super.findByIdAndMainGod(id, mainGod);
    }

    @Override
    public Long findTotal() {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
            Query query=em.createNamedQuery("findTotal");
            Object obj=query.getSingleResult();
            Long total=(Long)obj;
            et.commit();
            System.out.println("Committed successfully..");
            System.out.println("\nTotal");
            return total;
        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return null;
    }

    @Override
    public TempleEntity findTempleByMaxEntryFee() {
        EntityManager em =this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begins");
           Query query =em.createNamedQuery("findTempleByMaxEntryFee");
           Object obj=query.getSingleResult();
            TempleEntity entity=(TempleEntity)obj;
            et.commit();
            System.out.println("Committed successfully..");
            System.out.println("\nTemple with max entry fee");
            return entity;
        }catch (PersistenceException per){
            System.out.println("Persistence exception"+per);
            et.rollback();
        }finally {
            em.close();
        }
        return null;
    }

    @Override
    public void updateLocationByName(String location, String name) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
     try{
         et.begin();
         System.out.println("transaction begin");
         Query query=em.createNamedQuery("updateLocationByName");
         query.setParameter("lo",location);
         query.setParameter("na",name);
         int afet=query.executeUpdate();
         System.out.println(afet);
         et.commit();
         System.out.println("committed successfully..");

     }catch (PersistenceException persistenceException){
         System.out.println("Persistence exception :" +persistenceException);
         et.rollback();
     }finally {
         em.close();
     }
    }

    @Override
    public void updateEntryFeeByName(double entryFee, String name) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("transaction begin");
            Query query=em.createNamedQuery("updateEntryFeeByName");
            query.setParameter("ef",entryFee);
            query.setParameter("na",name);
            int afet=query.executeUpdate();
            System.out.println(afet);
            et.commit();
            System.out.println("committed successfully..");

        }catch (PersistenceException persistenceException){
            System.out.println("Persistence exception :" +persistenceException);
            et.rollback();
        }finally {
            em.close();
        }
    }

    @Override
    public void updateLocationAndDimensionByID(String location, double dimension, int id) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("transaction begin");
            Query query=em.createNamedQuery("updateLocationAndDimensionByID");
            query.setParameter("loc",location);
            query.setParameter("dim",dimension);
            query.setParameter("i",id);
            int afet=query.executeUpdate();
            System.out.println(afet);
            et.commit();
            System.out.println("committed successfully..");

        }catch (PersistenceException persistenceException){
            System.out.println("Persistence exception :" +persistenceException);
            et.rollback();
        }finally {
            em.close();
        }
    }

    @Override
    public void updateAllVipEntry(boolean entry, List<Integer> ids) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("transaction begin");
            Query query=em.createNamedQuery("updateAllVipEntry");
//            query.setParameter("ef",entryFee);
//            query.setParameter("na",name);
            int afet=query.executeUpdate();
            System.out.println(afet);
            et.commit();
            System.out.println("committed successfully..");

        }catch (PersistenceException persistenceException){
            System.out.println("Persistence exception :" +persistenceException);
            et.rollback();
        }finally {
            em.close();
        }
    }

    @Override
    public void deleteByName(String name) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            System.out.println("transaction begin");
            Query query=em.createNamedQuery("deleteByName");
           query.setParameter("na",name);
            int afet=query.executeUpdate();
            System.out.println(afet);
            et.commit();
            System.out.println("committed successfully..");

        }catch (PersistenceException persistenceException){
            System.out.println("Persistence exception :" +persistenceException);
            et.rollback();
        }finally {
            em.close();
        }
    }
}
