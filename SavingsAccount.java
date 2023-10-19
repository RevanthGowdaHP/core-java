package com.xworkz.yono.sbi.savings;

import com.xworkz.yono.sbi.BankAccount;

public class SavingsAccount extends BankAccount {

    double interetRate= 4.2;

    public SavingsAccount(){

    }
    public SavingsAccount(double minBalance) {
        this.credit((int)minBalance);

    }

    public void calculateInterest(){
              double interest = (interetRate* getBalance())/100;
              this.credit((int)interest);

    }
}
