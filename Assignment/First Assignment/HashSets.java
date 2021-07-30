package com.brigittemccoll.Assignment1;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>();
        name.add("Tom");
        name.add("Randy");
        name.add("Karl");
        name.add("Jade");

        System.out.println("Original HashSet:\n" + name);

        //Iterating Through hash List
        System.out.println("\nIterating through Hashset: ");
        Iterator<String> iterator = name.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Size of HashSet
        System.out.println("\nSize of HashSet: " + name.size());

        //Empty HashSet
        System.out.println("\nEmptying All Elements: \n"+ name.removeAll(name));


    }
}
