package com.brigittemccoll.Day2;

class Student2{
    private int id;
    private String name;
    private int passMark;

    public int getId() {
        return id;
    }

    public void setId(int id) throws Exception {
        if(id < 0)
            throw new Exception("id cannot be -ve");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        if (name.isEmpty())
            throw new Exception("name cannot be blank");
        this.name = name;
    }

    public int getPassMark() {
        return passMark;
    }
}
public class Demo28 {
    public static void main(String[] args) throws Exception {
        Student2 student = new Student2();
//        student.id = -1;
//        student.name = null;
//        student.getPassMark = 20;

 //      System.out.println("ID = " + student.id + ", Name = " +student.name + ", PassMark = " + student.passMark);

        student.setId(1);
        student.setName("");
        System.out.println("ID = " + student.getId() + ", Name = " +student.getName() + ", PassMark = " + student.getPassMark());
    }
}
