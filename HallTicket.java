package com.xworkz.examapp.hallticket;

public class HallTicket {
    int hallTicketId;
    String candidateName;
    String usn;
    String subjectName;




    public HallTicket(int hallTicketId,String candidateName,String usn,String subjectName){

        this.candidateName=candidateName;
        this.hallTicketId=hallTicketId;
        this.usn=usn;
        this.subjectName=subjectName;


    }
    public void displayDetails(){

        System.out.println("HallTicket Id: "+hallTicketId);
        System.out.println("Candidate Name: "+candidateName);
        System.out.println("Candidate USN: "+usn);
        System.out.println("Subject Name: "+subjectName);


    }
}
