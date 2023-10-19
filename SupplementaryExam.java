package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class SupplementaryExam extends Exam {
    public int noOFAttempts = 2;

    public SupplementaryExam(HallTicket ticket) {
        super(ticket);
    }


    @Override
    public boolean write(HallTicket ticket) {
        System.out.println("supplementary");
        if (noOFAttempts > 1) {
            return super.write(ticket);


        }
        return false;
    }
    public void write(HallTicket ticket, int fees){

    }
}