package Niveau3_persistens;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {
    public static Connection getConnection() {
        Connection connection = null;
        String url = "jdbc:mysql://localhost/forsoeg?\" + \"autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "Jasamlegenda7@";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
