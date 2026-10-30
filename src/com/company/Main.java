package com.company;

import java.text.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance( );
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        ArrayList <BankAccount> aryLst = new ArrayList();

        do
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.print("Please enter the name to whom the account belongs. ") ;
            name = kbReader.nextLine( );

            if( !name.equalsIgnoreCase("EXIT") ) {
                System.out.print("Please enter the amount of the deposit. ");
                double amount = kbReader.nextDouble();
                System.out.println(" ");
                BankAccount acc = new BankAccount(name, amount);
                aryLst.add(acc);
            }
        }while(!name.equalsIgnoreCase("EXIT"));

        BankAccount ba = aryLst.get(0);
        double maxBalance = ba.balance; int index = 0;
        String maxName = ba.name;

        for(int i = 0; i < aryLst.size(); i++) {
            if (aryLst.get(i).balance > maxBalance) {
                maxBalance = aryLst.get(i).balance;
                maxName = aryLst.get(i).name;
                index = i;
            }
        }
        System.out.println("The person with the largest amount of money is " + maxName);
        System.out.println("The amount is $" + aryLst.get(index).balance);
    }
}