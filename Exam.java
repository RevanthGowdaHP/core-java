package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {

    HallTicket ticket;//class type variable
    public int fees;

    public Exam(HallTicket ticket){

        this.ticket=ticket;
    }

    public boolean write(HallTicket ticket){

        boolean isAllowed=false;

        if(fees>=1200){

            if(null!=ticket){
                this.ticket=ticket;
                isAllowed=true;
                System.out.println("HallTicket is issued..candidate is allowed to write exam..");
                ticket.displayDetails();
            }
            else{
                System.out.println("No details found in hallticket..!");
            }

        }
        else{

            System.out.println("Fee is not paid, we cannot issue the hallticket.");
        }
        return isAllowed;
    }

    }
