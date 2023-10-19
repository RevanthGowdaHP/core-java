package com.xworkz.yono.sbi;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void debit(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Amount: Rs" + amount + " debited from Revanth account  ");
            System.out.println("Current balance in Revanth account is :Rs." + balance);
            System.out.println("*****************************************");
        }
        else {
            System.out.println("ALERT : Insufficient balance :Rs "+balance);
        }
    }

    public void credit(int amount) {

        System.out.println("Amount credited: Rs." + amount);
        balance += amount;


    }

    public boolean transfer(int amount, BankAccount beneficiaryAccount) {
        boolean istranfer = false;
        if (balance >= amount) {
            this.debit(amount);
            istranfer = true;
        }
        else {
            System.out.println("ALERT : Insufficient balance : Rs."+balance);
        }
        if (istranfer == true) {
            beneficiaryAccount.credit(amount);
        }
        else{
            System.out.println(" Rs."+amount+" not credited "+beneficiaryAccount);
        }

      return istranfer;
    }
}








