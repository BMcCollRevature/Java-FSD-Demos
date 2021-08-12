package com.brigittemccoll;

import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //write data you want to insert
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String name;
        String email;
        boolean start = true;
        int option = 0;
        while (start) {
            Employee employee = new Employee();
            System.out.println("**********************************");
            System.out.println("Please choose an option below:");
            System.out.println("1.Add Employee");
            System.out.println("2.Update Employee");
            System.out.println("3.Delete Employee");
            System.out.println("4.Read Employee");
            System.out.println("5.Read Employee by Specific ID");
            System.out.println("6.Exit");
            System.out.println("**********************************");


            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("please enter name: ");
                    Scanner sc = new Scanner(System.in);
                    name = sc.nextLine();

                    System.out.println("please enter email: ");
                    Scanner sc2 = new Scanner(System.in);
                    email = sc2.nextLine();

                    employee.setName(name);
                    employee.setEmail(email);

                    dao.addEmployee(employee);
                    break;
                case 2:
                    System.out.println("please enter ID: ");
                    Scanner sc3 = new Scanner(System.in);
                    id = sc3.nextInt();

                    System.out.println("please enter new name: ");
                    Scanner sc4 = new Scanner(System.in);
                    name = sc4.nextLine();

                    System.out.println("please enter new email: ");
                    Scanner sc5 = new Scanner(System.in);
                    email = sc5.nextLine();

                    employee.setId(id);
                    employee.setName(name);
                    employee.setEmail(email);
                    dao.updateEmployee(employee);
                    break;
                case 3:
                    System.out.println("please enter ID: ");
                    Scanner sc6 = new Scanner(System.in);
                    id = sc6.nextInt();

                    employee.setId(id);
                    dao.deleteEmployee(employee);
                    break;
                case 4:
                    dao.getEmployees();
                    break;
                case 5:
                    System.out.println("please enter ID: ");
                    Scanner sc7 = new Scanner(System.in);
                    id = sc7.nextInt();
                    dao.employeeById(id);
                    break;
                case 6:
                    System.out.println("Thank you");
                    System.out.println("Exiting...");
                    start = false;
                    break;
                default:
                    System.out.println("Please input numbers 1-6");
            }


        }
    }
}
