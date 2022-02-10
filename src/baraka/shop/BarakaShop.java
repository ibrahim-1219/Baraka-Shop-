package baraka.shop;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BarakaShop {

    static Connection c;
    static Statement state;
    static String query;
    static PreparedStatement ss;

    public static void main(String[] args) {
        
            new Flow().startFlow();
    }

}
