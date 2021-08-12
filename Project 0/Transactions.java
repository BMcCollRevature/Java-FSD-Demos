package com.brigittemccoll;

public class Transactions {
    private int transaction_id;
    private int us_id;
    private String trans_type;
    private double amount;
    private String trans_status;


    public Transactions(){}

    public Transactions(int transaction_id, int us_id, String trans_type, double amount,String trans_status){
        this.transaction_id = transaction_id;
        this.us_id = us_id;
        this.trans_type = trans_type;
        this.amount = amount;
        this.trans_status = trans_status;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getUs_id() {
        return us_id;
    }

    public void setUs_id(int us_id) {
        this.us_id = us_id;
    }

    public String getTrans_type() {
        return trans_type;
    }

    public void setTrans_type(String trans_type) {
        this.trans_type = trans_type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTrans_status() {
        return trans_status;
    }

    public void setTrans_status(String trans_status) {
        this.trans_status = trans_status;
    }
}
