package Assignment1;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList2 {
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
        //Question 11
        //Reverse elements in array
        System.out.println("\n***Print in Reverse Order***");
        for (int i = colors.size() -1; i>=0; i--){
            System.out.println(colors.get(i));
        }

        //Question 12
        //extract portion of elements in array
        System.out.println("\n***Print Portion of ArrayList***");
        System.out.println(colors.subList(2,5));

        //Question 13
        //Swap two element in array
        System.out.println("\n***After Swapping 2 Elements (2 and 5)***");
        Collections.swap(colors , 2, 5);
        for (String color: colors){
            System.out.println(color);
        }

        //Question 10
        //Shuffle elements in array
        System.out.println("\n***After Shuffling ArrayList***");
        Collections.shuffle(colors);
        for (String color: colors){
            System.out.println(color);
        }
    }
}
