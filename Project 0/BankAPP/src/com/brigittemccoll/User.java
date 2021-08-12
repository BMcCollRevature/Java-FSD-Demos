package com.brigittemccoll;

public class User {
    private int user_id;
    private String name;
    private String username;
    private String password;
    private String account_type;
    private String account_status;
    private double balance;
    private int transaction_id;

    public User(){}

    public User(int user_id, String name, String username, String password, String account_status, String account_type,
                double balance, int transaction_id){
        this.user_id = user_id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.account_status = account_status;
        this.account_type = account_type;
        this.balance = balance;
        this.transaction_id = transaction_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {this.account_type = account_type;}

    public String getAccount_status() {
        return account_status;
    }

    public void setAccount_status(String account_status) {
        this.account_status = account_status;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }
}
