package com.brigittemccoll.Day1;

public class Demo10 {
    public static void main(String[] args) {

        for (int i =1;i<=5;i++){
            for (int j =1; j>=i;j++)
            {
                System.out.printf("* ");
                break;
            }
            System.out.println();
        }
    }
}
