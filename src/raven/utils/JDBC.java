
package raven.utils;

import java.sql.Connection;
import java.sql.SQLException;


public class JDBC {
    private static JDBC instance;
    private Connection connection;

    public static JDBC getJdbc() {
        if(instance == null){
            instance = new JDBC();
        }
        return instance;
    }

    public JDBC() {
    }
    
    public void connectToDatabase() throws SQLException {
        String server = "localhost";
        String database = "TestTravels";
        String userName = "sa";
        String password = "123";
        connection = java.sql.DriverManager.getConnection("jdbc:sqlserver://" + server + ";databaseName=" + database, userName, password);
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void setConnection(Connection connection){
        this.connection = connection;
    }
    
    
}
