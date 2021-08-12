package com.brigittemccoll;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//step 1: load driver
     //Class.forName("com.mysql.jdbc.Driver");

     //Step 2: Create Connection
        String host = "jdbc:mysql://localhost:3306/";
        String database = "revature";
        //jdbc:mysql://localhost:3306/revature
        String connectionString = host + database;

        String username = "root";
        String password = "Colormemine";

        Connection conn = DriverManager.getConnection(connectionString, username, password);

        //Step 3: Create Statement Object
        Statement statement = conn.createStatement();

        //Step 4: Execute Queries
        //Demo 1: Create Table
//        String query = "create table employee(id INTEGER PRIMARY KEY AUTO_INCREMENT, name CHAR(20), email CHAR(50));";
//        statement.executeUpdate(query);
//        System.out.println("table created successfully");
    //Demo 2: insert date into table
        String query = "insert into employee (name, email) values (?,?)";
//
//        //get prepare statement object
        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        //set values to query
        preparedStatement.setString(1,"Mark Smith");
        preparedStatement.setString(2,"m@gmail.com");
//        //execute query
        int rowAffected = preparedStatement.executeUpdate();
        System.out.println("("+rowAffected+") rows affected");

        //Demo3: Update Data of Table
//        String query = "update employee set name = ?, email = ? where id = ?";
//
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setString(1,"Paul");
//        preparedStatement.setString(2,"p@gmail.com");
//        preparedStatement.setInt(3,1);
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("("+rowAffected+") rows affected");

        //Demo 4:Deleting from Table
//        String query = "delete from employee where id = ?";
//        PreparedStatement preparedStatement = conn.prepareStatement(query);
//        preparedStatement.setInt(1, 1);
//        int rowAffected = preparedStatement.executeUpdate();
//        System.out.println("("+rowAffected+") rows affected");

        //Demo 5: read data from table
        String query2 = "select * from employee";
        ResultSet resultSet = statement.executeQuery(query2);

        while(resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);

            System.out.println("ID: " +id +", Name: " + name +", Email: " + email);
        }







        //Step 5: Close Connection
        if (conn.isClosed()){
            System.out.println("Connection Closed");
        }else{
            System.out.println("Connection Open");
        }


    }
}
