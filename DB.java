package My_Classes;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author andreea
 */
public class DB {
    
    //create a connection between the proj & mysql 
   
    private static String serverName = "localhost";
    private static String username = "root";
    private static String dbName = "toefl_exam";
    private static Integer portNumber = 3306;
    private static String pass = ""; // no password
    
    //function to create and return the connection
    public static Connection getConnection()
    {
        Connection connection = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(serverName);
        datasource.setUser(username);
        datasource.setDatabaseName(dbName);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(pass);
        
        try {
            connection = (Connection) datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return connection;
    }

    
            
}
