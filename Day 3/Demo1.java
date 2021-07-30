package com.brigittemccoll.Day3;

public class Demo1 {
    public static void main(String[] args) {

        String s1 = "Hello"; //creating a string using java string literal
        char ch[] = {'H', 'e','l','l','o'};

        String s2 = new String(ch); //converting char to string
        String s3 = new String("World"); // creating java string using new keyword

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
