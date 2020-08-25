package dbgrants;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Scanner;

public class Account extends Component {
    String databaseUrl;
    String userName;
    String password;
    Connection connection;


    /**
     *
     * @param databaseUrl
     * @param userName
     * @param password
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Account(String databaseUrl, String userName, String password) throws ClassNotFoundException, SQLException {
        this.databaseUrl = databaseUrl;
        this.userName = userName;
        this.password = password;
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(this.databaseUrl, this.userName, this.password);
    }


    /**
     * Get the amount in the account
     * @return resultSet
     * @throws SQLException
     */
    public ResultSet readAccountBalance() throws SQLException {
        try {
            String query = "SELECT * FROM transactions";
            PreparedStatement statement = this.connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        }catch (SQLException sqlException){
            System.out.println("ERROR CONNECTING TO THE DATABASE!");
            System.out.println(sqlException.getMessage());
        }
        return null;
    }

    /**
     *
     * @throws SQLException
     */
    public void checkDetails() throws SQLException {
        ResultSet resultSet = this.readAccountBalance();
        System.out.println("TransId"+"\t\t"+"Firstname"+"\t\t"+"LastName"+"\t\t"+"Account_Number"+"\t\t"+"Amount"+"\t\t");
        try{
            while(resultSet.next()){
                int transactionId  = resultSet.getInt("transaction_id");
                String firstname = resultSet.getString("firstname");
                String 	lastname = resultSet.getString("lastname");
                String account_no = resultSet.getString("account_no");
                Double amount = resultSet.getDouble("amount");
                System.out.println(transactionId+"\t\t\t" + firstname+"\t\t\t"+lastname+"\t\t\t"+account_no+"\t\t\t"+amount+"\t\t\t");
            }
        }catch(SQLException sqlException){
            JOptionPane.showMessageDialog(this, "UNABLE TO FETCH ACCOUNT DETAILS", "ACCOUNT FETCHING", JOptionPane.WARNING_MESSAGE);
            System.out.println(sqlException.getMessage());
        }

    }




    /**
     *
     * @param firstName
     * @param lastName
     * @param accountNumber
     * @param amount
     * @return
     * @throws SQLException
     */
    public boolean createAccount(String firstName, String lastName, String accountNumber, String amount) throws SQLException {
        boolean updateStatus = false;
        double amt = Double.valueOf(amount);
        try {
            String insertQuery = "INSERT INTO transactions (firstname, lastname, account_no, amount) VALUES (?,?,?,?)";
            PreparedStatement statement = this.connection.prepareStatement(insertQuery);
            this.connection.setAutoCommit(false);
            this.connection.commit();
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, accountNumber);
            statement.setDouble(4, amt);
            int rows = statement.executeUpdate();
            if(rows > 0){
                JOptionPane.showMessageDialog(this, "ACCOUNT CREATED SUCCESSFULLY", "ACCOUNT CREATION", JOptionPane.INFORMATION_MESSAGE);
            }
            this.connection.setAutoCommit(true);
        }catch (SQLException sqlException){
            JOptionPane.showMessageDialog(this, "ACCOUNT CREATION FAILED", "ACCOUNT CREATION", JOptionPane.WARNING_MESSAGE);
            System.out.println(sqlException.getMessage());
        }
        return true;
    }



}
