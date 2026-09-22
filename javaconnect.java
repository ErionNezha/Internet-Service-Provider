import java.sql.*;
import java.sql.DriverManager;




public class javaconnect {
    Connection conn;
    public static java.sql.Connection ConnecrDb(){
        try{


            // TODO: configure your own database credentials here
            String url = "jdbc:mysql://localhost:3306/isp";
            String user = "YOUR_DB_USER";
            String password = "YOUR_DB_PASSWORD";
            java.sql.Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch(Exception e){


        }
        return null;
    }
}
