package com.xworkz.crud.executor;

import com.xworkz.crud.Employee;

public class Executor {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.addName("Humangasor");
        emp.addName("SethRollings");
        emp.addName("Batista");
        emp.addName("UnderTaker");
        emp.addName("RandyOrton");
        emp.addName("Edge");
        emp.addName(null);
        emp.addName("Jhon Cena");
        System.out.println("Delete Operation");
        emp.delete("UnderTaker");
        System.out.println("......................");
        emp.addName("Roman Rings");
        emp.addName("Kane");
        emp.addName("GoldBerg");
        emp.addName("Brock Lesnar");
        emp.update("SethRollings","SanjayTakur");
        emp.read();
        emp.find("Batista");
        emp.find("Gunda");
        emp.duplicate("Batista");
        emp.duplicate("SanjayBobber");
        emp.read();
    }
}
