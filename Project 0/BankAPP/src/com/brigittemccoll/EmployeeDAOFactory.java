package com.brigittemccoll;

public class EmployeeDAOFactory {
        private static EmployeeDAO dao2;

        private EmployeeDAOFactory(){}

        public static EmployeeDAO getEmployeeDao(){
            if(dao2 == null)
                dao2 = new EmployeeDAOImpl();
            return dao2;
        }

}
