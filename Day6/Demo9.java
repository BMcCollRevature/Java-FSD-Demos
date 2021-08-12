package com.brigittemccoll.Day6;

//1st way
//    interface Rectangle{
//        public void draw();
//    }
//    class Test implements Rectangle{
//        @Override
//        public void draw() {
//            System.out.println("Drawing...");
//        }
//    }
//2nd way
interface Rectangle{
    public void draw();
}
public class Demo9 {
    public static void main(String[] args) {
        //1st way
//    Test test = new Test();
//    test.draw();

        //2nd way without Lambda declaring anonymous class
//        Rectangle rectangle = new Rectangle() {
//            @Override
//            public void draw() {
//                System.out.println("Drawing...");
//            }
//        };
//        rectangle.draw();
//
        //3rd way using lambda
        Rectangle rectangle = ()->{
            System.out.println("Drawing...");
    } ;
        rectangle.draw();
    }

}
