package com.brigittemccoll.Day6;

import java.util.ArrayList;
import java.util.Collections;

public class Demo2 {
    public static void main(String[] args) {

        ArrayList<String> letters = new ArrayList<>();
        letters.add("C");
        letters.add("D");
        letters.add("A");
        letters.add("E");
        letters.add("B");

        System.out.println("Before sorting...");
        for (String letter: letters){
            System.out.println(letter);
        }

        Collections.sort(letters);
        System.out.println("After sorting...");
        for (String letter: letters){
            System.out.println(letter);
        }
    }
}
