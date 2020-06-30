import java.sql.*;

public class ExampleSql {
    public static void main(String args[]) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/";
        String mydatabase ="crypsolc_chamasmart";
        String username = "root";
        String password = "password";
        Connection conn = DriverManager.getConnection(url + mydatabase, username, password);
        Statement stmt = conn.createStatement();
        ResultSet myResultSet = stmt.executeQuery("select * from academy");
        while (myResultSet.next()) {
            String name = myResultSet.getString(1);
            String owner = myResultSet.getString(2);
            String species = myResultSet.getString(3);
            String birth = myResultSet.getString(4);
            String death = myResultSet.getString(5);
            System.out.println("name" + "\t" + " " + name +"\t"+ owner + "\t" + species + "\t" + birth + "\t" + death
                    + "\t");
        }
        stmt.close();
        conn.close();
    }
}
