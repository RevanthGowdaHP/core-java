package com.xworkz.conditioner.repository;

import com.xworkz.conditioner.entity.ConditionerEntity;
import com.xworkz.conditioner.util.EMFUtil;

import javax.persistence.*;
import java.util.List;

public class ConditionerRepositoryImpl implements ConditionerRepository {
    private EntityManagerFactory emf = EMFUtil.getEMF();

    @Override
    public void save(ConditionerEntity entity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin.");
            em.persist(entity);
            System.out.println("Entity persisted..");
            et.commit();
            System.out.println("Committed..");
            System.out.println(entity);
        } catch (PersistenceException pe) {
            System.err.println("Persistence exception : " + pe.getMessage());
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void saveList(List<ConditionerEntity> list) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            list.forEach(entity -> em.persist(entity));
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void updateNetQuantityByBrand(String brand, int quantity) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            Query query = em.createNamedQuery("updateNetQuantityByBrand");
            query.setParameter("nq", quantity);
            query.setParameter("b", brand);
            query.executeUpdate();
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void updateRecommendedForByBrand(String brand, String rc) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            Query query = em.createNamedQuery("updateRecommendedForByBrand");
            query.setParameter("b", brand);
            query.setParameter("rf", rc);
            query.executeUpdate();
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public List<ConditionerEntity> findAllByBrand(String brand) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            Query query = em.createNamedQuery("findAllByBrand");
            query.setParameter("b", brand);
            List<ConditionerEntity> list = query.getResultList();
            list.forEach(each -> System.out.println(each));
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");
            return list;

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public List<ConditionerEntity> findAllByHairType(String type) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            Query query = em.createNamedQuery("findAllByHairType");
            query.setParameter("ht", type);
            List<ConditionerEntity> list = query.getResultList();
            list.forEach(each -> System.out.println(each));
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public String findScentById(int id) {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            Query query = em.createNamedQuery("findScentById");
            query.setParameter("i", id);
            Object obj = query.getSingleResult();
            String scent = (String) obj;
            System.out.println(scent);
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");
            return scent;
        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public List<Integer> getAllSize() {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            Query query = em.createNamedQuery("getAllSize");
            List<Integer> list = query.getResultList();
            list.forEach(each -> System.out.println(each));
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    @Override
    public List<String> getAllBrand() {
        EntityManager em = this.emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            System.out.println("transaction begin");
            Query query = em.createNamedQuery("getAllBrand");
            List<String> list = query.getResultList();
            list.forEach(each -> System.out.println(each));
            System.out.println("Persisted");
            et.commit();
            System.out.println("committed");

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            et.rollback();
        } finally {
            em.close();
        }
        return null;
    }
}
