package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.exam.SupplementaryExam;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamExceutor {
    public static void main(String vtu[]){

        HallTicket ticket=new HallTicket(1234,"Revanth","4mc19","Maths");

        //Exam exam=new Exam(ticket);
        Exam exam = new SupplementaryExam(ticket);
        exam.fees=1200;
        exam.write(ticket);
        SupplementaryExam supExam = (SupplementaryExam) exam;
        supExam.write(ticket,1200);
    }
}
