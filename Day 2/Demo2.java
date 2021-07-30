package com.brigittemccoll.Day2;

//without static
//class Counter{
//    int count = 0; //instance variable
//
//    public Counter(){
//        count++; //increment value
//        System.out.println(count);
//    }
//}

//with static variable
class Counter{
    static int count = 0;

    public Counter(){
        count++; //increment value
        System.out.println(count);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
