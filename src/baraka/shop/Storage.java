package baraka.shop;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Storage {

    private Connection conn;
    private String tableName;
    private final String[] colsParams;

    public Storage(Connection conn, String tableName, String[] colsParams) {
        this.conn = conn;
        this.tableName = tableName;
        this.colsParams = colsParams;
    }
    // insert innto clients ('client_name','email',password,'is_admin') values ('x','a@a.com','123',0')

    // client_name -> 'x'
    public boolean insert(String[] values) {
        if (values.length != colsParams.length) {
            throw new RuntimeException("Please check the data of values");
        }
        String colsQuery = "(";
        String valuesQuery = "(";
        for (int i = 0; i < values.length; i++) {
            colsQuery += "" + colsParams[i] + ",";
            valuesQuery += "'" + values[i] + "',";
        }
        colsQuery = colsQuery.substring(0, colsQuery.length() - 1) + ")";
        valuesQuery = valuesQuery.substring(0, valuesQuery.length() - 1) + ")";
        System.out.println("INSERT INTO " + this.tableName + colsQuery + " values " + valuesQuery);
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO " + this.tableName + colsQuery + " values " + valuesQuery);
        } catch (SQLException ex) {
            Logger.getLogger(Storage.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return true;
    }

}
