package com.brigittemccoll;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TransactionDAOImpl implements TransactionDAO{
    private static Statement statement = null;
    Connection connection = null;

    public TransactionDAOImpl(){
        try{
            this.connection=ConnectionFactory.getConnection();
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }
    @Override
    public double Withdrawals(Transactions trans, double balance) throws SQLException {
        String sql = "insert into transaction (user_id, transaction_type, transaction_amount, transaction_status) values (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,trans.getUs_id());
        preparedStatement.setString(2,trans.getTrans_type());
        preparedStatement.setDouble(3,trans.getAmount());
        preparedStatement.setString(4,trans.getTrans_status());
        trans.setTrans_status("pending");
        if(trans.getAmount() <= balance){
            balance-=trans.getAmount();
            System.out.println("Transaction Complete");
        }else {
            System.out.println("Insufficient Funds");
        }
        preparedStatement.executeUpdate();
        return balance;
    }

    @Override
    public double Deposits(Transactions trans, double balance) throws SQLException {
        String sql = "insert into transaction (user_id, transaction_type, transaction_amount, transaction_status) values (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,trans.getUs_id());
        preparedStatement.setString(2,trans.getTrans_type());
        preparedStatement.setDouble(3,trans.getAmount());
        preparedStatement.setString(4,trans.getTrans_status());
        trans.setTrans_status("pending");
        balance+=trans.getAmount();
        System.out.println("Transaction Complete");
        preparedStatement.executeUpdate();
        return balance;

    }

    @Override
    public void UpdateTransStatus(Transactions trans) throws SQLException {
        String sql = "update transaction set transaction_status = ? where user_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,trans.getTrans_status());
        preparedStatement.setInt(2,trans.getUs_id());
        int count = preparedStatement.executeUpdate();
        if(count >0)
            System.out.println("updated Status ");
        else
            System.out.println("Oop! Something went wrong");
    }

    @Override
    public List<Transactions> gettrans() throws SQLException {
        String sql = "select * from transaction";
        List<Transactions> trans = new ArrayList<>();
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            int user_id = resultSet.getInt(2);
            String transaction_type = resultSet.getString(3);
            double balance = resultSet.getDouble(4);
            String trans_status = resultSet.getString(5);


            Transactions transactions = new Transactions(id, user_id, transaction_type, balance, trans_status);
            trans.add(transactions);
        }
        for (Transactions emp: trans) {
            System.out.println("ID: " + emp.getTransaction_id() + ", User ID: " + emp.getUs_id() + ", Transaction Type: " + emp.getTrans_type() + ", Transaction Amount: " + emp.getAmount() +
                    ", Transaction Status: " + emp.getTrans_status());
        }
        return trans;
    }

    @Override
    public Transactions transactionsbyID(int id) throws SQLException {
        Transactions transactions = new Transactions();
        String sql = "select * from transaction where transaction_id = " + id;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();

        int transid = resultSet.getInt(1);
        int user_id = resultSet.getInt(2);
        String transaction_type = resultSet.getString(3);
        double balance = resultSet.getDouble(4);
        String trans_status = resultSet.getString(5);
        transactions = new Transactions(transid, user_id, transaction_type, balance, trans_status);
        System.out.println("ID: " + transactions.getTransaction_id() + ", User ID: " + transactions.getUs_id() + ", Transaction Type: " + transactions.getTrans_type() +
                ", Transaction Amount: " + transactions.getAmount() + ", Transaction Status: " + transactions.getTrans_status());
        return transactions;
    }

    @Override
    public List<Transactions> transactionsbyUserID(int id) throws SQLException {
        String sql = "select * from transaction where user_id = " + id;
        List<Transactions> trans = new ArrayList<>();
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            int tranid = resultSet.getInt(1);
            int user_id = resultSet.getInt(2);
            String transaction_type = resultSet.getString(3);
            double balance = resultSet.getDouble(4);
            String trans_status = resultSet.getString(5);


            Transactions transactions = new Transactions(tranid, user_id, transaction_type, balance, trans_status);
            trans.add(transactions);
        }
        for (Transactions emp: trans) {
            System.out.println("ID: " + emp.getTransaction_id() + ", User ID: " + emp.getUs_id() + ", Transaction Type: " + emp.getTrans_type() + ", Transaction Amount: " + emp.getAmount() +
                    ", Transaction Status: " + emp.getTrans_status());
        }
        return trans;
    }
}
