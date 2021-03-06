import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionManager {
    private static final String USER = "root";
    private static final String PASSWORD = "orest0306";
    private static final String URL = "jdbc:mysql://localhost:3306/house_rent?useSSL=false";
    private static Connection connection = null;


    private ConnectionManager() {

    }

    public static Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URL, USER,
                        PASSWORD);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }
    }
}
