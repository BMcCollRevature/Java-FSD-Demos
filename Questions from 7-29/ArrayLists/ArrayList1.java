package Assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Pink");

        System.out.println("***Original ArrayList***");
        for (String color: colors){
            System.out.println(color);
        }

        //Question 6
        //Removing 3rd Element - Blue
        System.out.println("\n***Removing 3rd Element***");
        colors.remove(3);
        for (String color: colors){
            System.out.println(color);
        }

        //Question 7
        //Search for an Element
        System.out.println("\n***Searching for an Element***");
        System.out.println("Is Yellow in the ArrayList: " + colors.contains("Yellow"));

        //Question 8
        //Sorting Array
        System.out.println("\n***After Sorting ArrayList***");
        Collections.sort(colors);
        for (String color: colors){
            System.out.println(color);
        }

        //Question 9
        //Copy Array List into Another
        System.out.println("\n***Copying in a 2nd ArrayList***");
        ArrayList<String> color2 = new ArrayList<>();
        colors.add("Red");
        colors.add("Gray");
        colors.add("White");

        colors.addAll(color2);
        for (String color: colors){
            System.out.println(color);
        }


    }
}
