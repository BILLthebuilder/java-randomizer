import java.sql.*;
import java.util.*;

public class Payments {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    static final String DB = "payment";
    static final String DB_USER = "root";
    static final String DB_PASS = "password";
    static final Scanner scanner = new Scanner(System.in);

    public void createPayments() {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database....");
            conn = DriverManager.getConnection(DB_URL + DB, DB_USER, DB_PASS);

            System.out.println("Now inserting records to the database....");
            stmt = conn.createStatement();

            System.out.println("Enter firstname");
            String fname = scanner.next();

            System.out.println("Enter lastname");
            String lname = scanner.next();

            System.out.println("Enter phoneno");
            String phoneno = scanner.next();

            System.out.println("Enter amount");
            String amount = scanner.next();

            String sql = "INSERT into account (fname,lname,phoneno,amount) values (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, phoneno);
            ps.setString(4, amount);
            ps.executeUpdate();
            System.out.println("Finished inserting records....");

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            } // do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } // end finally try
        } // end try
        System.out.println("Goodbye!");
    }

    public static void main(String args[]) {
        Payments payment = new Payments();
        payment.createPayments();
    }
}
