package com.brigittemccoll.Assignment1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> color = new TreeSet<>();
        color.add("Pink");
        color.add("Blue");
        color.add("Red");
        color.add("White");
        color.add("Purple");

        //Printing out TreeSet
        System.out.println("Original  TreeSet:");
        for (String treeset: color){
            System.out.println(treeset);
        }

        //Iterate through TreeSet
        System.out.println("\nIterating through TreeSet:");
        Iterator<String> set = color.iterator();
        while(set.hasNext()){
            System.out.println(set.next());
        }

        //Adding a TreeSet to another TreeSet
        TreeSet<String> color2 = new TreeSet<>();
        color2.add("Black");
        color2.add("Orange");
        color2.add("Yellow");
        color2.add("Green");


        color.addAll(color2);
        System.out.println("\nCombining Two Treesets:");
        for (String treeset: color){
            System.out.println(treeset);
        }

        //Printing in Reverse
        System.out.println("\nPrinting in Reverse:");
        Iterator<String> set2 = color.descendingIterator();
        while(set2.hasNext()){
            System.out.println(set2.next());
        }

        //Getting First and Last Element TreeSet
        System.out.println("\nFirst Element of TreeSet: \n" + color.pollFirst());
        System.out.println("\nLast Element of TreeSet: \n" + color.pollLast());
    }
}
