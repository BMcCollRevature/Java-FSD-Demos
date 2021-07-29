package Assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        //Question 1

        HashMap<String, String> dessert = new HashMap<>();
        dessert.put("Sarah", "Cookies");
        dessert.put("Tom", "Brownies");
        dessert.put("Brandon", "Cake");

        System.out.println("***Original HashMap***");
        //Printing Map
        Set set = dessert.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            HashMap.Entry entry = (HashMap.Entry) iterator.next();
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

        //Question 2
        //Printing size of map
        System.out.println("\nMap Size: " + dessert.size());

        //Question 3
        //Combining Two Maps
        HashMap<String, String> favdessert = new HashMap<>();
        favdessert.put("Carla", "Cheese Cake");
        favdessert.put("Meg", "CupCakes");
        favdessert.put("Phil", "Ice Cream");

        System.out.println("\n***Combining Two HashMaps***");

        dessert.putAll(favdessert);

        Set set2 = dessert.entrySet();
        Iterator iterator2 = set.iterator();
        while(iterator2.hasNext()){
            HashMap.Entry entry = (HashMap.Entry) iterator2.next();
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
