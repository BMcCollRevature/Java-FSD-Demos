
package com.brigittemccoll.Day2;

class Employee{
    public int empID;
    public String name;
    static public String companyName = "Revature";

    public Employee(int empID, String name){
        this.empID = empID;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("ID: " + empID + ", Name: "+ name+ ", Company Name: " + companyName);
    }

}
public class Demo4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Mark");
        Employee emp2 = new Employee(2, "Paul");

        emp1.printInfo();
        emp2.printInfo();

        Employee.companyName = "ABC";
        emp1.printInfo();
        emp2.printInfo();
    }
}
