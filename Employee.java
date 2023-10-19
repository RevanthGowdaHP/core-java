package com.xworkz.crud;

public class Employee {
    String[] employeeName = new String[10];
    int index;
    boolean isdup;

    public void addName(String naam) {
        if (index < employeeName.length) {
            if (naam != null) {
                isdup = duplicate(naam);
                if (isdup == false) {
                    employeeName[index] = naam;
                    System.out.println("The name of the employee is:" + naam);
                    index++;
                }
            } else {
                System.out.println("Employee name cannot be null");
            }
        } else {
            System.out.println("Employee's full");
            System.out.println("We can not hire :" + naam);
        }
    }

    public void update(String oldB, String newB) {
        int wwe = 0;
        boolean isound = false;
        for (; wwe < employeeName.length; wwe++) {
            if (employeeName[wwe] == oldB) {
                employeeName[wwe] = newB;
                isound = true;
            }
        }
        if (isound == true) {
            System.out.println("'" + oldB + "' replaced by'" + newB + "'");
        } else {
            System.out.println("'" + oldB + "' not found");
        }
    }

    public void read() {
        for (int re = 0; re < employeeName.length; re++) {
            System.out.println("Employee names :" + employeeName[re]);
        }
    }

    public void find(String search) {
        boolean isFound = false;
        for (int sea = 0; sea < employeeName.length; sea++) {
            if (employeeName[sea] == search) {
                System.out.println("'" + search + "' is the person you searched for");
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("'" + search + "' person is not in the list");
        }
    }

    public boolean duplicate(String dupli) {
        boolean isexit = false;
        for (int dup = 0; dup < employeeName.length; dup++) {
            if (employeeName[dup] == dupli) {
                System.out.println("'" + dupli + "' already exist");
                isexit = true;
            }
        }
        return isexit;
    }

    public void delete(String name) {
        String afterDelete[] = new String[employeeName.length - 1];
        int ind = 0;
        for (int del = 0; del < employeeName.length; del++) {
            // humagasot!=under
            if (employeeName[del] != name) {
                afterDelete[ind++]=employeeName[del];
            }

        }
        for (int are = 0; are < afterDelete.length; are++) {
            System.out.println("Employee names :" + afterDelete[are]);


    }
}}
