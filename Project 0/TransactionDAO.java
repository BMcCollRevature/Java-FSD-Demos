package com.brigittemccoll;

import java.sql.SQLException;
import java.util.List;

public interface TransactionDAO {
    double Withdrawals(Transactions trans, double balance) throws SQLException;
    double Deposits(Transactions trans, double balance) throws SQLException;
    void UpdateTransStatus(Transactions trans) throws SQLException;
    List<Transactions> gettrans() throws SQLException;
    Transactions transactionsbyID(int id) throws SQLException;
    List<Transactions> transactionsbyUserID(int id) throws SQLException;
}
