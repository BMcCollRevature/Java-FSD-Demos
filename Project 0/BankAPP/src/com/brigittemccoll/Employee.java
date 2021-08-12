package com.brigittemccoll;

public class Employee {
    private int emp_id;
    private String name;
    private String username;
    private String password;

    public Employee(){}

    public Employee(int emp_id, String name, String username, String password){
        this.emp_id = emp_id;
        this.name = name;
        this.username = username;
        this.password = password;

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
