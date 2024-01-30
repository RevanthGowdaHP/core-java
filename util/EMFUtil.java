package com.xworkz.conditioner.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

 private static EntityManagerFactory emf;

    public static EntityManagerFactory getEMF(){
       return emf;
    }

    static {
        emf = Persistence.createEntityManagerFactory("x-workz");
    }
}
