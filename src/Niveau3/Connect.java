package Niveau3;

import java.sql.DriverManager;

public class Connect
{
    public static Connect getConnection() {
        Connect connect = null;
        String url = "jdbc:mysql://localhost:3306/demodb?serverTimezone=CET&useSSL=false";
        String user = "root";
        String password = "Ysr5123mqr";
        try {
            connect = (Connect) DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connect;
    }
}
