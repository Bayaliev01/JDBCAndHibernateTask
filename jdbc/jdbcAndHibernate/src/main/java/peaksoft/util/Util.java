package peaksoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String name = "postgres";
    private static final String password = "bayaliev01";
    private static final String url = "jdbc:postgresql://localhost:5432/jdbc";
    public static Connection connection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,name,password);
            System.out.println("connection success");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
