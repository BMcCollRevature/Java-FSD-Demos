package com.brigittemccoll;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        boolean run = true;
        User user = new User();
        Transactions trans = new Transactions();
        Employee employee = new Employee();

        UserDAO dao = UserDAOFactory.getUserDAO();
        TransactionDAO dao1 = TransDAOFactory.getTransactionDao();
        EmployeeDAO dao2 = EmployeeDAOFactory.getEmployeeDao();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Banking App:\n");
//        //adding user
        while (run) {
            boolean begin = true;
            while (begin) {
                System.out.println("Please select from options below:");
                System.out.println("1. Create new Account");
                System.out.println("2. Customer Log in");
                System.out.println("3. Employee");
                System.out.println("4. Quit Application");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("please enter name:");
                            Scanner sc = new Scanner(System.in);
                            String name = sc.nextLine();
                        System.out.println("please create username:");
                            Scanner sc1 = new Scanner(System.in);
                            String username = sc1.nextLine();
                            user.setUsername(username);
                        System.out.println("please create password:");
                            Scanner sc4 = new Scanner(System.in);
                            String password = sc4.nextLine();

                        user.setName(name);
                        user.setUsername(username);
                        user.setPassword(password);

                        dao.addUser(user);
                        break;
                    case 2:
                        System.out.println("Please enter user id: ");
                            Scanner scanner1 = new Scanner(System.in);
                            int id = scanner1.nextInt();
                            user.setUser_id(id);
                            trans.setUs_id(id);
                        System.out.println("Please enter username: ");
                            Scanner sc2 = new Scanner(System.in);
                            String uname = sc2.nextLine();
                        System.out.println("Please enter password: ");
                            Scanner sc3 = new Scanner(System.in);
                            String pword = sc3.nextLine();
                        user.setUsername(uname);
                        user.setPassword(pword);
                        if(dao.checkUsernamePassword(user, id, uname, pword)){
                            begin = false;
                        }
                        break;
                    case 3:
                        boolean emp = true;
                        while(emp) {
                            System.out.println("Please choose from options below: ");
                            System.out.println("1. Create new Account");
                            System.out.println("2. Log in");
                            int option1 = scanner.nextInt();
                            switch (option1) {
                                case 1:
                                    System.out.println("please enter name:");
                                        Scanner sc5 = new Scanner(System.in);
                                        String name2 = sc5.nextLine();
                                    System.out.println("please create username:");
                                        Scanner sc6 = new Scanner(System.in);
                                        String username2 = sc6.nextLine();
                                    System.out.println("please create password:");
                                        Scanner sc7 = new Scanner(System.in);
                                        String password1 = sc7.nextLine();

                                    employee.setName(name2);
                                    employee.setUsername(username2);
                                    employee.setPassword(password1);

                                    dao2.addEmployee(employee);
                                    break;
                                case 2:
                                    System.out.println("Please enter user id: ");
                                        Scanner scanner2 = new Scanner(System.in);
                                        int id1 = scanner2.nextInt();
                                        employee.setEmp_id(id1);
                                    System.out.println("Please enter username: ");
                                        Scanner sc8 = new Scanner(System.in);
                                        String uname1 = sc8.nextLine();
                                    System.out.println("Please enter password: ");
                                        Scanner sc9 = new Scanner(System.in);
                                        String pword1 = sc9.nextLine();
                                    employee.setUsername(uname1);
                                    employee.setPassword(pword1);
                                    if (dao2.checkUsernamePassword(employee, id1, uname1, pword1)) {
                                        emp = false;
                                    }
                                    break;
                            }
                        }
                        boolean emp1 = true;
                        while(emp1) {
                            System.out.println("Please select from options below:");
                            System.out.println("1. Approve Customer Bank Account");
                            System.out.println("2. View Customer Bank Account");
                            System.out.println("3. View All Transactions");
                            System.out.println("4. Logout");
                            int option2 = scanner.nextInt();
                            switch(option2){
                                case 1:
                                    System.out.println("Please enter User ID:");
                                        Scanner sc5 = new Scanner(System.in);
                                        int userid = sc5.nextInt();
                                    user.setUser_id(userid);
                                    dao.usersbyID(userid);
                                    System.out.println("Approve or Reject Account:");
                                        Scanner sc6 = new Scanner(System.in);
                                        String status = sc6.nextLine();
                                        user.setAccount_status(status);
                                        dao.updateAccountStatus(user,status,userid);
                                        break;
                                case 2:
                                    System.out.println("Please enter User ID: ");
                                    Scanner sc7 = new Scanner(System.in);
                                    int userid1 = sc7.nextInt();
                                    user.setUser_id(userid1);
                                    dao.usersbyID(userid1);
                                    break;
                                case 3:
                                    System.out.println("See List of Transactions Below");
                                    dao1.gettrans();
                                    break;
                                case 4:
                                emp1 = false;
                            }
                        }
                    case 4:begin = false;
                        run = false;
                }
            }


            int option2 = 0;
            while (run) {


                System.out.println("Please select from options below:");

                System.out.println("1. Add Account");
                System.out.println("2. View Balance");
                System.out.println("3. Deposit Money");
                System.out.println("4. Withdraw Money");
                System.out.println("5. Transfer Money");
                System.out.println("6. Check for Pending Transactions");
                System.out.println("7. Quit");
                option2 = scanner.nextInt();
                switch (option2) {
                    case 1:
                        //adding account and balance
                        System.out.println("What type of account do you want (Savings or Checking):");
                        Scanner sc2 = new Scanner(System.in);
                        String account_type = sc2.nextLine();
                        System.out.println("Please enter your user id: ");
                        Scanner sc6 = new Scanner(System.in);
                        int id = sc6.nextInt();
                        user.setUser_id(id);
                        user.setAccount_type(account_type);
                        user.setBalance(500);
                        user.setAccount_status("pending");
                        dao.addAccount(user);
                        break;
                    case 2:
                        System.out.println("Please enter user id to view balance: ");
                        Scanner sc5 = new Scanner(System.in);
                        int user_id = sc5.nextInt();
                        user.setUser_id(user_id);
                        dao.viewBalance(user, user_id);
                        break;
                    case 3:
                        System.out.println("Please enter user id to start transaction:");
                        Scanner sc7 = new Scanner(System.in);
                        int userid = sc7.nextInt();
                        user.setUser_id(userid);
                        trans.setUs_id(userid);
                        double balance = dao.getBalance(user, userid);

                        System.out.println("Please enter type of the transaction (deposit, withdrawal, or transfer):");
                        Scanner sc8 = new Scanner(System.in);
                        String type = sc8.nextLine();

                        System.out.println("Please enter the amount:");
                        double amount = scanner.nextDouble();
                        trans.setTrans_type(type);
                        trans.setAmount(amount);
                        double newbal = dao1.Deposits(trans, balance);
                        user.setBalance(newbal);
                        dao.updateBalance(user);
                        break;
                    case 4:
                        System.out.println("Please enter user id to start transaction:");
                        Scanner sc9 = new Scanner(System.in);
                        int us_id = sc9.nextInt();
                        user.setUser_id(us_id);
                        trans.setUs_id(us_id);
                        double balance1 = dao.getBalance(user, us_id);

                        System.out.println("Please enter type of the transaction (deposit, withdrawal, or transfer):");
                        Scanner sc10 = new Scanner(System.in);
                        String type1 = sc10.nextLine();
                        System.out.println("Please enter the amount:");
                        double amount1 = scanner.nextDouble();
                        trans.setTrans_type(type1);
                        trans.setAmount(amount1);
                        double newbal1 = dao1.Withdrawals(trans, balance1);
                        user.setBalance(newbal1);
                        dao.updateBalance(user);
                        break;
                    case 5:        //getting info for transaction
                        System.out.println("Please enter type of Transaction (withdrawal, deposit, transfer):");
                        Scanner sc11 = new Scanner(System.in);
                        String type2 = sc11.nextLine();
                        System.out.println("Please enter in your ID:");
                        Scanner sc12 = new Scanner(System.in);
                        int id1 = sc12.nextInt();
                        System.out.println("Please enter ID of transfer:");
                        Scanner sc13 = new Scanner(System.in);
                        int id2 = sc13.nextInt();
                        System.out.println("Please enter amount of transfer:");
                        Scanner sc14 = new Scanner(System.in);
                        int amount2 = sc14.nextInt();
                        //setting up withdrawal from account 1
                        trans.setUs_id(id1);
                        user.setUser_id(id1);
                        trans.setTrans_status("pending");
                        double balance2 = dao.getBalance(user, id1);
                        trans.setTrans_type(type2);
                        trans.setAmount(amount2);
                        double nbalance = dao1.Withdrawals(trans, balance2);
                        user.setUser_id(id1);
                        user.setBalance(nbalance);
                        dao.updateBalance(user);
                        trans.setUs_id(id2);
                        user.setUser_id(id2);
                        trans.setTrans_status("pending");
                        double balance3 = dao.getBalance(user, id2);
                        double nbalance1 = dao1.Deposits(trans, balance3);
                        user.setBalance(nbalance1);
                        dao.updateBalance(user);
                        break;
                    case 6:
                        System.out.println("Please enter user id: ");
                        Scanner scanner2 = new Scanner(System.in);
                            int uid = scanner2.nextInt();
                            trans.setUs_id(uid);
                        dao1.transactionsbyUserID(uid);
                        System.out.println("Approve or Reject");
                            Scanner scanner3 = new Scanner(System.in);
                            String status = scanner3.nextLine();
                            trans.setTrans_status(status);
                        dao1.UpdateTransStatus(trans);
                        break;
                    case 7:
                        run = false;
                }
            }

        }
    }
}
