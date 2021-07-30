package com.brigittemccoll.Day4;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Mark");
        names.add("Paul");
        names.add("Stacy");
        names.add("Watson");

        //getting element on index
        System.out.println(names.get(1));

        //adding element at index
        names.add(1,"John");
        System.out.println(names);

        //merge two lists
        ArrayList<String> newNames = new ArrayList<>();

        newNames.add("Rangel");
        newNames.add("Smith");
       // names.addAll(newNames);

        //adding second list at index
        names.addAll(0, newNames);

        System.out.println(names);

        //remove
        //names.remove("Mark");
        //names.remove(0);

        names.removeAll(newNames);
        System.out.println(names);

        //removing element based on condition
        names.removeIf(name-> name.contains("Paul"));
        System.out.println(names);

    }
}
