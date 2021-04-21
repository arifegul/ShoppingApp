package shopping_app;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    
    private static Log instance;
    private static Connection connection;
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "users<_db";
    private static Integer portnumber = 3306;
    private static String password = "";
    
    
    public static Connection getConnection() {
        
        Connection con = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            con = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection -> " + Log.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return con;
    }

    public static Log getInstance(){
        try {
            if (instance == null) {
                instance = new Log();
            } else if (instance.getConnection().isClosed()) {
                instance = new Log();
            }
            return instance;
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return instance;
    }

}
