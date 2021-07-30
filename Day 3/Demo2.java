package com.brigittemccoll.Day3;

public class Demo2 {
    public static void main(String[] args) {

        String str1 = "Hello";
        str1.concat("World"); // using concat to append string at the end

        System.out.println(str1); //prints Hello only bc strings are immutable object
                                    // str1 didn't get modified
        String str = "Hello ";
        str = str.concat("World");
        System.out.println(str);
    }
}
