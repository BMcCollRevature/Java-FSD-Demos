package com.brigittemccoll;

import java.sql.SQLException;

public interface EmployeeDAO {
    void addEmployee(Employee employee) throws SQLException;
    boolean checkUsernamePassword(Employee employee, int id, String username, String password) throws SQLException;
}
