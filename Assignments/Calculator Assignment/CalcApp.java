package com.brigittemccoll.CalculatorAssignment;

import java.util.Scanner;

class Calculations{
    public void add(double num1, double num2){
        System.out.println("Result : " +(num1 +num2));
    }
    public void sub(double num1, double num2){
        System.out.println("Result : " +(num1 -num2));
    }
    public void mul(double num1, double num2){
        System.out.println("Result : " +(num1 *num2));
    }
    public void div(double num1, double num2){
        System.out.println("Result : " +(num1 /num2));
    }
}
class StartMenu{
    public static void menu() {
        Calculations calc = new Calculations();

        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        Scanner num1 = new Scanner(System.in);
        double number1 = num1.nextDouble();

        System.out.println("Please enter second number: ");
        Scanner num2 = new Scanner(System.in);
        double number2 = num2.nextDouble();

        while (choice != 5) {
        System.out.println("\nPlease Choose Option Below:");
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("5. Quit");

        choice = scanner.nextInt();

        //option choosing

            switch (choice) {
                case 1:
                    calc.add(number1, number2);
                    break;
                case 2:
                    calc.sub(number1, number2);
                    break;
                case 3:
                    calc.mul(number1, number2);
                    break;
                case 4:
                    calc.div(number1, number2);
                    break;
                case 5:
                    System.out.println("Thank you for using this application");
                    break;
                default:
                    System.out.println("Invalid Entry, please enter 1,2,3,4,or 5");
                    break;
            }

        }
        scanner.close();
    }
}
public class CalcApp {
    public static void main(String[] args) {
        StartMenu startMenu = new StartMenu();
        startMenu.menu();
    }
}
