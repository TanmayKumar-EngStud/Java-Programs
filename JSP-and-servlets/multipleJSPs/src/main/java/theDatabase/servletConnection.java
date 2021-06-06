package theDatabase;
import java.sql.*;
import java.sql.DriverManager;


public class servletConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/ApplicationForm";

    static final String USER = "root";
    static final String PASS = "welcome123";


    Connection conn = null;
    Statement stmt = null;

    String sql1 ="";
    public void getConnection() {
        try {
            // Register JDBC driver
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            //Opening the connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query
            System.out.println("Creating Statement...");
            stmt = conn.createStatement();
        } catch (SQLException se) {
            System.out.println("Error : " + se);
        }
    }

    public Boolean getVerification(String email, String password) {

        try {
            sql1 = "Select * From USER where email = \"" + email
                    + " \" and password = \"" + password + "\"";

            System.out.println("\n" + sql1);

            ResultSet rs = stmt.executeQuery(sql1);

            if (rs.next()) {
                return true;
            }
            rs.close();
            stmt.close();
            conn.close();
            return false;
        } catch (SQLException se) {
            System.out.println("Error occured:  " + se);
        } catch (Exception e) {
            System.out.print("Exception e raised");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
                try {
                    if (stmt != null) {
                        conn.close();
                    }
                } catch (SQLException se) {
                    se.printStackTrace();
                }

            }
            System.out.println("closing DB Connection = Goodbye!!");
        }
        return false;
    }
}
