package com.brigittemccoll;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
    void addUser(User user) throws SQLException;
    void addAccount(User user) throws SQLException;
    void viewBalance(User user, int id) throws SQLException;
    double getBalance(User user, int id) throws SQLException;
    void updateBalance(User user) throws SQLException;
    void updateAccountStatus(User user, String status, int id) throws SQLException;
    boolean checkUsernamePassword(User user, int id, String username, String password) throws SQLException;
    List<User> getUsers()throws SQLException;
    User usersbyID(int id) throws SQLException;
}
