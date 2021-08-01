package com.brigittemccoll.CalculatorAssignment;

import java.util.Scanner;

class EMICalcs{
    public void EMI(double loan, double interest, double year){
        double emi;
        double rate = interest/(12*100);
        double time = year*12;
        emi = (loan* rate *Math.pow(1+rate, time))/(Math.pow(1+rate,time)-1);
        System.out.println("EMI : " + emi);
    }
}
class EMIMenu{
    public void menu(){
        //creating scanner to read in numbers
        Scanner scanner = new Scanner(System.in);
        double loan;
        double interest;
        double year;

        //menu and user input
        System.out.println("Loan Amount: ");
        loan = scanner.nextDouble();
        System.out.println("ROI: ");
        interest = scanner.nextDouble();
        System.out.println("Tenure: ");
        year = scanner.nextDouble();

        //calling EMI Calcs
        EMICalcs cals = new EMICalcs();
        cals.EMI(loan, interest, year);

        //close scanner
        scanner.close();
    }
}
public class EMICalcApp {
    public static void main(String[] args) {
        EMIMenu startingmenu = new EMIMenu();
        startingmenu.menu();
    }
}
