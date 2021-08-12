package com.brigittemccoll;

import java.sql.*;

public class EmployeeDAOImpl implements EmployeeDAO {
    private static Statement statement = null;
    Connection connection = null;

    public EmployeeDAOImpl(){
        try{
            this.connection=ConnectionFactory.getConnection();
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public void addEmployee(Employee employee) throws SQLException {
        String sql = "insert into employee (name, username, password) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,employee.getName());
        preparedStatement.setString(2,employee.getUsername());
        preparedStatement.setString(3,employee.getPassword());
        int count = preparedStatement.executeUpdate();
        ResultSet rs = preparedStatement.getGeneratedKeys();
        while(rs.next()){
            System.out.println("Your user ID is " + rs.getInt(1));
        }
        if(count >0) {
            System.out.println("account created");
        }
        else
            System.out.println("Oop! Something went wrong");
    }

    @Override
    public boolean checkUsernamePassword(Employee employee, int id, String username, String password) throws SQLException {
        boolean checkUser = false;
        String sql = "select emp_id,username,password from employee where emp_id = ? AND username = ? AND password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,employee.getEmp_id());
        preparedStatement.setString(2,employee.getUsername());
        preparedStatement.setString(3,employee.getPassword());
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()){
            if(id == employee.getEmp_id() && username == employee.getUsername() && password == employee.getPassword()){
                checkUser = true;
                System.out.println("Logged in");}
            else
                System.out.println("Incorrect ID, Username, or Password");
        }
        return checkUser;
    }
}
