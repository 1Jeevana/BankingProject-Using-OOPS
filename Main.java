package com.jeevana;

public class Main {

    public static void main(String[] args) {

        Account jeevanasAccount = new Account("121212",0,"jeevana","jeevana@xyz.com","1212121");

        jeevanasAccount.DepositMoney(50);
        jeevanasAccount.DepositMoney(150);

        jeevanasAccount.WithDrawMoney(100);
    
    }
}
