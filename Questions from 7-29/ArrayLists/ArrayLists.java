package Assignment1;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
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

        //Question 1
        //Iterating through elements in array list
        System.out.println("\n***Iterating through ArrayList***");
        Iterator iterator = colors.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Question 2
        //Inserting element in first position
        System.out.println("\n***Inserting Element at First Position***");
        colors.add(0,"Red");
        for (String color: colors){
            System.out.println(color);
        }

        //Question 3
        //retrieving element at specific index - Green
        System.out.println("\n***Getting Element from Specific Location***");
        System.out.println("Looking for element at index 3: "+ colors.get(3));

        //Question 4
        //Update specific element by given element - Pink->Violet
        System.out.println("\n***Updating Specific Element***");
        colors.set(6 , "Violet");
        for (String color: colors){
            System.out.println(color);
        }
        System.out.println("\t updated last element");

    }
}
