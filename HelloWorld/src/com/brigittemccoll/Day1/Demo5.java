package com.brigittemccoll.Day1;

public class Demo5 {
    public static void main(String[] args) {

        int score = 50;

        if (score > 90)
            System.out.println("A Grade");
        else if(score <90 && score > 75)
            System.out.println("B Grade");
        else if(score < 75 && score >50)
            System.out.println("c Grade");
        else
            System.out.println("D Grade");
    }
}
