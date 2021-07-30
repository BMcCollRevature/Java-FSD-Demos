package com.brigittemccoll.Day4;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Mark");
        names.add("Paul");
        names.add("Stacy");
        names.add("Watson");

        //System.out.println(names.size());
        for (int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        //foreach
        names.forEach(name-> {
            System.out.println(name);
        });
    }
}
