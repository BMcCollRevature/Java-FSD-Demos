package com.brigittemccoll.Assignment1;

import java.util.Iterator;
import java.util.LinkedList;

//        5. Write a Java program to insert the specified element at the specified position in the linked list.
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Purple");
        //original list
        System.out.println("Original List: \n" + colors);

        //Adding specific element to end of list
        colors.addLast("Black");
        System.out.println("\nAdding Element to end of List: \n" + colors);

        //Iterating through List
        System.out.println("\nIterating through List:");
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Iterating from Specific Location
        System.out.println("\nIterating through List from Specified Location (Index 2):");
        Iterator<String> color = colors.listIterator(2);
        while(color.hasNext()){
            System.out.println(color.next());
        }

	//Iterating Through List in Reverse
        System.out.println("\nIterating through List in Reverse:");
        Iterator<String> reverse = colors.descendingIterator();
        while(reverse.hasNext()){
            System.out.println(reverse.next());
        }

	//Adding Color in Specific Location
        colors.add(4, "Teal");
        System.out.println("\nAdding Element at Specified Location (Index 4): \n" + colors);

    }

}
