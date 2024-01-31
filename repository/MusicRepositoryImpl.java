package com.xworkz.music.repository;

import com.xworkz.music.entity.MusicEntity;
import com.xworkz.music.util.EMFUtil;

import javax.persistence.*;
import java.text.ParseException;
import java.util.List;

public class MusicRepositoryImpl implements MusicRepository {
    private EntityManagerFactory emf = EMFUtil.getEmf();

    @Override
    public void save(MusicEntity entity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("transaction begin..");
            em.persist(entity);
            System.out.println("persisted..");
            et.commit();
            System.out.println("committed..");
        } catch (PersistenceException pe) {
            System.err.println("Persistence Exception : " + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void deleteByDuration(int timeL) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("transaction begin..");
            Query query = em.createNamedQuery("deleteByDuration");
            query.setParameter("du", timeL);
            query.executeUpdate();
            System.out.println("persisted..");
            et.commit();
            System.out.println("committed..");
        } catch (PersistenceException pe) {
            System.err.println("Persistence Exception : " + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void updateMusicTypeByName(String musicType, String musicName) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("transaction begin..");
            Query query = em.createNamedQuery("updateMusicTypeByName");
            query.setParameter("mt", musicType);
            query.setParameter("mn", musicName);
            query.executeUpdate();
            System.out.println("Updated..");
            System.out.println("persisted..");
            et.commit();
            System.out.println("committed..");
        } catch (PersistenceException pe) {
            System.err.println("Persistence Exception : " + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public MusicEntity findByMusicName(String musicName) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("transaction begin..");
            Query query = em.createNamedQuery("findByMusicName");
            query.setParameter("mn", musicName);
            Object onj = query.getSingleResult();
            MusicEntity musicEntity = (MusicEntity) onj;
            System.out.println(musicEntity);
            System.out.println("persisted..");
            et.commit();
            System.out.println("committed..");
            return musicEntity;
        } catch (PersistenceException pe) {
            System.err.println("Persistence Exception : " + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
        return MusicRepository.super.findByMusicName(musicName);
    }

    @Override
    public List<MusicEntity> findAll() {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("transaction begin..");
            Query query = em.createNamedQuery("findAll");
            List<MusicEntity> entities=query.getResultList();

            System.out.println("persisted..");
            et.commit();
            System.out.println("committed..");
            return entities;
        } catch (PersistenceException pe) {
            System.err.println("Persistence Exception : " + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
        return MusicRepository.super.findAll();
    }

    @Override
    public List<String> findAllSinger() {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        try {
            et.begin();
            System.out.println("transaction begin..");
            Query query=em.createNamedQuery("findAllSinger");
            List<String> list=query.getResultList();
            System.out.println("persisted..");
            et.commit();
            System.out.println("committed..");
            return list;
        } catch (PersistenceException pe) {
            System.err.println("Persistence Exception : " + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }
}
