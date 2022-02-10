
package baraka.shop;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;



public class DbConnection {

    private static final String URI = "jdbc:mysql://localhost/Baraka Shop";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection conn = null;

    public static Connection connect() {
        if (conn != null) {
            return DbConnection.conn;
        }
        try {
            DbConnection.conn = DriverManager.getConnection(URI, USERNAME, PASSWORD); 
        } catch (SQLException ex) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DbConnection.conn;
    }
}
