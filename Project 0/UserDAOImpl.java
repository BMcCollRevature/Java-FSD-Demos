package com.brigittemccoll;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private static Statement statement = null;
    Connection connection = null;

    public UserDAOImpl(){
        try{
            this.connection = ConnectionFactory.getConnection();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public void addUser(User user) throws SQLException {
        String sql = "insert into user (name, username, password) values (?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.getUsername());
        preparedStatement.setString(3,user.getPassword());
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
    public void addAccount(User user) throws SQLException {
        String sql = "update user set account_type = ?, balance = ?,account_status =? where user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,user.getAccount_type());
        preparedStatement.setDouble(2,user.getBalance());
        preparedStatement.setString(3,user.getAccount_status());
        preparedStatement.setInt(4,user.getUser_id());
        int count = preparedStatement.executeUpdate();
        if(count >0)
            System.out.println("account created\n" +"Your current balance is: " + user.getBalance());
        else
            System.out.println("Oop! Something went wrong");
    }

    @Override
    public void viewBalance(User user, int id) throws SQLException {
        String sql = "Select balance from user where user_id = " + id;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        rs.next();
        int usid = rs.getInt(1);
        String account = rs.getString(1);
        System.out.println("Your current balance in " +user.getAccount_type() +" is " + user.getBalance());
    }

    @Override
    public double getBalance(User user, int id) throws SQLException {
        String sql = "Select balance from user where user_id = " + id;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        rs.next();
        Double balance = rs.getDouble(1);

        return rs.getDouble(1);
       // return user.getBalance();
    }

    @Override
    public void updateBalance(User user) throws SQLException {
        String sql = "update user set balance = ? where user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setDouble(1,user.getBalance());
        preparedStatement.setInt(2,user.getUser_id());
        int count = preparedStatement.executeUpdate();
        if(count >0)
            System.out.println("updated Balance ");
        else
            System.out.println("Oop! Something went wrong");

    }

    @Override
    public void updateAccountStatus(User user, String status, int id) throws SQLException {
        String sql = "update user set account_status = ? where user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,user.getAccount_status());
        preparedStatement.setInt(2,user.getUser_id());
        int count = preparedStatement.executeUpdate();
        if(count >0)
            System.out.println("updated Status ");
        else
            System.out.println("Oop! Something went wrong");
    }

    @Override
    public boolean checkUsernamePassword(User user, int id, String username, String password) throws SQLException {
        boolean checkUser = false;
        String sql = "select user_id,username,password from user where user_id = ? AND username = ? AND password = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,user.getUser_id());
        preparedStatement.setString(2,user.getUsername());
        preparedStatement.setString(3,user.getPassword());
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()){
            if(id == user.getUser_id() && username == user.getUsername() && password == user.getPassword()){
                    checkUser = true;
            System.out.println("Logged in");}
            else
                System.out.println("Incorrect ID, Username, or Password");
        }
        return checkUser;
    }

    @Override
    public List<User> getUsers() throws SQLException {
        String sql = "select * from user";
        List<User>users = new ArrayList<>();
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String username = resultSet.getString(3);
            String password = resultSet.getString(4);
            String account_status = resultSet.getString(5);
            double balance = resultSet.getDouble(6);
            String account_type = resultSet.getString(7);
            int transaction_id = resultSet.getInt(8);

            User user = new User(id, name, username, password, account_status, account_type, balance, transaction_id);
            users.add(user);
        }
        for (User emp: users) {
            System.out.println("ID: " + emp.getUser_id() + ", Name: " + emp.getName() + ", Username: " + emp.getUsername() + ", Password: " + emp.getPassword() +
                    ", Account Status: " + emp.getAccount_status() + ", Account Type: " + emp.getAccount_type() +
                    ", Balance: " + emp.getBalance() + ", Transaction ID: " + emp.getTransaction_id());
        }
        return users;
    }

    @Override
    public User usersbyID(int id) throws SQLException {

        User user = new User();
        String sql = "select * from user where user_id = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();

        int userid = resultSet.getInt(1);
        String name = resultSet.getString(2);
        String username = resultSet.getString(3);
        String password = resultSet.getString(4);
        String account_type = resultSet.getString(5);
        double balance = resultSet.getDouble(6);
        String account_status = resultSet.getString(7);
        int transaction_id = resultSet.getInt(8);

        user = new User(userid, name, username, password, account_status, account_type, balance, transaction_id);
        System.out.println("ID: " + user.getUser_id() + ", Name: " + user.getName() + ", Username: " + user.getUsername() + ", Password: " + user.getPassword() +
                ", Account Status: " + user.getAccount_status() + ", Account Type: " + user.getAccount_type() +
                ", Balance: " + user.getBalance() + ", Transaction ID: " + user.getTransaction_id());
        return user;
    }
}
