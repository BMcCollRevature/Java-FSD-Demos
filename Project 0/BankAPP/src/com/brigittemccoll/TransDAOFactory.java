package com.brigittemccoll;

public class TransDAOFactory {
    private static TransactionDAO dao1;

    private TransDAOFactory(){}

    public static TransactionDAO getTransactionDao(){
        if(dao1 == null)
            dao1 = new TransactionDAOImpl();
        return dao1;
    }
}
