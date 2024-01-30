package com.xworkz.temple.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtil {

    // singleTon class => It is the design pattern used to create only one object for class
    // This class consists of one method . This method can be accessed without creating the object of that class
   private static EntityManagerFactory entityManager;  // make the data member private to achieve encapsulation, make it as static .

    public static EntityManagerFactory getEntityManager() {  // create only getter so that not could modify the ref using setter.
        return entityManager; // make the method static so that is method can be used without creating the object.
    }

    static { // initialize the static data member inside the static block ,
        // static block is executed during the class loading that to only once

        entityManager = Persistence.createEntityManagerFactory("x-workz");
    }
}
