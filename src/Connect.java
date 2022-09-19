import java.sql.DriverManager;

public class Connect
{
    public static Connect getConnection() {
        Connect connection = null;
        String url = "jdbc:mysql://localhost:3306/demodb?serverTimezone=CET&useSSL=false";
        String user = "root";
        String password = "Ysr5123mqr";
        try {
//            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
