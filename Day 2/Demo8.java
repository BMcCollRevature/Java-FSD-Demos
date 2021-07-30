package com.brigittemccoll.Day2;


class Calculation{
    public void test(){
        System.out.println("1st method");
    }

    public void test(int a){
        System.out.println("2nd method");
    }

    public void test(String a){
        System.out.println("3rd method");
    }
    public void test(int a, String b){
        System.out.println("4th method");
    }

    public void test(String a, int b){
        System.out.println("5th method");
    }
}
public class Demo8 {
    public static void main(String[] args) {
    Calculation cal = new Calculation();
    cal.test();
    cal.test(10);
    cal.test("Hello");
    cal.test(10,"A");
    cal.test("a", 10);
    }

}
