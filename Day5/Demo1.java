package com.brigittemccoll.Day5;

class MultiThreadDemo{
  //  @Override
    public void run(){
        System.out.println("Thread is running...");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        MultiThreadDemo threadDemo = new MultiThreadDemo();
      //  threadDemo.start();
    }
}
