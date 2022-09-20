import java.sql.DriverManager;
public class Connect {

        public static Connect getConnection(){
            Connect connect = null;
            String url = "jdbc:mysql://localhost:3306/"; //database name
            String user = "root";
            String password = "FRedag01";
            try{
                connect = (Connect) DriverManager.getConnection(url, user, password);
            }catch (Exception e){
                e.printStackTrace();
            }
            return connect;
        }
}
