import java.sql.*;
import java.util.Scanner;

public class FundsHomework {
    String databaseUrl;
    String userName;
    String password;
    Connection connection;

    public FundsHomework(String databaseUrl, String userName, String password) throws ClassNotFoundException, SQLException {
        this.databaseUrl = databaseUrl;
        this.userName = userName;
        this.password = password;
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection(this.databaseUrl, this.userName, this.password);
    }

    public void withdraw() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number :");
        String phoneNumber = scanner.next();
        System.out.print("Enter your amount to withdraw :");
        int amount = scanner.nextInt();

        String query = "SELECT AMOUNT FROM account WHERE PHONENO = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.setString(1, phoneNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        int newBalance = 0, balance = 0;
        boolean update = false;
        while (resultSet.next()) {
            balance = resultSet.getInt("AMOUNT");
            if (amount > balance)
                System.out.println("CAN'T MAKE THE WITHDRAWAL..");
            else {
                newBalance = balance - amount;
                update = true;
            }
        }
        if (update) {
            String updateQuery = "UPDATE account SET AMOUNT = ? where  PHONENO = ?";
            PreparedStatement statement = this.connection.prepareStatement(updateQuery);
            statement.setInt(1, newBalance);
            statement.setString(2, phoneNumber);
            statement.executeUpdate();
        }
    }

    public void deposit() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number :");
        String phoneNumber = scanner.next();
        System.out.print("Enter your amount to deposit :");
        int amount = scanner.nextInt();

        String query = "SELECT AMOUNT FROM account WHERE PHONENO = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.setString(1, phoneNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        int balance = 0, newBalance = 0;
        while (resultSet.next()) {
            balance = resultSet.getInt("AMOUNT");
        }
        newBalance = balance + amount;
        String updateQuery = "UPDATE account SET AMOUNT = ? where  PHONENO = ?";
        PreparedStatement statement = this.connection.prepareStatement(updateQuery);
        statement.setInt(1, newBalance);
        statement.setString(2, phoneNumber);
        statement.executeUpdate();
    }

    public void checkBalance() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number :");
        String phoneNumber = scanner.next();
        String query = "SELECT AMOUNT FROM account WHERE PHONENO = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.setString(1, phoneNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        int balance = 0, newBalance = 0;
        while (resultSet.next()) {
            balance = resultSet.getInt("AMOUNT");
            System.out.println("The account balance is: " + balance);
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        FundsHomework main = new FundsHomework("jdbc:mysql://localhost:3306/payment", "root", "password1234");
        //main.withdraw();
        //main.deposit();
        main.checkBalance();
    }
}
