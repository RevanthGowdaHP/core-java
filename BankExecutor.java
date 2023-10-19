package com.xworkz.yono;

import com.xworkz.yono.sbi.BankAccount;
import com.xworkz.yono.sbi.business.BusinessAccount;
import com.xworkz.yono.sbi.current.CurrentAccount;
import com.xworkz.yono.sbi.savings.SavingsAccount;

public class BankExecutor {
    public static void main(String[] args) {
        BankAccount revanthAccount = new SavingsAccount(8000);
        System.out.println("My Account");
        revanthAccount.credit(1500);
        System.out.println("ScholarShip : ");
         revanthAccount.credit(18900);
        revanthAccount.debit(3000);

        SavingsAccount mySavingsAccount=(SavingsAccount)revanthAccount;
        mySavingsAccount.calculateInterest();
        System.out.println("Available balance in Revanth Savings Account"+mySavingsAccount.getBalance());


        SavingsAccount mohanAccount = new SavingsAccount();
        System.out.println("Mohan's account");
        mohanAccount.credit(1000);
        revanthAccount.transfer(500, mohanAccount);
        System.out.println("Available balance in Mohan's account: Rs."+mohanAccount.getBalance());
        System.out.println(".............................");

        SavingsAccount mohanSavingsAccount=(SavingsAccount)mohanAccount;
        mohanSavingsAccount.calculateInterest();
        System.out.println("Balance after Interest in Mohan's account:"+mohanSavingsAccount.getBalance());

        SavingsAccount fatherAccount = new SavingsAccount();
        System.out.println("Father's account");
        fatherAccount.credit(321000);
        revanthAccount.transfer(10000,fatherAccount);
        System.out.println("Available balance in Fathers account: Rs."+fatherAccount.getBalance());
        System.out.println(".............................");

        SavingsAccount fatherSavingsAccount=(SavingsAccount)fatherAccount;
        fatherSavingsAccount.calculateInterest();
        System.out.println("Balance after Interest in Father's account:"+fatherSavingsAccount.getBalance());

//        SavingsAccount mothersAccount = new SavingsAccount();
//        System.out.println("Mother's account");
//        mothersAccount.credit(25000);
//        revanthAccount.transfer(5000,mothersAccount);
//        System.out.println("Available balance in Mothers account: Rs."+mothersAccount.getBalance());
//        System.out.println(".............................");
//
//        CurrentAccount sanjayAccount = new CurrentAccount();
//        System.out.println("Sanjay's account");
//        sanjayAccount.credit(4000);
//        revanthAccount.transfer(200,sanjayAccount);
//        System.out.println("Available balance in Sanjay's account: Rs."+sanjayAccount.getBalance());
//        System.out.println(".............................");
//
//        BusinessAccount krishnaHotel = new BusinessAccount();
//        System.out.println("Krishna Hotel");
//        krishnaHotel.credit(100000);
//        revanthAccount.transfer(150,krishnaHotel);
//        System.out.println("Available balance in Krishna Hotel account: Rs."+krishnaHotel.getBalance());
//        System.out.println(".............................");
//
//        SavingsAccount vittalDasAccount = new SavingsAccount();
//        System.out.println("VittalDas account");
//        vittalDasAccount.credit(6000);
//        revanthAccount.transfer(1600,vittalDasAccount);
//        System.out.println("Available balance in VittalDas  account: Rs."+vittalDasAccount.getBalance());
//        System.out.println(".............................");
//
//        BusinessAccount sljBackery = new BusinessAccount();
//        System.out.println("SLJ Backery account");
//        sljBackery.credit(50000);
//        revanthAccount.transfer(40,sljBackery);
//        System.out.println("Available balance in SLJ Backery account: Rs."+sljBackery.getBalance());
//        System.out.println(".............................");
//
//        SavingsAccount sistersAccount = new SavingsAccount();
//        revanthAccount.transfer(500,sistersAccount);
//        System.out.println("Available balance in Sisters account: Rs."+sistersAccount.getBalance());
//        System.out.println(".............................");
//
//        SavingsAccount cousinsAccount = new SavingsAccount();
//        revanthAccount.transfer(700,cousinsAccount);
//        System.out.println("Available balance in Cousins account: Rs."+cousinsAccount.getBalance());
//        System.out.println(".............................");
//
//        BusinessAccount donneBiryaniManeAccount = new BusinessAccount();
//        System.out.println("DonneBiryaniMane account");
//        donneBiryaniManeAccount.credit(800000);
//        revanthAccount.transfer(480,donneBiryaniManeAccount);
//        System.out.println("Available balance in Donnebiryani Mane account: Rs."+donneBiryaniManeAccount.getBalance());
//        System.out.println(".............................");
//
//
//        BusinessAccount bangarpeteChats = new BusinessAccount();
//        System.out.println("Bangarpete Chats account");
//        bangarpeteChats.credit(200000);
//        revanthAccount.transfer(80,bangarpeteChats);
//        System.out.println("Available balance in Bangarpete Chats account: Rs."+bangarpeteChats.getBalance());
//        System.out.println(".............................");

        System.out.println("Current Balance in Revanth Account: Rs."+revanthAccount.getBalance());
        System.out.println(".............................");

    }
}
