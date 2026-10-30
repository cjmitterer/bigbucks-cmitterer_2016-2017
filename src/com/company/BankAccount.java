package com.company;

public class BankAccount {

    public BankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }
    //POINTLESS
    public void deposit(double dp) {
        balance = balance + dp;
    }
    //POINTLESS
    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public String name;
    public double balance;
}